package com.tyjw.inspectline.web.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tyjw.inspectline.entity.dto.ConstructionUnitDTO;
import com.tyjw.inspectline.entity.model.ConstructionUnitDO;
import com.tyjw.inspectline.entity.model.SysDict;
import com.tyjw.inspectline.entity.pojo.ResultEnum;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.service.ConstructionUnitService;
import com.tyjw.inspectline.entity.vo.ConstructionUnitVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 施工单位 前端控制器
 * </p>
 *
 * @author tianfei
 * @since 2019-12-24
 */
@RestController
@RequestMapping("/api/constructionUnit")
public class ConstructionUnitController {

    @Autowired
    private ConstructionUnitService constructionUnitService;

    /**
     * 获取阀室类型
     *
     * @return
     */
    @GetMapping(value = "/constructionTypes")
    public ResultInfo<List<SysDict>> queryConstructionUnitType(@RequestHeader("u-projectId") Integer projectId) {
        ResultInfo<List<SysDict>> resultInfo = new ResultInfo<>();
        List<SysDict> list = constructionUnitService.queryConstructionUnitType(projectId);
        resultInfo.setReturnData(list);
        return resultInfo;
    }

    /**
     * 添加
     *
     * @param Id               Integer
     * @param name             名称 String
     * @param number           编号 String
     * @param address          施工地点 String
     * @param lng              经度 Double
     * @param lat              维度 Double
     * @param riskGrade        风险等级 Integer
     * @param workSpace        作业区 String
     * @param type             设施类型 Integer
     * @param method           施工方法 Integer
     * @param schedule         工程进度 Integer
     * @param takeSteps        采取措施 Integer
     * @param mileage          里程，单位m Integer
     * @param protectSteps     保护措施 String
     * @param startTime        施工开始时间 Date （格式：YYYY_MM_DD）
     * @param endTime          施工结束时间 Date （格式：YYYY_MM_DD）
     * @param workPermission   作业许可 0否；1是 Integer
     * @param description      问题描述 String
     * @param image            三方施工现场照片 String
     * @param createTime       创建时间 Date
     * @param modifyTime       修改时间 Date
     * @param state            是否删除 Integer
     * @param constructionType 施工类型 Integer
     * @param pipeInfoId       所属管道 Integer
     * @param pipeSiteId       所属站场id Integer
     * @param safeAreaImage    施工区安全区图片 String
     * @return
     */
    @PostMapping(value = "/insert")
    public ResultInfo<ConstructionUnitDO> insert(@RequestBody ConstructionUnitDO record, @RequestHeader("u-projectId") Integer projectId) {
        ResultInfo<ConstructionUnitDO> resultInfo = new ResultInfo<>(ResultEnum.PARAMS_MISS_ERROR);
        if (StringUtils.isBlank(record.getName())) {
            resultInfo.setMessage("请填写施工名称");
            return resultInfo;
        }
        if (null == record.getConstructionType()) {
            resultInfo.setMessage("请选择施工类型");
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
        record.setProjectId(projectId);
        return constructionUnitService.insert(record);
    }

    /**
     * 修改
     *
     * @param Id               Integer
     * @param name             名称 String
     * @param number           编号 String
     * @param address          施工地点 String
     * @param lng              经度 Double
     * @param lat              维度 Double
     * @param riskGrade        风险等级 Integer
     * @param workSpace        作业区 String
     * @param type             设施类型 Integer
     * @param method           施工方法 Integer
     * @param schedule         工程进度 Integer
     * @param takeSteps        采取措施 Integer
     * @param mileage          里程，单位m Integer
     * @param protectSteps     保护措施 String
     * @param startTime        施工开始时间 Date
     * @param endTime          施工结束时间 Date
     * @param workPermission   作业许可 0否；1是 Integer
     * @param description      问题描述 String
     * @param image            三方施工现场照片 String
     * @param createTime       创建时间 Date
     * @param modifyTime       修改时间 Date
     * @param state            是否删除 Integer
     * @param constructionType 施工类型 Integer
     * @param pipeInfoId       所属管道 Integer
     * @param pipeSiteId       所属站场id Integer
     * @param safeAreaImage    施工区安全区图片 String
     * @return
     */
    @PostMapping(value = "/modify")
    public ResultInfo modify(@RequestBody ConstructionUnitDO record, @RequestHeader("u-projectId") Integer projectId) {
        ResultInfo resultInfo = new ResultInfo<>(ResultEnum.PARAMS_MISS_ERROR);
        if (null == record.getId()) {
            resultInfo.setMessage("请选择要修改的施工");
            return resultInfo;
        }
        record.setProjectId(projectId);
        return constructionUnitService.modify(record);
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @DeleteMapping(value = "delete/{id}")
    public ResultInfo delete(@PathVariable("id") Integer id) {
        return constructionUnitService.delete(id);
    }

    /**
     * 分页查询列表
     *
     * @param dto
     * @param pageNum          第几页 非必传，默认为1
     * @param pageSize         每页记录数   非必传 默认为10
     * @param constructionType 施工类型
     * @param name             施工名称
     * @param number           施工编号
     * @param pipeInfoId       所属管道id
     * @param pipeSiteId       所属站场id
     * @return
     */
    @PostMapping(value = "/pagelist")
    public ResultInfo<Page<ConstructionUnitVO>> pageList(@RequestBody ConstructionUnitDTO dto, @RequestHeader("u-projectId") Integer projectId) {
        dto.setProjectId(projectId);
        return constructionUnitService.pageList(dto);
    }

}
