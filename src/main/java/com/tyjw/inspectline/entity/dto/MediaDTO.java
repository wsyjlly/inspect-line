package com.tyjw.inspectline.entity.dto;

import java.io.Serializable;
import java.util.Date;

public class MediaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer planId;
    private Integer mediaId;

    private String mediaUrl;

    private Integer mediaType;

    private Date startTime;

    private Date endTime;

    private Integer localMedia;
    
    public Integer getMediaId() {
        return mediaId;
    }

    public void setMediaId(Integer mediaId) {
        this.mediaId = mediaId;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public Integer getMediaType() {
        return mediaType;
    }

    public void setMediaType(Integer mediaType) {
        this.mediaType = mediaType;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getLocalMedia() {
		return localMedia;
	}

	public void setLocalMedia(Integer localMedia) {
		this.localMedia = localMedia;
	}

	public Integer getPlanId() {
		return planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	@Override
    public String toString() {
        return "MediaDTO{" +
                "mediaId=" + mediaId +
                ", mediaUrl='" + mediaUrl + '\'' +
                ", mediaType=" + mediaType +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
