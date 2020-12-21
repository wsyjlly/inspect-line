package com.tyjw.inspectline.web.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tyjw.inspectline.common.Constants;
import com.tyjw.inspectline.entity.dto.DangerDTO;
import com.tyjw.inspectline.entity.model.DangerResult;
import com.tyjw.inspectline.entity.model.DangerTarget;
import com.tyjw.inspectline.entity.pojo.ResultEnum;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.service.DangerService;
import com.tyjw.inspectline.entity.vo.DangerBodyVO;
import com.tyjw.inspectline.entity.vo.DangerResultVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 险情controller
 */
@Slf4j
@RestController
public class DangerController {

    public static Map<Integer, List<String>> aiUserIds = new HashMap<>();//ai检测用户 <taskId,uid>

    @Autowired
    private DangerService dangerService;
    @Autowired
    private Constants constants;

    /**
     * 查询险情类型
     *
     * @param projectId
     * @return
     */
    @GetMapping(value = "/api/danger/type")
    public ResultInfo<DangerTarget> selectPerilType(@RequestHeader("u-projectId") Integer projectId) {
        ResultInfo resultInfo = new ResultInfo(ResultEnum.SUCCESS);
        List<DangerTarget> list = dangerService.selectDangerType(projectId);
        resultInfo.setReturnData(list);
        return resultInfo;
    }

    /**
     * 险情标注
     *
     * @param record
     * @param projectId   项目id	Integer  头信息获取
     * @param projectName 项目名称 String
     * @param taskId      任务id Integer  必传项
     * @param taskName    任务名称 String 必传项
     * @param targetId    目标类型编号 Integer 必传项
     * @param targetName  目标类型名称 String
     * @param credibility 可信度 Float
     * @param distanceX   X方向距离 Float
     * @param distanceY   Y方向距离 Float
     * @param lng         经度 Double 必传项
     * @param lat         纬度 Double 必传项
     * @param height      高度 Float
     * @param nowImageUrl 当前图片 String 必传项
     * @param hisImageUrl 历史图片 String
     * @param timeStamp   发现时间 Date
     * @param type        险情类型 1变化检测 2目标检测 3手动标注 Integer
     * @param status      险情处理状态 0未指派 1处理中 2已解决 Integer
     * @param dangerUsers 险情处理人id  格式：[1,2,3] 非必传，不传代表未分配处理人
     * @param remarks     备注 String
     * @return
     */
    @PostMapping(value = "/api/danger/insert")
    public ResultInfo insert(@RequestBody DangerDTO record, @RequestHeader("u-uid") Long uid, @RequestHeader("u-projectId") Integer projectId) {
        ResultInfo resultInfo = new ResultInfo(ResultEnum.PARAMS_MISS_ERROR);
        if (null == record.getTargetId()) {
            resultInfo.setMessage("请选择险情类型");
            return resultInfo;
        }
        if (null == record.getTaskId()) {
            resultInfo.setMessage("请选择计划");
            return resultInfo;
        }
        if (StringUtils.isBlank(record.getNowImageUrl())) {
            resultInfo.setMessage("请上传险情图片");
            return resultInfo;
        }
        if (null == record.getLng() || null == record.getLat()) {
            resultInfo.setMessage("请填写险情的经纬度信息");
            return resultInfo;
        }
        if (record.getLat() < 4 || record.getLat() > 53) {//中国的纬度范围是北纬4°~53°
            resultInfo.setMessage("请填写正确维度度信息");
            return resultInfo;
        }
        if (record.getLng() < 73 || record.getLng() > 135) {// 中国的经度范围是东经73°~135°,
            resultInfo.setMessage("请填写正确经度信息");
            return resultInfo;
        }
        record.setTimeStamp(new Date());
        record.setProjectId(projectId);
        record.setTaskName(StringUtils.isNotBlank(record.getTaskName())?record.getTaskName():"飞行任务"+record.getTaskId());
        return dangerService.insert(record);
    }

    @PostMapping(value = "/api/danger/modify")
    public ResultInfo modify(@RequestBody DangerDTO record, @RequestHeader("u-uid") Long uid, @RequestHeader("u-projectId") Integer projectId) {
        ResultInfo resultInfo = new ResultInfo(ResultEnum.PARAMS_MISS_ERROR);
        if (null == record.getId()) {
            resultInfo.setMessage("请选择险情");
            return resultInfo;
        }
        return dangerService.modify(record);
    }


    /**
     * 分页条件险情列表
     *
     * @param dto
     * @param pageNum    页码
     * @param pageSize   每页数量
     * @param projectId  项目id,请求头获取
     * @param taskId     任务id
     * @param targetId   目标类型id
     * @param type       险情类型 1变化检测 2目标检测 3手动标注
     * @param status     多种险情状态查询  险情处理状态 0未指派 1处理中 2已解决
     * @param moreStatus 多种险情状态查询  格式：[0,1,2]  险情处理状态 0未指派 1处理中 2已解决
     * @return
     */
    @PostMapping(value = "/api/danger/list")
    public ResultInfo list(@RequestBody DangerDTO dto, @RequestHeader("u-projectId") Integer projectId) {
        dto.setProjectId(projectId);
        log.info("/api/danger/list");
        return dangerService.pageList(dto);
    }

    /**
     * 分页条件险情列表(巡线员)
     *
     * @param dto
     * @param pageNum    页码
     * @param pageSize   每页数量
     * @param projectId  项目id,请求头获取
     * @param taskId     任务id
     * @param targetId   目标类型id
     * @param type       险情类型 1变化检测 2目标检测 3手动标注
     * @param status     多种险情状态查询  险情处理状态 0未指派 1处理中 2已解决
     * @param moreStatus 多种险情状态查询  格式：[0,1,2]  险情处理状态 0未指派 1处理中 2已解决
     * @return
     */
    @PostMapping(value = "/api/danger/list/patrol")
    public ResultInfo<Page<DangerBodyVO>> listPatrol(@RequestBody DangerDTO dto, @RequestHeader("u-uid") Long resultUid, @RequestHeader("u-projectId") Integer projectId) {
        dto.setProjectId(projectId);
        return dangerService.pageListPatrol(dto, resultUid);
    }




    /**
     * 险情详情
     *
     * @param id 险情id
     * @return
     */
    @GetMapping(value = "/api/danger/info/{id}")
    public ResultInfo info(@PathVariable Long id) {
        return dangerService.selectDangerInfo(id);
    }

    /**
     * 查询险情处理结果(包括险情责任人)
     *
     * @param id 险情id
     * @return
     */
    @GetMapping(value = "/api/danger/results/{id}")
    public ResultInfo<List<DangerResultVO>> dangerResults(@PathVariable Long id) {
        ResultInfo<List<DangerResultVO>> resultInfo = new ResultInfo<>(ResultEnum.SUCCESS);
        List<DangerResultVO> list = dangerService.dangerResults(id);
        resultInfo.setReturnData(list);
        return resultInfo;
    }


    /**
     * 查询险情处理人
     *
     * @return
     */
    @GetMapping(value = "/api/danger/users")
    public ResultInfo dangerUsers(@RequestHeader("u-uid") Long uid, @RequestHeader("u-projectId") Integer projectId) {
        ResultInfo resultInfo = new ResultInfo(ResultEnum.SUCCESS);
        resultInfo.setReturnData(dangerService.queryDangerUsers(projectId));
        return resultInfo;
    }


    /**
     * 上报险情处理结果
     *
     * @param DangerResultDO
     * @param bodyId         险情id
     * @param sceneImgs      险情处理图片
     * @param formulation    险情处理结果
     * @return
     */
    @PostMapping(value = "/api/danger/result")
    public ResultInfo DangerResultDO(@RequestBody DangerResult DangerResultDO, @RequestHeader("u-uid") Long uid, @RequestHeader("u-projectId") Integer projectId) {
        ResultInfo resultInfo = new ResultInfo(ResultEnum.PARAMS_MISS_ERROR);
        if (null == DangerResultDO.getBodyId()) {
            resultInfo.setMessage("请上传险情id");
            return resultInfo;
        }
        if (StringUtils.isBlank(DangerResultDO.getSceneImgs())) {
            resultInfo.setMessage("请上传险情处理图片");
            return resultInfo;
        }
        if (StringUtils.isBlank(DangerResultDO.getFormulation())) {
            resultInfo.setMessage("请上传险情结果反馈");
            return resultInfo;
        }
        DangerResultDO.setUserId(uid);
        return dangerService.saveDangerResultDO(DangerResultDO);
    }

    /**
     * 险情统计(三合一)
     * Long taskId 任务id
     * Long targetId 险情类型id
     * Intrger status险情处理状态
     * Integer  pageNum (非必填，默认1)
     * Integer  pageSize (非必填，默认10)
     * String startTime 开始时间（yyyy-MM-dd）
     * String endTime   结束时间（yyyy-MM-dd）
     *
     * @param dto
     * @return
     */
    @PostMapping(value = "/api/danger/statistics")
    public ResultInfo dangerStatistics(@RequestBody DangerDTO dto, @RequestHeader("u-projectId") Integer projectId) {
        dto.setProjectId(projectId);
        return dangerService.dangerStatistics(dto);
    }



}
