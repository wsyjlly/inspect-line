package com.tyjw.inspectline.web.telemetry;

import com.tyjw.inspectline.common.Global;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.stream.ChunkedWriteHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import java.net.InetSocketAddress;
import java.util.concurrent.CopyOnWriteArraySet;

@Slf4j
@Configuration
public class TcpServer {
	public static final CopyOnWriteArraySet<Channel> WEB_SOCKET_CHANNEL_SET = new CopyOnWriteArraySet<>();

	public TcpServer(){
		Global.THREAD_POOL.execute(() -> start(new InetSocketAddress(18122)));
	}
	public static void main(String[] args) {
		TcpClient.start();
		start(new InetSocketAddress(18122));
	}
	public static void start(InetSocketAddress socketAddress) {

		// 主线程组
		NioEventLoopGroup bossGroup = new NioEventLoopGroup(1);
		//工作线程组
		NioEventLoopGroup workGroup = new NioEventLoopGroup(200);
		ServerBootstrap serverBootstrap = new ServerBootstrap()
				.group(bossGroup, workGroup)
				.channel(NioServerSocketChannel.class)
				.option(ChannelOption.SO_BACKLOG, 1024)
				.childHandler(new ChannelInitializer<SocketChannel>() {
					@Override
					protected void initChannel(SocketChannel ch) {
						ChannelPipeline pipeline = ch.pipeline();
						pipeline.addLast(new HttpServerCodec());
						pipeline.addLast(new HttpObjectAggregator(64 * 1024));
						pipeline.addLast(new ChunkedWriteHandler());
						pipeline.addLast(new WebSocketServerProtocolHandler("/"));
						pipeline.addLast(new SimpleChannelInboundHandler<TextWebSocketFrame>() {
							@Override
							protected void channelRead0(ChannelHandlerContext channelHandlerContext, TextWebSocketFrame textWebSocketFrame) throws Exception {
								System.out.println(WEB_SOCKET_CHANNEL_SET);
								System.out.println(textWebSocketFrame.text());
								channelHandlerContext.channel().writeAndFlush(new TextWebSocketFrame(textWebSocketFrame.text()));
							}

							@Override
							public void channelActive(ChannelHandlerContext ctx) throws Exception {
								System.out.println("channelActive");
								WEB_SOCKET_CHANNEL_SET.add(ctx.channel());
							}

							@Override
							public void channelInactive(ChannelHandlerContext ctx) throws Exception {
								System.out.println("channelInactive");
								WEB_SOCKET_CHANNEL_SET.remove(ctx.channel());
							}
						});
					}
				});
		try {
			ChannelFuture future = serverBootstrap.bind(socketAddress).sync();
			System.out.println("开启 port:" + socketAddress.getPort());
			future.channel().closeFuture().sync();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			bossGroup.shutdownGracefully();
			workGroup.shutdownGracefully();
		}
	}
}