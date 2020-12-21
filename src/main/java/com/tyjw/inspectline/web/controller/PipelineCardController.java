package com.tyjw.inspectline.web.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tyjw.inspectline.entity.dto.PipelineCardDTO;
import com.tyjw.inspectline.entity.model.PipelineCardDO;
import com.tyjw.inspectline.entity.model.SysDict;
import com.tyjw.inspectline.entity.pojo.ResultEnum;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.service.PipelineCardService;
import com.tyjw.inspectline.entity.vo.PipelineCardVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 桩牌 前端控制器
 * </p>
 *
 * @author tianfei
 * @since 2020-02-16
 */
@RestController
@RequestMapping("/api/pipelinecard")
public class PipelineCardController {


    @Autowired
    private PipelineCardService pipelineCardService;

    /**
     * 查询桩牌类型
     *
     * @param projectId
     * @return
     */
    @GetMapping(value = "/query/cardType")
    public ResultInfo<List<SysDict>> queryCardType(@RequestHeader("u-projectId") Integer projectId) {
        ResultInfo<List<SysDict>> resultInfo = new ResultInfo<>(ResultEnum.SUCCESS);
        List<SysDict> list = pipelineCardService.queryCardType(projectId);
        resultInfo.setReturnData(list);
        return resultInfo;
    }

    /**
     * 添加桩牌
     *
     * @param record
     * @param sysPipeNo  系统桩号	String  必填项
     * @param realPipeNo 现场桩号	String
     * @param cardType   桩类型id	Integer 必填项
     * @param lng        经度	Double  必填项
     * @param lat        维度	Double  必填项
     * @param altitude   高程	Float  必填项
     * @param address    地理位置 String
     * @param pipeSiteId 所属站场id 	Integer  必填项
     * @param pipeInfoId 所属管道id	Integer  必填项
     * @param projectId  项目id	Integer  必填项
     * @param type       基础设施类型id	    Integer
     * @param state      是否删除	Integer
     * @param image      图片地址 String
     * @param projectId
     * @return
     */
    @PostMapping(value = "/insert")
    public ResultInfo<PipelineCardDO> insert(@RequestBody PipelineCardDO record, @RequestHeader("u-projectId") Integer projectId) {
        ResultInfo resultInfo = new ResultInfo(ResultEnum.PARAMS_MISS_ERROR);
        record.setProjectId(projectId);
        if (StringUtils.isBlank(record.getSysPipeNo())) {
            resultInfo.setMessage("请输入系统桩号");
            return resultInfo;
        }
        if (null == record.getCardType()) {
            resultInfo.setMessage("请选择桩牌类型");
            return resultInfo;
        }
        if (null == record.getLng() && null == record.getLat()) {
            resultInfo.setMessage("请输入正确经纬度信息");
            return resultInfo;
        }
        if (null == record.getAltitude()) {
            resultInfo.setMessage("请输入高程");
            return resultInfo;
        }
        if (null == record.getPipeInfoId()) {
            resultInfo.setMessage("请选择所属管道");
            return resultInfo;
        }
        if (null == record.getPipeSiteId()) {
            resultInfo.setMessage("请选择所属站场");
            return resultInfo;
        }
        return pipelineCardService.insert(record);
    }

    /**
     * 修改桩牌
     *
     * @param record
     * @param id         id Integer 必填项
     * @param sysPipeNo  系统桩号	String  必填项
     * @param realPipeNo 现场桩号	String
     * @param cardType   桩类型id	Integer 必填项
     * @param lng        经度	Double  必填项
     * @param lat        维度	Double  必填项
     * @param altitude   高程	Float  必填项
     * @param address    地理位置 String
     * @param pipeSiteId 所属站场id 	Integer  必填项
     * @param pipeInfoId 所属管道id	Integer  必填项
     * @param image      图片地址 String
     * @return
     */
    @PostMapping(value = "/modify")
    public ResultInfo<PipelineCardDO> modify(@RequestBody PipelineCardDO record, @RequestHeader("u-projectId") Integer projectId) {
        ResultInfo resultInfo = new ResultInfo(ResultEnum.PARAMS_MISS_ERROR);
        record.setProjectId(projectId);
        if (null == record.getId()) {
            resultInfo.setMessage("请选择要修改的数据id");
            return resultInfo;
        }
        if (StringUtils.isBlank(record.getSysPipeNo())) {
            resultInfo.setMessage("请输入系统桩号");
            return resultInfo;
        }
        if (null == record.getCardType()) {
            resultInfo.setMessage("请选择桩牌类型");
            return resultInfo;
        }
        if (null == record.getLng() && null == record.getLat()) {
            resultInfo.setMessage("请输入正确经纬度信息");
            return resultInfo;
        }
        if (null == record.getAltitude()) {
            resultInfo.setMessage("请输入高程");
            return resultInfo;
        }
        if (null == record.getPipeInfoId()) {
            resultInfo.setMessage("请选择所属管道");
            return resultInfo;
        }
        if (null == record.getPipeSiteId()) {
            resultInfo.setMessage("请选择所属站场");
            return resultInfo;
        }
        return pipelineCardService.modify(record);
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @DeleteMapping(value = "delete/{id}")
    public ResultInfo delete(@PathVariable("id") Integer id) {
        return pipelineCardService.delete(id);
    }


    /**
     * 分页查询列表
     *
     * @param dto
     * @param pageNum    第几页 非必传，默认为1
     * @param pageSize   每页记录数   非必传 默认为10
     * @param pipeInfoId 所属管道id
     * @param pipeSiteId 所属站场id
     * @param sysPipeNo  系统桩号（模糊查询）
     * @param cardType   桩牌类型id
     * @return
     */
    @PostMapping(value = "/pagelist")
    public ResultInfo<Page<PipelineCardVO>> pageList(@RequestBody PipelineCardDTO dto, @RequestHeader("u-projectId") Integer projectId) {
        dto.setProjectId(projectId);
        return pipelineCardService.pageList(dto);
    }

    /**
     * 查询列表
     *
     * @param dto
     * @param pipeInfoId 所属管道id
     * @param pipeSiteId 所属站场id
     * @param sysPipeNo  系统桩号（模糊查询）
     * @param cardType   桩牌类型id
     * @return
     */
    @PostMapping(value = "/list")
    public ResultInfo<List<PipelineCardVO>> queryList(@RequestBody PipelineCardDTO dto, @RequestHeader("u-projectId") Integer projectId) {
        dto.setProjectId(projectId);
        return pipelineCardService.queryList(dto);
    }


}
