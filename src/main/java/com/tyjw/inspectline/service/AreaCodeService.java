package com.tyjw.inspectline.service;

import com.tyjw.inspectline.entity.pojo.ResultInfo;

public interface AreaCodeService {

    /**
     * 查询行政区
     * @param pid
     * @return
     */
    ResultInfo list(Integer pid);

}
