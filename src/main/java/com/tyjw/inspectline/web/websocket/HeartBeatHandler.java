package com.tyjw.inspectline.web.websocket;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelId;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.timeout.IdleStateEvent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HeartBeatHandler extends SimpleChannelInboundHandler<String> {

    int readIdleTimes = 0;
    int writerIdleTimes = 0;

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String s) throws Exception {
        log.info(" ====== > [server] message received :[{}] ", s);
        if ("I am alive".equals(s)) {
            ctx.channel().writeAndFlush("copy that");
        } else {
            System.out.println(" 其他信息处理 ... ");
        }
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        IdleStateEvent event = (IdleStateEvent) evt;
        String eventType = null;
        switch (event.state()) {
            case READER_IDLE:
                eventType = "读空闲";
                readIdleTimes++; // 读空闲的计数加1
                break;
            case WRITER_IDLE:
                eventType = "写空闲";
                writerIdleTimes++;
                break;
            case ALL_IDLE:
                eventType = "读写空闲";
                // 不处理
                break;
        }
        ChannelId channelId = ctx.channel().id();
        log.info("websocket 超时事件：[{}],channel的id为：[{}]", eventType,channelId);
        if (readIdleTimes > 3 || writerIdleTimes > 3) {
            String uid = null;
            if (MessageUtils.CHANNEL_MAP.containsKey(channelId)) {
                ChannelObj channelObj = MessageUtils.CHANNEL_MAP.get(channelId);
                uid = channelObj.getUserId();
            }
            log.info("[websocket][{}]超过3次，关闭连接", eventType);
            log.info("客户端与服务端连接[关闭],channel的id为：{},用户id：{}", ctx.channel().id(), uid);
//            ctx.channel().writeAndFlush("you are out");
            ctx.channel().close();
        }
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.err.println("=== " + ctx.channel().remoteAddress() + " is active ===");
    }

}