package com.tyjw.inspectline.web.websocket;

import com.alibaba.fastjson.JSONObject;
import com.tyjw.inspectline.common.Global;
import com.tyjw.inspectline.entity.pojo.WebSocketInfo;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.handler.codec.http.*;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker;
import io.netty.handler.codec.http.websocketx.WebSocketServerHandshakerFactory;
import io.netty.util.AttributeKey;
import io.netty.util.CharsetUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@Slf4j
public class MessageUtils {

    //用户连接map
    public static Map<ChannelId, ChannelObj> CHANNEL_MAP = new ConcurrentHashMap<>();

    /**
     * 发送文本信息
     *
     * @param sendUid 用户id
     * @param type    消息类型
     * @param data    数据
     */
    public static void sendTextMessageByUid(String sendUid, Integer type, Object data) {
        Global.THREAD_POOL.execute(new Thread(() -> {
            try {
                WebSocketInfo webSocketInfo = new WebSocketInfo();
                webSocketInfo.setState(200);
                webSocketInfo.setMessage("success！");
                webSocketInfo.setType(type);
                webSocketInfo.setReturnData(data);
                String replyMessage = JSONObject.toJSONString(webSocketInfo);
                TextWebSocketFrame tws = new TextWebSocketFrame(replyMessage);
                Iterator<Map.Entry<ChannelId, ChannelObj>> iterator = MessageUtils.CHANNEL_MAP.entrySet().iterator();
                while (iterator.hasNext()) {
                    ChannelObj channelObj = iterator.next().getValue();
                    Channel channel = channelObj.getCtx().channel();
                    String userId = channelObj.getUserId();
                    if (channel.isActive() && StringUtils.isNotBlank(userId) && sendUid.equals(userId)) {
                        try {
                            channel.writeAndFlush(tws).await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            e.printStackTrace();
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                log.error("发送消息异常了");
            }
        }));
    }

    public static void sendTextMessageToMore(List<String> ids, Integer type, Object data) {
        Global.THREAD_POOL.execute(new Thread(() -> {
            WebSocketInfo webSocketInfo = new WebSocketInfo();
            webSocketInfo.setState(200);
            webSocketInfo.setMessage("success！");
            webSocketInfo.setType(type);
            webSocketInfo.setReturnData(data);
            String replyMessage = JSONObject.toJSONString(webSocketInfo);
            TextWebSocketFrame tws = new TextWebSocketFrame(replyMessage);
            Iterator<Map.Entry<ChannelId, ChannelObj>> iterator = MessageUtils.CHANNEL_MAP.entrySet().iterator();
            while (iterator.hasNext()) {
                ChannelObj channelObj = iterator.next().getValue();
                Channel channel = channelObj.getCtx().channel();
                String userId = channelObj.getUserId();
                if (channel.isActive() && StringUtils.isNotBlank(userId) && ids.contains(userId)) {
                    try {
                        channel.writeAndFlush(tws).await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        e.printStackTrace();
                    }
                }
            }
        }));
    }


    public static void sendTextMessageToAll(Integer type, Object data) {
        Global.THREAD_POOL.execute(new Thread(() -> {
            log.info("开始群发发送消息了");
            WebSocketInfo webSocketInfo = new WebSocketInfo();
            webSocketInfo.setState(200);
            webSocketInfo.setMessage("success！");
            webSocketInfo.setType(type);
            webSocketInfo.setReturnData(data);
            String replyMessage = JSONObject.toJSONString(webSocketInfo);
            TextWebSocketFrame tws = new TextWebSocketFrame(replyMessage);
            Iterator<Map.Entry<ChannelId, ChannelObj>> iterator = MessageUtils.CHANNEL_MAP.entrySet().iterator();
            while (iterator.hasNext()) {
                ChannelObj channelObj = iterator.next().getValue();
                Channel channel = channelObj.getCtx().channel();
                String userId = channelObj.getUserId();
                if (channel.isActive() && StringUtils.isNotBlank(userId)) {
                    try {
                        channel.writeAndFlush(tws).await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        e.printStackTrace();
                    }
                }
            }
        }));
    }

    // websocket响应请求
    @SuppressWarnings("deprecation")
    public static void sendHttpResponse(ChannelHandlerContext ctx, FullHttpRequest req, DefaultFullHttpResponse res) {
        // 返回应答给客户端
        if (res.getStatus().code() != 200) {
            ByteBuf buf = Unpooled.copiedBuffer(res.getStatus().toString(), CharsetUtil.UTF_8);
            res.content().writeBytes(buf);
            buf.release();
        }
        // 如果是非Keep-Alive，关闭连接
        ChannelFuture f = ctx.channel().writeAndFlush(res);
        if (!HttpHeaders.isKeepAlive(req) || res.getStatus().code() != 200) {
            f.addListener(ChannelFutureListener.CLOSE);
        }
    }

    @SuppressWarnings("deprecation")
    public static WebSocketServerHandshaker handleHttpRequest(ChannelHandlerContext ctx, FullHttpRequest req) {
        // 如果HTTP解码失败，返回HHTP异常
        if (!req.getDecoderResult().isSuccess() || (!"websocket".equals(req.headers().get("Upgrade")))) {
            MessageUtils.sendHttpResponse(ctx, req,
                    new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.BAD_REQUEST));
            return null;
        }
        // 获取url后置参数
        HttpMethod method = req.getMethod();
        String uri = req.getUri();
        // System.out.println(parameters.get("request").get(0));
        if (method == HttpMethod.GET && "/webssss".equals(uri)) {
            // ....处理
            ctx.attr(AttributeKey.valueOf("type")).set("anzhuo");
        } else if (method == HttpMethod.GET && "/websocket".equals(uri)) {
            // ...处理
            ctx.attr(AttributeKey.valueOf("type")).set("live");
        }
        // 构造握手响应返回，本机测试
        WebSocketServerHandshakerFactory wsFactory = new WebSocketServerHandshakerFactory(
                "ws://" + req.headers().get(HttpHeaders.Names.HOST) + uri, null, false);
        WebSocketServerHandshaker handshaker = wsFactory.newHandshaker(req);
        if (handshaker == null) {
            WebSocketServerHandshakerFactory.sendUnsupportedWebSocketVersionResponse(ctx.channel());
        } else {
            handshaker.handshake(ctx.channel(), req);
        }
        return handshaker;
    }
}
