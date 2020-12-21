package com.tyjw.inspectline.web.telemetry.tcp;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.MessageToByteEncoder;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import io.netty.handler.timeout.IdleStateHandler;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.tyjw.inspectline.web.queue.ProducerService.sendPosition;
import static com.tyjw.inspectline.web.telemetry.TcpClient.*;

/**********************************
 * @Author YSW
 * @Description
 * @Date 2020.12.16 - 9:54
 **********************************/

@Slf4j
public class TcpClientChannelInitializer extends ChannelInitializer<SocketChannel> {

	private String boxSn;
	private int taskId;

	public TcpClientChannelInitializer(String boxSn,int taskId){
		  this.boxSn = boxSn;
		  this.taskId = taskId;
	}

	@Override
	protected void initChannel(SocketChannel socketChannel) {
		socketChannel.pipeline().addLast("encoder", new Encoder());
		socketChannel.pipeline().addLast(new LengthFieldBasedFrameDecoder(Integer.MAX_VALUE, 2,
				2, 0, 4, true));
		socketChannel.pipeline().addLast("decoder", new Decoder());
		socketChannel.pipeline().addLast(new IdleStateHandler(3, 3, 3));
		socketChannel.pipeline().addLast(new TcpClientHandler(boxSn,taskId));
	}
}
