package com.tyjw.inspectline.dao;

import com.tyjw.inspectline.entity.model.RoleDO;
import com.tyjw.inspectline.entity.model.RoleDOExample;
import org.springframework.stereotype.Repository;

/**
 * RoleDAO继承基类
 */
@Repository
public interface RoleDAO extends MyBatisBaseDao<RoleDO, Integer, RoleDOExample> {
}