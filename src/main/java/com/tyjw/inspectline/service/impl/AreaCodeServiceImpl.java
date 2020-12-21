package com.tyjw.inspectline.service.impl;

import com.tyjw.inspectline.dao.RegionDAO;
import com.tyjw.inspectline.entity.model.RegionDO;
import com.tyjw.inspectline.entity.model.RegionDOExample;
import com.tyjw.inspectline.entity.pojo.ResultEnum;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.service.AreaCodeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class AreaCodeServiceImpl implements AreaCodeService {

    @Autowired
    private RegionDAO dao;

    @Override
    public ResultInfo list(Integer pid) {
        ResultInfo resultInfo = new ResultInfo<>();
        RegionDOExample example = new RegionDOExample();
        RegionDOExample.Criteria criteria = example.createCriteria();
        criteria.andPidEqualTo(pid);
        List<RegionDO> list = new ArrayList<>();
        try {
            list = dao.selectByExample(example);
            resultInfo.setResultEnum(ResultEnum.SUCCESS);
        } catch (Exception e) {
            log.error("查询行政区异常");
            resultInfo.setResultEnum(ResultEnum.SYS_SERVER_ERROR);
        }
        resultInfo.setReturnData(list);
        return resultInfo;
    }
}
