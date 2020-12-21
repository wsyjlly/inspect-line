package com.tyjw.inspectline.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.tyjw.inspectline.entity.dto.AirPlanHistoryDTO;
import com.tyjw.inspectline.entity.dto.PlanDTO;
import com.tyjw.inspectline.entity.model.PlanDO;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.entity.vo.PlanVO;

import java.util.List;
import java.util.Map;

public interface PlanService extends IService<PlanDO> {


    /**
     * 根据任务编号获取视频
     *
     * @param planId
     * @param projectId  项目id
     * @return
     */
    AirPlanHistoryDTO historyVideo(Integer planId, Integer projectId);

    /**
     * 获取计划列表
     *
     * @param planDTO
     * @return
     */
    List<Map<String, Object>> list(PlanDTO planDTO, Integer projectId);

    /**
     * 飞行历史详情
     *
     * @param id
     * @param projectId 项目id
     * @return
     */
    AirPlanHistoryDTO history(Integer id, Integer projectId);

    /**
     * 根据计划id 获取直播地址
     *
     * @param planId 计划id
     * @return
     */
    ResultInfo liveVideo(Integer planId, Integer projectId);

    /**
     * 添加飞行结束计划
     *
     * @return
     */
    boolean insertFinishPlan(PlanDO record, Integer projectId);

    /**
     * 飞行数据统计
     *
     * @param dto
     * @return
     */
    Map<String, Object> flightStatistics(PlanDTO dto);

    /**
     * 飞行数据统计详情
     *
     * @param dto
     * @return
     */
    PageInfo<List<PlanDO>> detailStatistics(PlanDTO dto);

    /**
     * 通过id查询已完成的计划
     * 查询的是自己项目的计划表，不是沃天宇云平台计划
     *
     * @param planId
     * @return
     */
    PlanDO queryById(Integer planId);

    /**
     * @param planDTO
     * @param startTimeStr 开始时间（格式：YYYY_MM_DD）；非必传
     * @param endTimeStr   结束时间（格式：YYYY_MM_DD）；非必传
     * @param planName     任务名称（支持模糊查询）；非必传
     * @return
     */
    Page<PlanVO> historyPageList(PlanDTO dto);

    /**
     * 获取报告
     * @param taskId
     * @return
     */
    ResultInfo report(Integer taskId);

    /**
     * 根据计划id 获取直播 地址(AI)
     * @param planId 任务id
     * @param projectId 项目id
     * @return
     */
    String aiLiveVideo(Integer planId);

    String aiHistoryVideo(Integer planId);
}
