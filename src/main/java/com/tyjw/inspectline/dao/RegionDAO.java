package com.tyjw.inspectline.dao;

import com.tyjw.inspectline.entity.model.RegionDO;
import com.tyjw.inspectline.entity.model.RegionDOExample;
import org.springframework.stereotype.Repository;

/**
 * RegionDAO继承基类
 */
@Repository
public interface RegionDAO extends MyBatisBaseDao<RegionDO, Integer, RegionDOExample> {
}