package com.tyjw.inspectline.web.controller;


import com.tyjw.inspectline.geo.Point;
import com.tyjw.inspectline.entity.pojo.ResultEnum;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.service.PipelineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 管道信息 前端控制器
 * </p>
 *
 * @author tianfei
 * @since 2020-01-14
 */
@RestController
public class PipelineController {

    @Autowired
    private PipelineService pipelineService;

    /**
     * 查询管道中心线数据
     * @param projectId
     * @return
     */
    @GetMapping(value = "/api/pipeline/list")
    public ResultInfo list(@RequestHeader("u-projectId") Integer projectId) {
        return pipelineService.queryList(projectId);
    }

    /**
     * 获取管道中心线电子围栏
     * @param distance 边界距离 Integer
     * @return
     */
    @GetMapping(value = "/api/pipelinePoint/buffer/{distance}")
    public ResultInfo<List<Point>> getBufferPoints(@PathVariable("distance") Integer distance, @RequestHeader("u-projectId") Integer projectId) {
        ResultInfo<List<Point>> resultInfo = new ResultInfo<>(ResultEnum.PARAMS_MISS_ERROR);
        if (distance==0){
            resultInfo.setMessage("电子围栏距离不能为0");
            return null;
        }
        List<Point> bufferPoints = pipelineService.getBufferPoints(distance,projectId);
        resultInfo.setReturnData(bufferPoints);
        resultInfo.setResultEnum(ResultEnum.SUCCESS);
        return resultInfo;
    }



}
