package com.tyjw.inspectline.web.queue;

import com.tyjw.inspectline.common.Global;
import com.tyjw.inspectline.entity.projo.WotianyuTelemetryList;
import com.tyjw.inspectline.web.websocket.ChannelObj;
import com.tyjw.inspectline.web.websocket.MessageUtils;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelId;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import lombok.extern.slf4j.Slf4j;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * 消费者线程
 *
 * @author
 */
@Slf4j
public class ConsumerPosition implements Runnable {

   /* public void run() {
        log.info("启动消费者线程！");
        boolean isRunning = true;
        int count = 0;
        while (isRunning) {
            try {
                WotianyuTelemetryList.DataList.Data data = (WotianyuTelemetryList.DataList.Data) Global.queue.poll(2, TimeUnit.SECONDS);//有数据时直接从队列的队首取走，无数据时阻塞，在2s内有数据，取走，超过2s还没数据，返回失败
                if (null != data) {
                    log.info("队列中的数据：[{}]",data.getTaskId());
                    String key = String.valueOf(data.getTaskId());
                    Iterator<Map.Entry<ChannelId, ChannelObj>> iterator = MessageUtils.CHANNEL_MAP.entrySet().iterator();
                    while (iterator.hasNext()) {
                        ChannelObj channelObj = iterator.next().getValue();
                        Channel channel = channelObj.getCtx().channel();
                        String planId = channelObj.getPlanId();
                        log.info("socket发送数据：[{}]----[{}]",channelObj.getChannelId(),channelObj.getUserId());
                        if (channel.isActive() && channelObj.getProjectId().equals("48")) {
                            byte[] packet = data.toByteArray();
                            ByteBuf buf = Unpooled.buffer();
                            buf.writeBytes(packet);
                            channel.writeAndFlush(new BinaryWebSocketFrame(buf));
                        }
                    }
                    Global.dataMap.remove(data.getTaskId());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }*/


    /*public void run() {
        log.info("启动消费者线程！");
        boolean isRunning = true;
        int count = 0;
        while (isRunning) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                Iterator<Map.Entry<Integer, WotianyuTelemetryList.DataList.Data>> datas = Global.dataMap.entrySet().iterator();
                while (datas.hasNext()) {
                    Map.Entry<Integer, WotianyuTelemetryList.DataList.Data> entry = datas.next();
                    WotianyuTelemetryList.DataList.Data data = entry.getValue();
                    if (null != data) {
                        log.info("队列中的数据：[{}]", data.getTaskId());
                        String key = String.valueOf(data.getTaskId());
                        Iterator<Map.Entry<ChannelId, ChannelObj>> iterator = MessageUtils.CHANNEL_MAP.entrySet().iterator();
                        while (iterator.hasNext()) {
                            ChannelObj channelObj = iterator.next().getValue();
                            Channel channel = channelObj.getCtx().channel();
                            String planId = channelObj.getPlanId();
                            log.info("socket发送数据：[{}]----[{}]", channelObj.getChannelId(), channelObj.getUserId());
                            if (channel.isActive() && channelObj.getProjectId().equals("48")) {
                                byte[] packet = data.toByteArray();
                                ByteBuf buf = Unpooled.buffer();
                                buf.writeBytes(packet);
                                channel.writeAndFlush(new BinaryWebSocketFrame(buf));
                            }
                        }
                        Global.dataMap.remove(data.getTaskId());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }*/


    @Override
    public void run() {
        log.info("启动消费者线程！");
        boolean isRunning = true;
        int count = 0;
        while (isRunning) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                WotianyuTelemetryList.DataList.Data data = (WotianyuTelemetryList.DataList.Data) Global.queue.poll(2, TimeUnit.SECONDS);//有数据时直接从队列的队首取走，无数据时阻塞，在2s内有数据，取走，超过2s还没数据，返回失败
                Iterator<Map.Entry<Integer, WotianyuTelemetryList.DataList.Data>> datas = Global.dataMap.entrySet().iterator();
                if (null != data) {
                    log.info("队列中的数据：[{}]", data.getTaskId());
                    String key = String.valueOf(data.getTaskId());
                    Iterator<Map.Entry<ChannelId, ChannelObj>> iterator = MessageUtils.CHANNEL_MAP.entrySet().iterator();
                    while (iterator.hasNext()) {
                       ChannelObj channelObj = iterator.next().getValue();
                        Channel channel = channelObj.getCtx().channel();
                        String planId = channelObj.getPlanId();
                        log.info("socket发送数据：[{}]----[{}]", channelObj.getChannelId(), channelObj.getUserId());
                        if (channel.isActive()) {
                            byte[] packet = data.toByteArray();
                            ByteBuf buf = Unpooled.buffer();
                            buf.writeBytes(packet);
                            channel.writeAndFlush(new BinaryWebSocketFrame(buf));
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}