package com.tyjw.inspectline.web.websocket;

import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.MessageToMessageEncoder;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketFrame;
import io.netty.handler.stream.ChunkedWriteHandler;
import io.netty.handler.timeout.IdleStateHandler;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static io.netty.buffer.Unpooled.wrappedBuffer;

/**
 * ClassName:ChildChannelHandler Function:
 * 
 * @author cy
 */
public class NettyWebSocketHandler extends ChannelInitializer<SocketChannel> {
	@Override
	protected void initChannel(SocketChannel e) throws Exception {
		// 设置30秒没有读到数据，则触发一个READER_IDLE事件。
		// pipeline.addLast(new IdleStateHandler(30, 0, 0));
		// HttpServerCodec：将请求和应答消息解码为HTTP消息
		e.pipeline().addLast("http-codec", new HttpServerCodec());
		// HttpObjectAggregator：将HTTP消息的多个部分合成一条完整的HTTP消息
		e.pipeline().addLast("aggregator", new HttpObjectAggregator(65536));
		// ChunkedWriteHandler：向客户端发送HTML5文件
		e.pipeline().addLast("http-chunked", new ChunkedWriteHandler());
		// 在管道中添加我们自己的接收数据实现方法
		e.pipeline().addLast("handler", new NettyWebSocketServerHandler());
		e.pipeline().addLast(new IdleStateHandler(0,40,0, TimeUnit.SECONDS));
		e.pipeline().addLast(new HeartBeatHandler());
		e.pipeline().addLast("exception",new ExceptionCaughtHandler());

		// 自定义处理器 - 处理 web socket 二进制消息
		e.pipeline().addLast(new BinaryWebSocketFrameHandler());


		// 协议包编码
		e.pipeline().addLast(new MessageToMessageEncoder<MessageLiteOrBuilder>() {
			@Override
			protected void encode(ChannelHandlerContext ctx, MessageLiteOrBuilder msg, List<Object> out) throws Exception {
				ByteBuf result = null;
				if (msg instanceof MessageLite) {
					result = wrappedBuffer(((MessageLite) msg).toByteArray());
				}
				if (msg instanceof MessageLite.Builder) {
					result = wrappedBuffer(((MessageLite.Builder) msg).build().toByteArray());
				}
				// ==== 上面代码片段是拷贝自TCP ProtobufEncoder 源码 ====
				// 然后下面再转成websocket二进制流，因为客户端不能直接解析protobuf编码生成的
				WebSocketFrame frame = new BinaryWebSocketFrame(result);
				out.add(frame);
			}
		});

	}
}