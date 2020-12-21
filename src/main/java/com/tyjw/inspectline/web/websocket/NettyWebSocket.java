package com.tyjw.inspectline.web.websocket;

import com.tyjw.inspectline.web.configuration.ApplicationContextProvider;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.websocketx.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class NettyWebSocket {

//    @Autowired
    private NettyWebSockerService nettyWebSockerService;
    {
        nettyWebSockerService= (NettyWebSockerService) ApplicationContextProvider.getBean("nettyWebSockerService");//替换成自己的service层
    }

    public void webHandlerWebSocketFrame(ChannelHandlerContext ctx, WebSocketFrame frame, WebSocketServerHandshaker handshaker) {
        // 判断是否关闭链路的指令
        if (frame instanceof CloseWebSocketFrame) {
            handshaker.close(ctx.channel(), (CloseWebSocketFrame) frame.retain());
            return;
        }
        // 判断是否ping消息
        if (frame instanceof PingWebSocketFrame) {
            ctx.channel().write(new PongWebSocketFrame(frame.content().retain()));
            return;
        }
        nettyWebSockerService.analysisType(ctx, frame);
    }


}
