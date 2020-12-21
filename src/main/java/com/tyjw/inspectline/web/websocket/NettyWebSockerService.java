package com.tyjw.inspectline.web.websocket;

import com.alibaba.fastjson.JSONObject;
import com.tyjw.inspectline.common.Constants;
import com.tyjw.inspectline.entity.model.UserDO;
import com.tyjw.inspectline.entity.pojo.WebSocketInfo;
import com.tyjw.inspectline.redis.service.RedisService;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketFrame;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service("nettyWebSockerService")
public class NettyWebSockerService extends HeartBeatHandler {
    @Autowired
    private RedisService redisService;
    @Autowired
    private Constants constants;

    public void analysisType(ChannelHandlerContext ctx, WebSocketFrame frame) {
        String data = ((TextWebSocketFrame) frame).text();
        JSONObject obj = JSONObject.parseObject(data);
        Integer type = Integer.valueOf(obj.getString("type"));
        switch (type) {
            case 1://登录注册
                register(ctx, obj);
                break;
            case 2://心跳
                heartBeat(ctx, obj);
                break;
            case 3://遥测
                reciveLiveData(ctx, obj);
                break;
            default:
                break;
        }

    }

    /**
     * 注册
     * @param ctx
     * @param obj
     */
    public void register(ChannelHandlerContext ctx, JSONObject obj) {
        WebSocketInfo webSocketInfo = new WebSocketInfo();
        String userId = obj.getString("userId");
        String cookie = obj.getString("token");
        //需要验证token
        String token = null;
        UserDO loginUser = (UserDO) redisService.get(constants.REDIS_LOGIN_USER_KEY+userId);
        String projectId = loginUser.getProjectId().toString();//项目id
        if (null!=loginUser)
            token  = loginUser.getToken();
        if (userId == null || cookie == null || token == null || !cookie.equals(token)) {
            webSocketInfo.setState(1);
            webSocketInfo.setMessage("websocket注册失败！");
            webSocketInfo.setType(1);
            closeClient(ctx);
        } else {
            //关闭重复id的链接
            Collection<ChannelObj> iterator = MessageUtils.CHANNEL_MAP.values();
            for (ChannelObj channelObj : iterator) {
                ChannelHandlerContext context = channelObj.getCtx();
                Channel channel = context.channel();
                String socketUid = channelObj.getUserId();
                if (channel.isActive() && userId.equals(socketUid)) {
                    InetSocketAddress ipSocket = (InetSocketAddress)channel.remoteAddress();
                    String clientIp = ipSocket.getAddress().getHostAddress();
                    log.info("关闭重复channel的id为：{}，用户id：{}，客户端ip地址：{},端口：{}",channel.id(),userId,clientIp,ipSocket.getPort());
                    webSocketInfo.setType(6);
                    String replyMessage = JSONObject.toJSONString(webSocketInfo);
                    TextWebSocketFrame tws = new TextWebSocketFrame(replyMessage);
                    try {
                        channel.writeAndFlush(tws).await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    closeClient(context);
                    break;
                }
            }
            MessageUtils.CHANNEL_MAP.put(ctx.channel().id(), new ChannelObj(ctx.channel().id(), ctx, userId, token,projectId));
            webSocketInfo.setState(200);
            webSocketInfo.setMessage("websocket连接成功！");
            webSocketInfo.setType(1);
            Map<String, String> map = new HashMap<String, String>();
            map.put("userId", userId);
            map.put("token", token);
            webSocketInfo.setReturnData(map);
            InetSocketAddress newIpSocket = (InetSocketAddress)ctx.channel().remoteAddress();
            log.info("客户端与服务端连接[开启],channel的id为：{},用户id：{}，客户端ip地址：{},端口：{}",ctx.channel().id(),userId,newIpSocket.getAddress().getHostAddress(),newIpSocket.getPort());
        }
        String replyMessage = JSONObject.toJSONString(webSocketInfo);
        TextWebSocketFrame tws = new TextWebSocketFrame(replyMessage);
        try {
            ctx.channel().writeAndFlush(tws).await();
        } catch (InterruptedException e) {
            e.printStackTrace();
            e.printStackTrace();
        }
    }

    /**
     * 心跳
     * @param ctx
     * @param obj
     */
    public void heartBeat(ChannelHandlerContext ctx, JSONObject obj) {
//        log.info("接到web心跳数据：{}", obj.toJSONString());
//        log.info("接到web心跳数据,channel的id为：[{}]", ctx.channel().id());
        WebSocketInfo webSocketInfo = new WebSocketInfo();
        webSocketInfo.setState(200);
        webSocketInfo.setMessage("心跳");
        webSocketInfo.setType(2);
        Map<String, String> map = new HashMap<String, String>();
        map.put("userId", obj.getString("userId"));
        webSocketInfo.setReturnData(map);
        String replyMessage = JSONObject.toJSONString(webSocketInfo);
        TextWebSocketFrame tws = new TextWebSocketFrame(replyMessage);
        try {
            ctx.channel().writeAndFlush(tws).await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 遥测注册包
     * @param ctx
     * @param obj
     */
    private void reciveLiveData(ChannelHandlerContext ctx, JSONObject obj) {
        String planId = obj.getString("planId");
        log.info("获取任务{}遥测数据", planId);
        ChannelObj channelObj = MessageUtils.CHANNEL_MAP.get(ctx.channel().id());
        channelObj.setPlanId(planId);
        MessageUtils.CHANNEL_MAP.replace(ctx.channel().id(), channelObj);
        WebSocketInfo webSocketInfo = new WebSocketInfo();
        webSocketInfo.setState(200);
        webSocketInfo.setMessage("遥测注册包");
        webSocketInfo.setType(3);
        Map<String, String> map = new HashMap<String, String>();
        map.put("planId", planId);
        webSocketInfo.setReturnData(map);
        String replyMessage = JSONObject.toJSONString(webSocketInfo);
        TextWebSocketFrame tws = new TextWebSocketFrame(replyMessage);
        try {
            ctx.channel().writeAndFlush(tws).await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 断开连接
     * @param ctx
     */
    private void closeClient(ChannelHandlerContext ctx){
        ctx.close();
        MessageUtils.CHANNEL_MAP.remove(ctx.channel().id());
    }


}
