package com.tyjw.inspectline.web.scheduled;

import com.tyjw.inspectline.common.Global;
import com.tyjw.inspectline.common.TyjwEnum;
import com.tyjw.inspectline.entity.dto.PlanDTO;
import com.tyjw.inspectline.entity.model.PlanDO;
import com.tyjw.inspectline.entity.model.ProjectDO;
import com.tyjw.inspectline.service.PlanService;
import com.tyjw.inspectline.service.ProjectService;
import com.tyjw.inspectline.common.utils.DateUtil;
import com.tyjw.inspectline.wogrid.client.CloudUdpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 定时任务
 */
@SuppressWarnings("ALL")
@Configuration
@EnableScheduling
@Slf4j
public class ScheduledServer {


    @Autowired
    private PlanService planService;

    @Autowired
    private CloudUdpService cloudUdpService;

    @Autowired
    private ProjectService projectService;

  //TODO 正式环境放开定时任务
    /**
     * 检查当天需要与云平台建立的UDP
     */
//    @Scheduled(cron = "0/15 * * * * ? ")
    public void createCloudUdp() {
        Global.THREAD_POOL.execute(new Thread(() -> {
            List<ProjectDO> projectList = projectService.queryList();
            for (ProjectDO item:projectList){
                PlanDTO dto = new PlanDTO();
                dto.setFlightState(TyjwEnum.FLIGHT_STATE_START.getValue());//飞行中
                List<Map<String, Object>> list = planService.list(dto,item.getProjectId());
                if (null != list && list.size() > 0) {
                    for (Map<String, Object> one : list) {
                        int planId = (int) one.get("planId");//计划编号
                        cloudUdpService.createCloudUdp(planId,item.getAccessKey(),item.getAccessKeySecret());
//                        planService.aiLiveVideo(planId);
                    }
                }
            }
        }));
    }


    /**
     * 每30分钟
     */
    @Scheduled(cron = "0 */10 * * * ?")
    public void insertFinishPlan() {
        Global.THREAD_POOL.execute(new Thread(() -> {
            List<ProjectDO> projectList = projectService.queryList();
            for (ProjectDO item:projectList){
                PlanDTO dto = new PlanDTO();
                dto.setStartTime(DateUtil.getTodayStartTime());
                dto.setEndTime(DateUtil.getTodayEndTime());
                dto.setFlightState(TyjwEnum.FLIGHT_STATE_FINISH.getValue());//飞行结束
                List<Map<String, Object>> list = planService.list(dto,item.getProjectId());
                if (null != list && list.size() > 0) {
                    for (Map<String, Object> one : list) {
                        //判断计划是否已入库
                        PlanDO record = planService.queryById((Integer) one.get("planId"));
                        if (null == record) {
                            record = new PlanDO();
                            record.setPlanId((int) one.get("planId"));
                            record.setUavName((String) one.get("uavName"));
                            record.setPlanName((String) one.get("planName"));
                            record.setStartTime((Date) one.get("startTime"));
                            record.setEndTime((Date) one.get("endTime"));
                            record.setTaskNumber((String) one.get("taskNumber"));
                            record.setHasTelemetry((Integer) one.get("hasTelemetry"));
                            record.setHasVideo((Integer) one.get("hasVideo"));
                            record.setHasHvideo((Integer) one.get("hasHVideo"));
                            record.setPilots((String) one.get("pilots"));
                            record.setAirline((String) one.get("route"));
                            record.setProjectId(item.getProjectId());
                            planService.insertFinishPlan(record,item.getProjectId());
                        }
                    }
                }
            }
        }));
    }

}