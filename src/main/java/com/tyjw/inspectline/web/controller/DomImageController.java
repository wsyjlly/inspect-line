package com.tyjw.inspectline.web.controller;


import com.tyjw.inspectline.entity.model.DomImageDO;
import com.tyjw.inspectline.entity.pojo.ResultEnum;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.service.DomImageService;
import com.tyjw.inspectline.entity.vo.DomImageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author tianfei
 * @since 2020-02-26
 */
@RestController
@RequestMapping("/api/domImage")
public class DomImageController {

    @Autowired
    private DomImageService domImageService;

    /**
     * 查詢正射影像列表
     *
     * @param projectId
     * @return
     */
    @GetMapping(value = "/list")
    public ResultInfo<List<DomImageDO>> list(@RequestHeader("u-projectId") Integer projectId) {
        ResultInfo<List<DomImageDO>> resultInfo = new ResultInfo<>(ResultEnum.SUCCESS);
        List<DomImageDO> list = domImageService.queryList(projectId);
        resultInfo.setReturnData(list);
        return resultInfo;
    }


    /**
     * 查詢正射影像列表
     *
     * @param projectId
     * @return
     */
    @GetMapping(value = "/list/vo")
    public ResultInfo<List<DomImageVO>> listVO(@RequestHeader("u-projectId") Integer projectId) {
        ResultInfo<List<DomImageVO>> resultInfo = new ResultInfo<>(ResultEnum.SUCCESS);
        List<DomImageVO> list = domImageService.queryVoList(projectId);
        resultInfo.setReturnData(list);
        return resultInfo;
    }

    public static void main(String[] args) {

    }

}
