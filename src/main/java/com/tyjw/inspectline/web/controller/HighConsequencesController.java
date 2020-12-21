package com.tyjw.inspectline.web.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tyjw.inspectline.entity.dto.HighConsequencesDTO;
import com.tyjw.inspectline.geo.Point;
import com.tyjw.inspectline.entity.model.HighConsequencesDO;
import com.tyjw.inspectline.entity.model.SysDict;
import com.tyjw.inspectline.entity.pojo.ResultEnum;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.service.HighConsequencesService;
import com.tyjw.inspectline.entity.vo.HighConsequencesVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 高后果区 前端控制器
 * </p>
 *
 * @author tianfei
 * @since 2019-12-24
 */
@Slf4j
@RestController
@RequestMapping("/api/highConsequences")
public class HighConsequencesController {


    @Autowired
    private HighConsequencesService highConsequencesService;

    /**
     * 获取高后果区类型
     *
     * @param projectId
     * @return
     */
    @GetMapping(value = "/highTypes")
    public ResultInfo<List<SysDict>> queryHighTypes(@RequestHeader("u-projectId") Integer projectId) {
        ResultInfo<List<SysDict>> resultInfo = new ResultInfo<>();
        List<SysDict> list = highConsequencesService.queryHighTypes(projectId);
        resultInfo.setReturnData(list);
        return resultInfo;
    }

    /**
     * 添加
     *
     * @param dto
     * @param Id          Integer
     * @param name        高后果区名称   String 必填项
     * @param number      高后果区编号     String 必填项
     * @param address     行政区域      String 必填项
     * @param level       高后果区等级      Integer 必填项
     * @param startCardId 起始桩id Integer  必填项
     * @param endCardId   终止桩id Integer  必填项
     * @param distance    缓冲区边界距离(单位：米) Integer 必填项
     * @param pipeInfoId  所属管道id Integer 必填项
     * @param pipeSiteId  所属站场id Integer 必填项
     * @param description 描述      String
     * @param remark      备注      String
     * @param dutyPerson  责任人      String
     * @param dutyMobile  联系方式      String
     * @param createTime  创建时间     Date
     * @param modifyTime  修改时间      Date
     * @param state       是否删除  Integer
     * @return
     */
    @PostMapping(value = "/insert")
    public ResultInfo<HighConsequencesDO> insert(@RequestBody HighConsequencesDTO dto, @RequestHeader("u-projectId") Integer projectId) {
        ResultInfo<HighConsequencesDO> resultInfo = new ResultInfo<>(ResultEnum.PARAMS_MISS_ERROR);
        if (StringUtils.isBlank(dto.getName())) {
            resultInfo.setMessage("高后果区名称不能为空！");
            return resultInfo;
        }
        if (StringUtils.isBlank(dto.getNumber())) {
            resultInfo.setMessage("高后果区编号不能为空！");
            return resultInfo;
        }
        if (StringUtils.isBlank(dto.getAddress())) {
            resultInfo.setMessage("行政区域不能为空！");
            return resultInfo;
        }
        if (dto.getLevel() == null) {
            resultInfo.setMessage("请选择高后果区等级");
            return resultInfo;
        }
        if (null == dto.getStartCardId() || null == dto.getEndCardId()) {
            resultInfo.setMessage("请选择起始桩和终止桩");
            return resultInfo;
        }
        if (null == dto.getDistance()) {
            resultInfo.setMessage("缓冲区边界距离不能为空！");
            return resultInfo;
        }
        if (null == dto.getHighTypeList() || dto.getHighTypeList().size() == 0) {
            resultInfo.setMessage("请至少选择一种高后果区类型");
            return resultInfo;
        }
        if (null == dto.getPipeInfoId()) {
            resultInfo.setMessage("请选择所属管道");
            return resultInfo;
        }
        if (null == dto.getPipeSiteId()) {
            resultInfo.setMessage("请选择所属站场");
            return resultInfo;
        }
        dto.setProjectId(projectId);
        return highConsequencesService.insert(dto);
    }

    /**
     * 修改
     *
     * @param dto
     * @param Id          Integer 必填项
     * @param name        高后果区名称   String 必填项
     * @param number      高后果区编号     String 必填项
     * @param address     行政区域      String 必填项
     * @param level       高后果区等级      Integer 必填项
     * @param startCardId 起始桩id Integer  必填项
     * @param endCardId   终止桩id Integer  必填项
     * @param distance    缓冲区边界距离(单位：米) Integer 必填项
     * @param pipeInfoId  所属管道id Integer 必填项
     * @param pipeSiteId  所属站场id Integer 必填项
     * @param description 描述      String
     * @param createTime  创建时间     Date
     * @param modifyTime  修改时间      Date
     * @param state       是否删除  Integer
     * @return
     */
    @PostMapping(value = "/modify")
    public ResultInfo modify(@RequestBody HighConsequencesDTO dto, @RequestHeader("u-projectId") Integer projectId) {
        ResultInfo resultInfo = new ResultInfo<>(ResultEnum.PARAMS_MISS_ERROR);
        if (null == dto.getId()) {
            resultInfo.setMessage("请选择要修改的高后果区");
            return resultInfo;
        }
        /*if (StringUtils.isBlank(dto.getName())) {
            resultInfo.setMessage("高后果区名称不能为空！");
            return resultInfo;
        }
        if (StringUtils.isBlank(dto.getNumber())) {
            resultInfo.setMessage("高后果区编号不能为空！");
            return resultInfo;
        }
        if (StringUtils.isBlank(dto.getAddress())) {
            resultInfo.setMessage("行政区域不能为空！");
            return resultInfo;
        }
        if (dto.getLevel() == null) {
            resultInfo.setMessage("请选择高后果区等级");
            return resultInfo;
        }
        if (null == dto.getStartCardId() || null == dto.getEndCardId()) {
            resultInfo.setMessage("请选择起始桩和终止桩");
            return resultInfo;
        }
        if (null == dto.getDistance()) {
            resultInfo.setMessage("缓冲区边界距离不能为空！");
            return resultInfo;
        }
        if (null == dto.getHighTypeList() || dto.getHighTypeList().size() == 0) {
            resultInfo.setMessage("请至少选择一种高后果区类型");
            return resultInfo;
        }*/
        dto.setProjectId(projectId);
        return highConsequencesService.modify(dto);
    }


    /**
     * 分页查询列表
     *
     * @param dto
     * @param pageNum    第几页 非必传，默认为1
     * @param pageSize   每页记录数   非必传 默认为10
     * @param pipeInfoId 所属管道id
     * @param pipeSiteId 所属站场id
     * @param number     高后果区编号（模糊查询）
     * @param level      高后果区等级 1、 2、 3   级
     * @return
     */
    @PostMapping(value = "/pagelist")
    public ResultInfo<Page<HighConsequencesVO>> pageList(@RequestBody HighConsequencesDTO dto, @RequestHeader("u-projectId") Integer projectId) {
        dto.setProjectId(projectId);
        return highConsequencesService.pageList(dto);
    }

    /**
     * 获取缓冲区
     *
     * @param record
     * @param startCardId 起始桩号id Integer 必填项
     * @param endCardId   终止桩号id Integer 必填项
     * @param distance    缓冲区边界距离(单位：米) Integer 必填项
     * @param projectId
     * @return
     */
    @GetMapping(value = "/buffer/{startCardId}/{endCardId}/{distance}")
    public ResultInfo<List<Point>> getBufferPoints(@PathVariable("startCardId") Integer startCardId, @PathVariable("endCardId") Integer endCardId, @PathVariable("distance") Integer distance, @RequestHeader("u-projectId") Integer projectId) {
        ResultInfo<List<Point>> resultInfo = new ResultInfo<>(ResultEnum.PARAMS_MISS_ERROR);
        if (startCardId == null || endCardId == null) {
            resultInfo.setMessage("管道信息至少需要选择两个坐标点！");
            return resultInfo;
        }
        if (null == distance) {
            resultInfo.setMessage("缓冲区边界距离不能为空！");
            return resultInfo;
        }
        List<Point> bufferPoints = highConsequencesService.getBufferPoints(startCardId, endCardId, distance, projectId);
        resultInfo.setReturnData(bufferPoints);
        resultInfo.setResultEnum(ResultEnum.SUCCESS);
        return resultInfo;
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @DeleteMapping(value = "delete/{id}")
    public ResultInfo delete(@PathVariable("id") Integer id) {
        return highConsequencesService.delete(id);
    }

}
