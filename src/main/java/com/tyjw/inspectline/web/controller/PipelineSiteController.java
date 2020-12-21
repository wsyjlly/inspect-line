package com.tyjw.inspectline.web.controller;


import com.tyjw.inspectline.entity.model.PipelineSiteDO;
import com.tyjw.inspectline.entity.pojo.ResultEnum;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.service.PipelineSiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 管道站场 前端控制器
 * </p>
 *
 * @author tianfei
 * @since 2020-02-16
 */
@RestController
@RequestMapping("/api/pipelinesite")
public class PipelineSiteController {

    @Autowired
    private PipelineSiteService pipelineSiteService;

    /**
     * 查询站场信息
     * @param projectId
     * @return
     */
    @GetMapping(value = "/list")
    public ResultInfo<List<PipelineSiteDO>> queryList(@RequestHeader("u-projectId") Integer projectId) {
        ResultInfo<List<PipelineSiteDO>> resultInfo = new ResultInfo<>(ResultEnum.SUCCESS);
        List<PipelineSiteDO> list = pipelineSiteService.queryList(projectId);
        resultInfo.setReturnData(list);
        return resultInfo;
    }

}
