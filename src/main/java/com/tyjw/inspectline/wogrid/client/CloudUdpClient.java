package com.tyjw.inspectline.wogrid.client;

import com.tyjw.inspectline.common.Constants;
import com.tyjw.inspectline.entity.projo.WotianyuTelemetryList;
import com.tyjw.inspectline.web.configuration.ApplicationContextProvider;
import com.tyjw.inspectline.web.queue.ProducerService;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.channel.nio.AbstractNioChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.DatagramPacket;
import io.netty.channel.socket.nio.NioDatagramChannel;
import io.netty.handler.codec.DatagramPacketDecoder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.net.InetSocketAddress;
import java.util.Timer;
import java.util.TimerTask;

@Data
@Slf4j
public class CloudUdpClient extends Thread {
    private static ProducerService producerService;

    private static Constants constants;

    static {
        constants = (Constants) ApplicationContextProvider.getBean("constants");//替换成自己的service层
        producerService = (ProducerService) ApplicationContextProvider.getBean("producerService");//替换成自己的service层
    }

    private InetSocketAddress address = new InetSocketAddress(constants.WTY_TELEMETRY_PUSH_HOST, constants.WTY_TELEMETRY_PUSH_PORT);
    //    private InetSocketAddress address = new InetSocketAddress("track.wogrid.com", 56010);
    private int taskId;//任务编号
    private int userId;//用户编号
    private String utoken;//用户token

    private Channel channel;
    private Timer times;


    public CloudUdpClient() {

    }

    public CloudUdpClient(int taskId, int userId, String token) {
        this.taskId = taskId;
        this.userId = userId;
        this.utoken = token;
    }


    @Override
    public void run() {
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(group)
                    .channel(NioDatagramChannel.class)
                    .option(ChannelOption.SO_BROADCAST, true)
                    .option(ChannelOption.SO_RCVBUF, 512)
                    .option(ChannelOption.SO_SNDBUF, 512)

                    .handler(new ChannelInitializer<AbstractNioChannel>() {
                        @Override
                        protected void initChannel(AbstractNioChannel ch) throws Exception {
                            ChannelPipeline pipeline = ch.pipeline();
                            //pipeline.addLast(new IdleStateHandler(5, 5, 7, TimeUnit.SECONDS));
                            pipeline.addLast("decoder", new DatagramPacketDecoder(new CloudMessageDecoder()));
                            //pipeline.addLast("encoder",new DatagramPacketEncoder<CloudMessage>(new CloudMessageEncoder()));

                            pipeline.addLast(new SimpleChannelInboundHandler<CloudMessage>() {

                                @Override
                                protected void channelRead0(ChannelHandlerContext ctx, CloudMessage msg) throws Exception {
                                    log.info("------------------------{}", msg.toString());
                                    switch (msg.getDataType()) {
                                        case 1811://登录回复
                                            if (msg.getState() == 1)
                                                startHeartbeat();
                                            else
                                                closeChannel();
                                            break;
                                        case 1812://服务器要求重新鉴权
                                            log.info("服务器要求重新鉴权");
                                            login();
                                            break;
                                        case 1352://心跳回复
//                                            log.info("心跳回复");
                                            break;
                                        case 1880://遥测数据
											sendTrack(msg.getData());
                                            break;
                                        default:
                                            break;
                                    }
                                }

                                @Override
                                public void channelActive(ChannelHandlerContext ctx) throws Exception {
                                    super.channelActive(ctx);
                                    login();
                                }
                            });
                        }

                    });

//            ChannelFuture f = bootstrap.bind(20002).sync();
            ChannelFuture f = bootstrap.bind(0).sync();
            channel = f.channel();
            f.channel().closeFuture().await();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            group.shutdownGracefully();
        }
    }


    public void closeChannel() {
        log.info("与wty断开连接");
        channel.close();
    }


    //向队列推送遥测数据
    private void sendTrack(byte[] data) {
        try {
            LiveTrack.Data track = LiveTrack.Data.parseFrom(data);
            log.info("UDP接收WTY遥测数据：{}", data.toString());
            WotianyuTelemetryList.DataList.Data.Builder builder = WotianyuTelemetryList.DataList.Data.newBuilder();
            builder.setAirspeed(track.getAirspeed());
            builder.setAltitudeHeight(track.getAltitudeHeight());
            builder.setLatitude(track.getLatitude());
            builder.setLongitude(track.getLongitude());
            builder.setPitch(track.getPitch());
            builder.setTaskId(track.getTaskId());
            builder.setRoll(track.getRoll());
            builder.setTimestamps(track.getTimestamps());
            builder.setUavId(track.getUavId());
            builder.setUavName(track.getUavName());
            builder.setUltrasonicHeight(track.getUltrasonicHeight());
            builder.setVelocity(track.getVelocity());
            builder.setYaw(track.getYaw());
            // 向quene队列推送数据
            producerService.sendPosition(builder.build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void send(CloudMessage msg) {
        ByteBuf sendBuf = Unpooled.buffer();
        sendBuf.writeShort((short) msg.getHead());
        sendBuf.writeByte(msg.getVersion());
        sendBuf.writeByte(msg.getCommType());
        sendBuf.writeShort(msg.getDataType());
        sendBuf.writeByte(msg.getClientType());
        sendBuf.writeInt(msg.getUserId());
        sendBuf.writeInt(msg.getTaskId());
        sendBuf.writeShort(msg.getState());
        sendBuf.writeShort(msg.getData().length);
        sendBuf.writeBytes(msg.getData());
        channel.writeAndFlush(new DatagramPacket(sendBuf, address));
    }


    //登录服务器
    private void login() {
        log.info("注册操作：userId:{},taskId:{},token:{}", userId, taskId, utoken);
        CloudMessage msg = new CloudMessage();
        msg.setDataType((short) 1810);
        msg.setClientType((byte) 5);
        msg.setUserId(userId);
        msg.setTaskId(taskId);
        msg.setData(utoken.getBytes());
        send(msg);
    }


    //定时发送心跳
    private void startHeartbeat() {
        if (times == null) {
            times = new Timer();
            times.schedule(new TimerTask() {

                @Override
                public void run() {
//                    log.info("定时发送心跳-->wty");
                    CloudMessage cm = new CloudMessage();
                    cm.setDataType((short) 1351);
                    cm.setUserId(userId);
                    cm.setTaskId(taskId);
                    cm.setData(new byte[0]);
                    send(cm);
                }
            }, 5000, 5000);
        }
    }


    public static void main(String[] agr) {
        int uid = 13;
        String token = "4b48f6f2-89a2-476d-92e6-1200dfb03730";
        CloudUdpClient cc = new CloudUdpClient(1119, uid, token);
        cc.start();

    }
}
