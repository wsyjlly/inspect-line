package com.tyjw.inspectline.web.telemetry.tcp;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**********************************
 * @Author YSW
 * @Description
 * @Date 2020.12.16 - 9:59
 **********************************/

public class Encoder extends MessageToByteEncoder<byte[]> {
	@Override
	protected void encode(ChannelHandlerContext ctx, byte[] msg, ByteBuf out) {
		out.writeShort(0x7479);
		out.writeShort(msg.length);
		out.writeBytes(msg);
	}
}
