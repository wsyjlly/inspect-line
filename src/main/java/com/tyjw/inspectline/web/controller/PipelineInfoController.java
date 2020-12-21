package com.tyjw.inspectline.web.controller;


import com.tyjw.inspectline.entity.model.PipelineInfoDO;
import com.tyjw.inspectline.entity.pojo.ResultEnum;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.service.PipelineInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 管道信息 前端控制器
 * </p>
 *
 * @author tianfei
 * @since 2020-02-16
 */
@RestController
@RequestMapping("/api/pipelineinfo")
public class PipelineInfoController {

    @Autowired
    private PipelineInfoService pipelineInfoService;

    /**
     * 查询管道信息
     * @param projectId
     * @return
     */
    @GetMapping(value = "/list")
    public ResultInfo<List<PipelineInfoDO>> queryList(@RequestHeader("u-projectId") Integer projectId) {
        ResultInfo<List<PipelineInfoDO>> resultInfo = new ResultInfo<>(ResultEnum.SUCCESS);
        List<PipelineInfoDO> list = pipelineInfoService.queryList(projectId);
        resultInfo.setReturnData(list);
        return resultInfo;
    }

}
