package com.tyjw.inspectline.web.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tyjw.inspectline.entity.dto.ThroughPointDTO;
import com.tyjw.inspectline.entity.model.ThroughPoint;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.service.ThroughPointService;
import com.tyjw.inspectline.entity.vo.ThroughPointVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 穿越点 前端控制器
 * </p>
 *
 * @author tianfei
 * @since 2019-12-24
 */
@RestController
@RequestMapping("/api/throughPoint")
public class ThroughPointController {

    @Autowired
    private ThroughPointService throughPointService;

    /**
     * 添加穿越点
     *
     * @param name             穿越点名称（公路/河流/铁路）String
     * @param address          行政划分 String
     * @param image            穿越点图片 String
     * @param mileage          穿越长度 Integer
     * @param type             穿跨类型 Integer
     * @param lng              经度 Double
     * @param lat              维度 Double
     * @param workSpace        作业区 String
     * @param pipelineName     管道名称 String
     * @param pipelineLocation 管线位置  String
     * @param steelPipe        钢管管径 单位mm Integer
     * @param drivePipe        套管管径，单位mm Integer
     * @param otherProtect     其他保护措施 String
     * @param createTime       创建时间 Date
     * @param modifyTime       修改时间 Date
     * @param state            是否删除 Integer
     * @param projectId        项目id Integer 请求头获取
     * @return
     */
    @PostMapping(value = "/insert")
    public ResultInfo<ThroughPoint> insert(@RequestBody ThroughPoint record, @RequestHeader("u-projectId") Integer projectId) {
        record.setProjectId(projectId);
        return throughPointService.insert(record);
    }


    /**
     * 分页查询列表
     *
     * @param dto
     * @param pageNum  第几页 非必传，默认为1
     * @param pageSize 每页记录数   非必传 默认为10
     * @return
     */
    @PostMapping(value = "/pagelist")
    public ResultInfo<Page<ThroughPointVO>> pageList(@RequestBody ThroughPointDTO dto, @RequestHeader("u-projectId") Integer projectId) {
        dto.setProjectId(projectId);
        return throughPointService.pageList(dto);
    }


}
