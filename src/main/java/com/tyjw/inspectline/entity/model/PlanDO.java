package com.tyjw.inspectline.entity.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * tyjw_plan
 * @author 
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tyjw_plan")
public class PlanDO extends Model<DangerBody> implements Serializable {
    /**
     * 计划ID
     */
    @TableId(value = "plan_id")
    private Integer planId;

    /**
     * 计划所属用户ID
     */
    private Integer userId;

    /**
     * 计划使用的无人机ID
     */
    private Integer uavId;

    /**
     * 无人机名称
     */
    private String uavName;

    /**
     * 计划名称
     */
    private String planName;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 计划飞行状态   0未飞行  1飞行中  2飞行完毕
     */
    private Integer flightState;

    /**
     * 0可用，1不可用
     */
    private Integer state;

    /**
     * 计划创建时间
     */
    private Date createTime;

    /**
     * 飞行时长
     */
    private Integer flightDuration;

    /**
     * 飞行里程
     */
    private Double flightDistance;

    /**
     * 开始经度
     */
    private Double startLongitude;

    /**
     * 开始纬度
     */
    private Double startLatitude;

    /**
     * 结束经度
     */
    private Double endLongitude;

    /**
     * 结束纬度
     */
    private Double endLatitude;

    /**
     * 任务编号
     */
    private String taskNumber;

    /**
     * 是否有遥测,0没有,1有
     */
    private Integer hasTelemetry;

    /**
     * 是否有视频,0没有,1有
     */
    private Integer hasVideo;

    /**
     * 是否有高清视频,0没有,1有
     */
    private Integer hasHvideo;

    /**
     * 飞手（多个）
     */
    private String pilots;

    /**
     * 途经目标
     */
    private String loaderget;

    /**
     * 观察方式
     */
    private String seetype;

    /**
     * 管理单位
     */
    private String company;

    /**
     * 责任人
     */
    private String userName;

    /**
     * 联系方式
     */
    private String userMobile;

    /**
     * 航线json
     */
    private String airline;

    /**
     * 项目id
     */
    private Integer projectId;

    private static final long serialVersionUID = 1L;

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

    public String getUavName() {
        return uavName;
    }

    public void setUavName(String uavName) {
        this.uavName = uavName;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
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

    public Integer getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(Integer flightDuration) {
        this.flightDuration = flightDuration;
    }

    public Double getFlightDistance() {
        return flightDistance;
    }

    public void setFlightDistance(Double flightDistance) {
        this.flightDistance = flightDistance;
    }

    public Double getStartLongitude() {
        return startLongitude;
    }

    public void setStartLongitude(Double startLongitude) {
        this.startLongitude = startLongitude;
    }

    public Double getStartLatitude() {
        return startLatitude;
    }

    public void setStartLatitude(Double startLatitude) {
        this.startLatitude = startLatitude;
    }

    public Double getEndLongitude() {
        return endLongitude;
    }

    public void setEndLongitude(Double endLongitude) {
        this.endLongitude = endLongitude;
    }

    public Double getEndLatitude() {
        return endLatitude;
    }

    public void setEndLatitude(Double endLatitude) {
        this.endLatitude = endLatitude;
    }

    public String getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(String taskNumber) {
        this.taskNumber = taskNumber;
    }

    public Integer getHasTelemetry() {
        return hasTelemetry;
    }

    public void setHasTelemetry(Integer hasTelemetry) {
        this.hasTelemetry = hasTelemetry;
    }

    public Integer getHasVideo() {
        return hasVideo;
    }

    public void setHasVideo(Integer hasVideo) {
        this.hasVideo = hasVideo;
    }

    public Integer getHasHvideo() {
        return hasHvideo;
    }

    public void setHasHvideo(Integer hasHvideo) {
        this.hasHvideo = hasHvideo;
    }

    public String getPilots() {
        return pilots;
    }

    public void setPilots(String pilots) {
        this.pilots = pilots;
    }

    public String getLoaderget() {
        return loaderget;
    }

    public void setLoaderget(String loaderget) {
        this.loaderget = loaderget;
    }

    public String getSeetype() {
        return seetype;
    }

    public void setSeetype(String seetype) {
        this.seetype = seetype;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        PlanDO other = (PlanDO) that;
        return (this.getPlanId() == null ? other.getPlanId() == null : this.getPlanId().equals(other.getPlanId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUavId() == null ? other.getUavId() == null : this.getUavId().equals(other.getUavId()))
            && (this.getUavName() == null ? other.getUavName() == null : this.getUavName().equals(other.getUavName()))
            && (this.getPlanName() == null ? other.getPlanName() == null : this.getPlanName().equals(other.getPlanName()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getFlightState() == null ? other.getFlightState() == null : this.getFlightState().equals(other.getFlightState()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getFlightDuration() == null ? other.getFlightDuration() == null : this.getFlightDuration().equals(other.getFlightDuration()))
            && (this.getFlightDistance() == null ? other.getFlightDistance() == null : this.getFlightDistance().equals(other.getFlightDistance()))
            && (this.getStartLongitude() == null ? other.getStartLongitude() == null : this.getStartLongitude().equals(other.getStartLongitude()))
            && (this.getStartLatitude() == null ? other.getStartLatitude() == null : this.getStartLatitude().equals(other.getStartLatitude()))
            && (this.getEndLongitude() == null ? other.getEndLongitude() == null : this.getEndLongitude().equals(other.getEndLongitude()))
            && (this.getEndLatitude() == null ? other.getEndLatitude() == null : this.getEndLatitude().equals(other.getEndLatitude()))
            && (this.getTaskNumber() == null ? other.getTaskNumber() == null : this.getTaskNumber().equals(other.getTaskNumber()))
            && (this.getHasTelemetry() == null ? other.getHasTelemetry() == null : this.getHasTelemetry().equals(other.getHasTelemetry()))
            && (this.getHasVideo() == null ? other.getHasVideo() == null : this.getHasVideo().equals(other.getHasVideo()))
            && (this.getHasHvideo() == null ? other.getHasHvideo() == null : this.getHasHvideo().equals(other.getHasHvideo()))
            && (this.getPilots() == null ? other.getPilots() == null : this.getPilots().equals(other.getPilots()))
            && (this.getLoaderget() == null ? other.getLoaderget() == null : this.getLoaderget().equals(other.getLoaderget()))
            && (this.getSeetype() == null ? other.getSeetype() == null : this.getSeetype().equals(other.getSeetype()))
            && (this.getCompany() == null ? other.getCompany() == null : this.getCompany().equals(other.getCompany()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserMobile() == null ? other.getUserMobile() == null : this.getUserMobile().equals(other.getUserMobile()))
            && (this.getAirline() == null ? other.getAirline() == null : this.getAirline().equals(other.getAirline()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPlanId() == null) ? 0 : getPlanId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUavId() == null) ? 0 : getUavId().hashCode());
        result = prime * result + ((getUavName() == null) ? 0 : getUavName().hashCode());
        result = prime * result + ((getPlanName() == null) ? 0 : getPlanName().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getFlightState() == null) ? 0 : getFlightState().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getFlightDuration() == null) ? 0 : getFlightDuration().hashCode());
        result = prime * result + ((getFlightDistance() == null) ? 0 : getFlightDistance().hashCode());
        result = prime * result + ((getStartLongitude() == null) ? 0 : getStartLongitude().hashCode());
        result = prime * result + ((getStartLatitude() == null) ? 0 : getStartLatitude().hashCode());
        result = prime * result + ((getEndLongitude() == null) ? 0 : getEndLongitude().hashCode());
        result = prime * result + ((getEndLatitude() == null) ? 0 : getEndLatitude().hashCode());
        result = prime * result + ((getTaskNumber() == null) ? 0 : getTaskNumber().hashCode());
        result = prime * result + ((getHasTelemetry() == null) ? 0 : getHasTelemetry().hashCode());
        result = prime * result + ((getHasVideo() == null) ? 0 : getHasVideo().hashCode());
        result = prime * result + ((getHasHvideo() == null) ? 0 : getHasHvideo().hashCode());
        result = prime * result + ((getPilots() == null) ? 0 : getPilots().hashCode());
        result = prime * result + ((getLoaderget() == null) ? 0 : getLoaderget().hashCode());
        result = prime * result + ((getSeetype() == null) ? 0 : getSeetype().hashCode());
        result = prime * result + ((getCompany() == null) ? 0 : getCompany().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserMobile() == null) ? 0 : getUserMobile().hashCode());
        result = prime * result + ((getAirline() == null) ? 0 : getAirline().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", planId=").append(planId);
        sb.append(", userId=").append(userId);
        sb.append(", uavId=").append(uavId);
        sb.append(", uavName=").append(uavName);
        sb.append(", planName=").append(planName);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", flightState=").append(flightState);
        sb.append(", state=").append(state);
        sb.append(", createTime=").append(createTime);
        sb.append(", flightDuration=").append(flightDuration);
        sb.append(", flightDistance=").append(flightDistance);
        sb.append(", startLongitude=").append(startLongitude);
        sb.append(", startLatitude=").append(startLatitude);
        sb.append(", endLongitude=").append(endLongitude);
        sb.append(", endLatitude=").append(endLatitude);
        sb.append(", taskNumber=").append(taskNumber);
        sb.append(", hasTelemetry=").append(hasTelemetry);
        sb.append(", hasVideo=").append(hasVideo);
        sb.append(", hasHvideo=").append(hasHvideo);
        sb.append(", pilots=").append(pilots);
        sb.append(", loaderget=").append(loaderget);
        sb.append(", seetype=").append(seetype);
        sb.append(", company=").append(company);
        sb.append(", userName=").append(userName);
        sb.append(", userMobile=").append(userMobile);
        sb.append(", airline=").append(airline);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    protected Serializable pkVal() {
        return this.planId;
    }
}