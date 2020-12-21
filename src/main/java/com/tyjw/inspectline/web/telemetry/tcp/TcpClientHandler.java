package com.tyjw.inspectline.web.telemetry.tcp;

import com.tyjw.inspectline.web.telemetry.common.ByteModel;
import com.tyjw.inspectline.web.telemetry.common.TelemetryDataPB;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import lombok.extern.slf4j.Slf4j;

import static com.tyjw.inspectline.web.queue.ProducerService.sendPosition;
import static com.tyjw.inspectline.web.telemetry.TcpClient.userId;
import static com.tyjw.inspectline.web.telemetry.TcpClient.utoken;

/**********************************
 * @Author YSW
 * @Description
 * @Date 2020.12.16 - 10:01
 **********************************/

@Slf4j
public class TcpClientHandler extends SimpleChannelInboundHandler<byte[]> {

	private String boxSn;
	private int taskId;

	public TcpClientHandler(String boxSn,int taskId){
		this.boxSn = boxSn;
		this.taskId = taskId;
	}

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, byte[] bytes) throws Exception {
		try {
			String cmdNum = "("+boxSn+") : ";
			switch (bytes[0] & 0xFF) {
				case 0x01: {
					if (bytes[1] == 0x01) {
						log.debug("{}Successful Registered！",cmdNum);
						ByteBuf buffer = Unpooled.buffer();
						buffer.writeByte(0x03);
						buffer.writeBytes(boxSn.getBytes());
						byte[] newBytes = new byte[buffer.readableBytes()];
						buffer.readBytes(newBytes);
						ctx.channel().writeAndFlush(newBytes);
						buffer.release();
					}
				}
				break;
				case 0x02: {
					log.debug("{}HeartBeat...",cmdNum);
				}
				break;
				case 0x03: {
					log.debug("{}Subscribe Response Success!",cmdNum);
				}
				break;
				case 0xA1: {
					byte[] newBytes = new byte[bytes.length - 2];
					System.arraycopy(bytes, 2, newBytes, 0, bytes.length - 2);
				}
				break;
				case 0xA9: {
					byte[] newBytes = new byte[bytes.length - 2];
					System.arraycopy(bytes, 2, newBytes, 0, bytes.length - 2);
					log.debug("{} telemetryMessage -> " + ByteModel.bytes2HexString(newBytes),cmdNum);
					TelemetryDataPB.TelemetryData telemetryData = TelemetryDataPB.TelemetryData.parseFrom(newBytes);
					com.tyjw.inspectline.entity.projo.WotianyuTelemetryList.DataList.Data.Builder builder = com.tyjw.inspectline.entity.projo.WotianyuTelemetryList.DataList.Data.newBuilder();
					builder.setTaskId(taskId);
					builder.setUavId(taskId);
					builder.setMissionComputerId(taskId);
					builder.setUavName("TY-1");
					builder.setLatitude(telemetryData.getLat());
					builder.setLongitude(telemetryData.getLng());
					builder.setPitch(telemetryData.getPitch());
					builder.setRoll(telemetryData.getRoll());
					builder.setYaw(telemetryData.getYaw());
					builder.setUltrasonicHeight(telemetryData.getUltrasonic());
					builder.setAltitudeHeight(telemetryData.getAltitude());
					builder.setAirspeed(telemetryData.getAirspeed());
					builder.setVelocity(telemetryData.getVelocity());
					builder.setTimestamps(telemetryData.getTimestamp());
					com.tyjw.inspectline.entity.projo.WotianyuTelemetryList.DataList.Data data = builder.build();
					sendPosition(data);
				}
				break;
				default: {
				}
			}
		} catch (Exception e){
			e.printStackTrace();
			log.debug("云盒数据异常！");
		}
	}

	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		ByteBuf buffer = Unpooled.buffer();
		buffer.writeByte(0x01);
		buffer.writeInt(Integer.parseInt(userId));
		buffer.writeBytes(utoken.getBytes());
		byte[] bytes = new byte[buffer.readableBytes()];
		buffer.readBytes(bytes);
		ctx.channel().writeAndFlush(bytes);
		buffer.release();
	}

	@Override
	public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
		if (evt instanceof IdleStateEvent) {
			IdleState state = ((IdleStateEvent) evt).state();
			if (state == IdleState.WRITER_IDLE) {
				ByteBuf buffer = Unpooled.buffer();
				buffer.writeByte(0x02);
				buffer.writeLong(System.currentTimeMillis());
				byte[] bytes = new byte[buffer.readableBytes()];
				buffer.readBytes(bytes);
				ctx.channel().writeAndFlush(bytes);
				buffer.release();
			}
		}
	}

	@Override
	public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
		ctx.channel().close();
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		ctx.channel().close();
	}
}
