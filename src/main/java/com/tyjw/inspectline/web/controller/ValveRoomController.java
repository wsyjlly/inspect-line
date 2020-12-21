package com.tyjw.inspectline.web.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tyjw.inspectline.entity.dto.ValveRoomDTO;
import com.tyjw.inspectline.entity.model.SysDict;
import com.tyjw.inspectline.entity.model.ValveRoomDO;
import com.tyjw.inspectline.entity.pojo.ResultEnum;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.service.ValveRoomService;
import com.tyjw.inspectline.entity.vo.ValveRoomVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 阀室 前端控制器
 * </p>
 *
 * @author tianfei
 * @since 2019-12-24
 */
@RestController
@RequestMapping("/api/valveRoom")
public class ValveRoomController {

    @Autowired
    private ValveRoomService valveRoomService;

    /**
     * 获取阀室类型
     *
     * @return
     */
    @GetMapping(value = "/valveTypes")
    public ResultInfo<List<SysDict>> queryValveType(@RequestHeader("u-projectId") Integer projectId) {
        ResultInfo<List<SysDict>> resultInfo = new ResultInfo<>();
        List<SysDict> list = valveRoomService.queryValveType(projectId);
        resultInfo.setReturnData(list);
        return resultInfo;
    }

    /**
     * 添加
     *
     * @param id                id Integer
     * @param name              阀室名称 String
     * @param number            阀室编号 String
     * @param address           行政区域 String
     * @param mileage           里程 单位m Integer
     * @param valveType         阀室类型 Integer
     * @param lng               经度 Double
     * @param lat               维度 Double
     * @param image             图片地址 String
     * @param workSpace         作业区 String
     * @param createTime        创建时间 Date
     * @param modifyTime        修改时间 Date
     * @param state             是否删除 Integer
     * @param projectId         项目id Integer
     * @param dutyPerson        责任人 String
     * @param dutyMobile        手机号 String
     * @param pipeInfoId        所属管道id Integer
     * @param pipeSiteId        所属站场id Integer
     * @param orgCode           组织编号 String
     * @param orgName           组织名称 String
     * @param description       描述 String
     * @param fenceding         是否有围墙 0：无 1：有  Integer
     * @param designunit        设计单位  String
     * @param assemblyCompany   装配公司  String
     * @param inspectingCompany 检查公司  String
     * @param testingCompany    测试公司  String
     * @return
     */
    @PostMapping(value = "/insert")
    public ResultInfo<ValveRoomDO> insert(@RequestBody ValveRoomDO record, @RequestHeader("u-projectId") Integer projectId) {
        ResultInfo<ValveRoomDO> resultInfo = new ResultInfo<>(ResultEnum.PARAMS_MISS_ERROR);
        if (StringUtils.isBlank(record.getName())) {
            resultInfo.setMessage("请填写阀室名称");
            return resultInfo;
        }
        if (null == record.getValveType()) {
            resultInfo.setMessage("请选择阀室类型");
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
        return valveRoomService.insert(record);
    }

    /**
     * 修改
     *
     * @param id                id Integer
     * @param name              阀室名称 String
     * @param number            阀室编号 String
     * @param address           行政区域 String
     * @param mileage           里程 单位m Integer
     * @param valveType         阀室类型 Integer
     * @param lng               经度 Double
     * @param lat               维度 Double
     * @param image             图片地址 String
     * @param workSpace         作业区 String
     * @param createTime        创建时间 Date
     * @param modifyTime        修改时间 Date
     * @param state             是否删除 Integer
     * @param projectId         项目id Integer
     * @param telphoneNumber    手机号 String
     * @param pipeInfoId        所属管道id Integer
     * @param pipeSiteId        所属站场id Integer
     * @param orgCode           组织编号 String
     * @param orgName           组织名称 String
     * @param description       描述 String
     * @param fenceding         是否有围墙 0：无 1：有  Integer
     * @param designunit        设计单位  String
     * @param assemblyCompany   装配公司  String
     * @param inspectingCompany 检查公司  String
     * @param testingCompany    测试公司  String
     * @return
     */
    @PostMapping(value = "/modify")
    public ResultInfo modify(@RequestBody ValveRoomDO record, @RequestHeader("u-projectId") Integer projectId) {
        ResultInfo resultInfo = new ResultInfo<>(ResultEnum.PARAMS_MISS_ERROR);
        if (null == record.getId()) {
            resultInfo.setMessage("请选择要修改的阀室");
            return resultInfo;
        }
        record.setProjectId(projectId);
        return valveRoomService.modify(record);
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @DeleteMapping(value = "delete/{id}")
    public ResultInfo delete(@PathVariable("id") Integer id) {
        return valveRoomService.delete(id);
    }


    /**
     * 分页查询列表
     *
     * @param dto
     * @param pageNum    第几页 非必传，默认为1
     * @param pageSize   每页记录数   非必传 默认为10
     * @param valveType  阀室类型
     * @param pipeInfoId 所属管道id
     * @param pipeSiteId 所属站场id
     * @param number     阀室编号
     * @return
     */
    @PostMapping(value = "/pagelist")
    public ResultInfo<Page<ValveRoomVO>> pageList(@RequestBody ValveRoomDTO dto, @RequestHeader("u-projectId") Integer projectId) {
        dto.setProjectId(projectId);
        return valveRoomService.pageList(dto);
    }

}
