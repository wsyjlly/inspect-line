package com.tyjw.inspectline.dao;

import com.tyjw.inspectline.entity.model.RoleDO;
import com.tyjw.inspectline.entity.model.RoleUserDO;
import com.tyjw.inspectline.entity.model.RoleUserDOExample;
import org.springframework.stereotype.Repository;

/**
 * RoleUserDAO继承基类
 */
@Repository
public interface RoleUserDAO extends MyBatisBaseDao<RoleUserDO, Long, RoleUserDOExample> {
    /**
     * 通过用户id获取角色
     * @param uid
     * @return
     */
    RoleDO findRoleByUid(Long uid);
}