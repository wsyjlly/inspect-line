package com.tyjw.inspectline.wogrid.client;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;

import java.util.List;

public class CloudMessageEncoder extends MessageToMessageEncoder<CloudMessage> {




	@Override
	protected void encode(ChannelHandlerContext ctx, CloudMessage msg, List<Object> out) throws Exception {
		
		ByteBuf sendBuf = Unpooled.buffer();
		sendBuf.writeShort(msg.getHead());
		sendBuf.writeByte(msg.getVersion());
		sendBuf.writeByte(msg.getCommType());
		sendBuf.writeShort(msg.getDataType());
		sendBuf.writeByte(msg.getClientType());
		sendBuf.writeInt(msg.getUserId());
		sendBuf.writeInt(msg.getTaskId());
		sendBuf.writeShort(msg.getState());
		sendBuf.writeShort(msg.getData().length);
		sendBuf.writeBytes(msg.getData());
		out.add(sendBuf);
	}

}
