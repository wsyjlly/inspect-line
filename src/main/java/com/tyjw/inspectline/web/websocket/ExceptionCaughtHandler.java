package com.tyjw.inspectline.web.websocket;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExceptionCaughtHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        log.error("websocket exception 异常 Caught 抓住 抓住异常:{}", cause.getMessage());
        if (cause instanceof Exception) {
            ctx.close();
            log.error("websocket exception 异常被捕获处理");
        }
    }
}
