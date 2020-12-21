package com.tyjw.inspectline.web.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageInfo;
import com.tyjw.inspectline.common.TyjwEnum;
import com.tyjw.inspectline.entity.dto.AirPlanHistoryDTO;
import com.tyjw.inspectline.entity.dto.PlanDTO;
import com.tyjw.inspectline.entity.model.PlanDO;
import com.tyjw.inspectline.entity.pojo.ResultEnum;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.service.PlanService;
import com.tyjw.inspectline.entity.vo.PlanVO;
import com.tyjw.inspectline.web.telemetry.TcpClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Slf4j
@RestController
@RequestMapping(value = "/api/plan")
public class PlanController {

    @Autowired
    private PlanService planService;

    /**
     * 分页查询历史列表
     *
     * @param planDTO
     * @param startTime  开始时间（格式：YYYY_MM_DD）；非必传
     * @param endTime    结束时间（格式：YYYY_MM_DD）；非必传
     * @param planName   任务名称（支持模糊查询）；非必传
     * @param dangerSort 险情排序；非必传
     * @return
     */
    @PostMapping(value = "/history/list")
    public ResultInfo<Page<PlanVO>> historyList(@RequestBody PlanDTO dto, @RequestHeader("u-projectId") Integer projectId) {
        ResultInfo<Page<PlanVO>> resultInfo = new ResultInfo(ResultEnum.SUCCESS);
        dto.setProjectId(projectId);
        Page<PlanVO> page = planService.historyPageList(dto);
        resultInfo.setReturnData(page);
        resultInfo.setTotal(page.getTotal());
        resultInfo.setHasNext(page.hasNext() ? 1 : 0);
        return resultInfo;
    }


    /**
     * 飞行计划列表(wty)
     *
     * @param planDTO
     * @param flightState 计划飞行状态   0未飞行  1飞行中  2飞行完毕；非必传
     * @param startTime   开始时间（格式：YYYY_MM_DD）；非必传
     * @param endTime     结束时间（格式：YYYY_MM_DD）；非必传
     * @return
     */
    @PostMapping(value = "/list")
    public ResultInfo list(@RequestBody PlanDTO planDTO, @RequestHeader("u-projectId") Integer projectId) {
        ResultInfo resultInfo = new ResultInfo(ResultEnum.SUCCESS);
        List<Map<String, Object>> list = planService.list(planDTO, projectId);
        resultInfo.setReturnData(list);
        return resultInfo;
    }

    /**
     * 飞行历史详情
     *
     * @param id
     * @return
     */
    @Cacheable(value = "nj_pipeline_history_data", key = "#id", unless = "#result.returnData == null")
    @RequestMapping(value = "/history/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResultInfo history(@PathVariable Integer id, @RequestHeader("u-projectId") Integer projectId) {
        ResultInfo result = new ResultInfo();
        AirPlanHistoryDTO historyDTO = planService.history(id, projectId);
        result.setReturnData(historyDTO);
        return result;
    }

    /**
     * 根据任务编号获取视频
     *
     * @param planId
     * @return
     */
    @Cacheable(value = "nj_pipeline_history_video", key = "#planId", unless = "#result.returnData == null")
    @RequestMapping(value = "/history/video/{planId}", method = RequestMethod.GET)
    @ResponseBody
    public ResultInfo planVideList(@PathVariable Integer planId, @RequestHeader("u-projectId") Integer projectId) {
        ResultInfo rv = new ResultInfo(ResultEnum.SUCCESS);
        AirPlanHistoryDTO dto = planService.historyVideo(planId, projectId);
        rv.setReturnData(dto);
        return rv;
    }


    /**
     * 根据计划id 获取直播 地址
     *
     * @param planId
     * @return
     */
    @GetMapping(value = "/live/video/{planId}")
    @ResponseBody
    public ResultInfo liveVideo(@PathVariable Integer planId, @RequestHeader("u-projectId") Integer projectId) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setResultEnum(ResultEnum.SUCCESS);
        log.info(">>>>>>>>>>>>>>>>>>planId："+
                planId+"<<<<<<<<<<<<<<<<<<<<<"+
                projectId+">>>>>>>>>>>>>>>>>>>>videoUrl："+
                TcpClient.videoUrlMap.get(planId)+"<<<<<<<<<<<<<<<<<<<<<");
        resultInfo.setReturnData(Objects.requireNonNull(TcpClient.videoUrlMap.get(planId),"未包含该ID地址..."));
        return resultInfo;
    }

    /**
     * 根据计划id 获取直播 地址(AI)
     *
     * @param planId
     * @return
     */
    @GetMapping(value = "/ai/live/video/{planId}")
    @ResponseBody
    public ResultInfo<String> aiLiveVideo(@PathVariable Integer planId, @RequestHeader("u-projectId") Integer projectId) {
        /*ResultInfo<String> resultInfo = new ResultInfo<>(ResultEnum.SUCCESS);
        String url = planService.aiLiveVideo(planId);
        if (StringUtils.isNotBlank(url))
            resultInfo.setReturnData(url);
        else {
            resultInfo.setResultEnum(ResultEnum.FAIL);
            resultInfo.setMessage("直播地址为null");
        }
        return resultInfo;*/
        return new ResultInfo<>(ResultEnum.FAIL);
    }

    /**
     * 根据计划id 获取历史 地址(AI)
     *
     * @param planId
     * @return
     */
    @GetMapping(value = "/ai/history/video/{planId}")
    @ResponseBody
    public ResultInfo aiHistoryVideo(@PathVariable Integer planId, @RequestHeader("u-projectId") Integer projectId) {
        ResultInfo<String> resultInfo = new ResultInfo<>(ResultEnum.SUCCESS);
        String url = planService.aiHistoryVideo(planId);
        if (StringUtils.isNotBlank(url))
            resultInfo.setReturnData(url);
        else {
            resultInfo.setResultEnum(ResultEnum.FAIL);
            resultInfo.setMessage("地址为null");
        }
        return resultInfo;
    }

    /**
     * 这是一个测试程序，后期可以删除
     */
    @GetMapping(value = "/test")
    public void test() {
        PlanDTO dto = new PlanDTO();
        dto.setFlightState(TyjwEnum.FLIGHT_STATE_FINISH.getValue());//飞行结束
        List<Map<String, Object>> list = planService.list(dto, 47);
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
                    planService.insertFinishPlan(record, 47);
                }
            }
        }
    }

    /**
     * 飞行数据统计
     *
     * @param dto
     * @return
     */
    @PostMapping(value = "/flight/statistics")
    public ResultInfo flightStatistics(@RequestBody PlanDTO dto) {
        ResultInfo resultInfo = new ResultInfo(ResultEnum.SUCCESS);
        Map<String, Object> map = planService.flightStatistics(dto);
        resultInfo.setReturnData(map);
        return resultInfo;
    }

    /**
     * 飞行统计详情
     *
     * @param dto
     * @return
     */
    @PostMapping(value = "/flight/statistics/detail")
    public ResultInfo detailStatistics(@RequestBody PlanDTO dto) {
        ResultInfo resultInfo = new ResultInfo(ResultEnum.SUCCESS);
        PageInfo<List<PlanDO>> pageInfo = planService.detailStatistics(dto);
        if (pageInfo.isHasNextPage())
            resultInfo.setHasNext(1);
        resultInfo.setReturnData(pageInfo.getList());
        resultInfo.setTotal((int) pageInfo.getTotal());
        return resultInfo;
    }

    /**
     * 获取报告
     *
     * @param taskId 任务id
     * @return
     */
    @GetMapping(value = "/report/{taskId}")
    public ResultInfo report(@PathVariable("taskId") Integer taskId) {
        return planService.report(taskId);
    }


}
