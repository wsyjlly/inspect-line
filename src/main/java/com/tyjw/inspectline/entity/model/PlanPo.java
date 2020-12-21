package com.tyjw.inspectline.entity.model;

import java.util.Date;

public class PlanPo {
    private Integer planId;

    private Integer userId;

    private Integer uavId;
    
    private String uavName;
    
    private String planName;

    private Date startTime;

    private Date endTime;

    private Integer flightState;

    private Integer pauseState;

    private Integer airlineState;

    private Integer mediaState;

    private String rtmpUrl;
    
    private Integer state;

    private Date createTime;

    private String airline;

    private Long cutStart;
    private Long cutEnd;
    
    //未指派险情数
    private int newDanger=0;
    //待确认险情数
    private int unDanger=0;
    //巡查中险情数
    private int exeDanger=0;
    //已解决险情数
    private int finishDanger=0;
    //是否有遥测，1有0无
    private int haveData=0;
    //是否有云端视频 1有0无
    private int haveCloudMv=0;
    //是否有机载视频 1有0无
    private int haveLocalMv=0;
    
    
    /*********************/
    private Integer start;
    private Integer size;
    private Integer index;
    
    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUavId() {
        return uavId;
    }

    public void setUavId(Integer uavId) {
        this.uavId = uavId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName == null ? null : planName.trim();
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

    public Integer getFlightState() {
		return flightState;
	}

	public void setFlightState(Integer flightState) {
		this.flightState = flightState;
	}

	public Integer getPauseState() {
		return pauseState;
	}

	public void setPauseState(Integer pauseState) {
		this.pauseState = pauseState;
	}

	public Integer getAirlineState() {
		return airlineState;
	}

	public void setAirlineState(Integer airlineState) {
		this.airlineState = airlineState;
	}

	public Integer getMediaState() {
		return mediaState;
	}

	public void setMediaState(Integer mediaState) {
		this.mediaState = mediaState;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline == null ? null : airline.trim();
    }

    public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public String getUavName() {
		return uavName;
	}

	public void setUavName(String uavName) {
		this.uavName = uavName;
	}

	public String getRtmpUrl() {
		return rtmpUrl;
	}

	public void setRtmpUrl(String rtmpUrl) {
		this.rtmpUrl = rtmpUrl;
	}


	public Long getCutStart() {
		return cutStart;
	}

	public void setCutStart(Long cutStart) {
		this.cutStart = cutStart;
	}

	public Long getCutEnd() {
		return cutEnd;
	}

	public void setCutEnd(Long cutEnd) {
		this.cutEnd = cutEnd;
	}

	public int getNewDanger() {
		return newDanger;
	}

	public void setNewDanger(int newDanger) {
		this.newDanger = newDanger;
	}

	public int getUnDanger() {
		return unDanger;
	}

	public void setUnDanger(int unDanger) {
		this.unDanger = unDanger;
	}

	public int getExeDanger() {
		return exeDanger;
	}

	public void setExeDanger(int exeDanger) {
		this.exeDanger = exeDanger;
	}

	public int getFinishDanger() {
		return finishDanger;
	}

	public void setFinishDanger(int finishDanger) {
		this.finishDanger = finishDanger;
	}

	public int getHaveData() {
		return haveData;
	}

	public void setHaveData(int haveData) {
		this.haveData = haveData;
	}

	public int getHaveCloudMv() {
		return haveCloudMv;
	}

	public void setHaveCloudMv(int haveCloudMv) {
		this.haveCloudMv = haveCloudMv;
	}

	public int getHaveLocalMv() {
		return haveLocalMv;
	}

	public void setHaveLocalMv(int haveLocalMv) {
		this.haveLocalMv = haveLocalMv;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PlanPo [planId=");
		builder.append(planId);
		builder.append(", userId=");
		builder.append(userId);
		builder.append(", uavId=");
		builder.append(uavId);
		builder.append(", uavName=");
		builder.append(uavName);
		builder.append(", planName=");
		builder.append(planName);
		builder.append(", startTime=");
		builder.append(startTime);
		builder.append(", endTime=");
		builder.append(endTime);
		builder.append(", flightState=");
		builder.append(flightState);
		builder.append(", pauseState=");
		builder.append(pauseState);
		builder.append(", airlineState=");
		builder.append(airlineState);
		builder.append(", mediaState=");
		builder.append(mediaState);
		builder.append(", rtmpUrl=");
		builder.append(rtmpUrl);
		builder.append(", state=");
		builder.append(state);
		builder.append(", createTime=");
		builder.append(createTime);
		builder.append(", airline=");
		builder.append(airline);
		builder.append(", cutStart=");
		builder.append(cutStart);
		builder.append(", cutEnd=");
		builder.append(cutEnd);
		builder.append(", start=");
		builder.append(start);
		builder.append(", size=");
		builder.append(size);
		builder.append(", index=");
		builder.append(index);
		builder.append("]");
		return builder.toString();
	}


}