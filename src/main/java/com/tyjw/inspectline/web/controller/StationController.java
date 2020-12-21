package com.tyjw.inspectline.web.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tyjw.inspectline.entity.dto.StationDTO;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.service.StationService;
import com.tyjw.inspectline.entity.vo.StationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 场站/保护站 前端控制器
 * </p>
 *
 * @author tianfei
 * @since 2020-02-07
 */
@RestController
@RequestMapping("/api/station")
public class StationController {

    @Autowired
    private StationService stationService;

    @PostMapping(value = "/pagelist")
    public ResultInfo<Page<StationVO>> pageList(@RequestBody StationDTO dto, @RequestHeader("u-projectId") Integer projectId) {
        dto.setProjectId(projectId);
        return stationService.pageList(dto);
    }

}
