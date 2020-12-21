package com.tyjw.inspectline.wogrid.client;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;

import java.util.List;

public class CloudMessageDecoder extends MessageToMessageDecoder<ByteBuf> {

	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf msg, List<Object> out) throws Exception {
		
		/*CloudMessage cm =new CloudMessage();
		cm.setHead(msg.readShort());
		cm.setVersion(msg.readUnsignedByte());
		cm.setCommType(msg.readUnsignedByte());
		cm.setDataType(msg.readUnsignedShort());
//		cm.setClientType(msg.readUnsignedByte());
		cm.setClientType(msg.readByte());
		cm.setUserId(msg.readInt());
		cm.setTaskId(msg.readInt());
		cm.setState(msg.readUnsignedShort());
		byte[] data=new byte[msg.readUnsignedShort()];
		msg.readBytes(data);
		cm.setData(data);
		out.add(cm);*/

		CloudMessage cm =new CloudMessage();
		cm.setHead(msg.readShort());
		cm.setVersion(msg.readByte());
		cm.setCommType(msg.readByte());
		cm.setDataType(msg.readShort());
//		cm.setClientType(msg.readUnsignedByte());
		cm.setClientType(msg.readByte());
		cm.setUserId(msg.readInt());
		cm.setTaskId(msg.readInt());
		cm.setState(msg.readShort());
		byte[] data=new byte[msg.readUnsignedShort()];
		msg.readBytes(data);
		cm.setData(data);
		out.add(cm);

	}

}
