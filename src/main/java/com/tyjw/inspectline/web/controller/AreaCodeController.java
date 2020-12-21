package com.tyjw.inspectline.web.controller;

import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.service.AreaCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AreaCodeController {

    @Autowired
    private AreaCodeService areaCodeService;

    /**
     * 行政区查询
     * @param pid
     * @return
     */
    @GetMapping(value = "/api/area/list/{pid}")
    public ResultInfo list(@PathVariable Integer pid){
        return areaCodeService.list(pid);
    }

}
