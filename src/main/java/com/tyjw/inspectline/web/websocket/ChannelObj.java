package com.tyjw.inspectline.web.websocket;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelId;
import lombok.Data;

@Data
public class ChannelObj {

    private ChannelId channelId;
    private ChannelHandlerContext ctx;
    private String userId;
    private String token;
    private String planId;
    private String projectId;//项目id

    public ChannelObj() {
    }

    public ChannelObj(ChannelId channelId, ChannelHandlerContext channel, String userId, String token,String projectId) {
        this.channelId = channelId;
        this.ctx = channel;
        this.userId = userId;
        this.token = token;
        this.projectId = projectId;
    }

    public ChannelId getChannelId() {
        return channelId;
    }

    public void setChannelId(ChannelId channelId) {
        this.channelId = channelId;
    }

    public ChannelHandlerContext getCtx() {
        return ctx;
    }

    public void setCtx(ChannelHandlerContext ctx) {
        this.ctx = ctx;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }
}
