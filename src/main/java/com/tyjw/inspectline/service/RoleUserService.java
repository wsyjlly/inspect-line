package com.tyjw.inspectline.service;


import com.tyjw.inspectline.entity.model.RoleDO;
import com.tyjw.inspectline.entity.model.RoleUserDO;

/**
 * 用户角色
 */
public interface RoleUserService {

    /**
     * 通过用户id查询用户角色
     * @param uid
     * @return
     */
    RoleUserDO findUserRoleByUid(Long uid);

    RoleDO findRoleByUid(Long uid);

    /**
     * 添加用户角色(返回主键id)
     * @param uid
     * @param roleId
     * @return
     */
    long addUserRole(Long uid, Integer roleId);

    /**
     * 分配用户角色
     * @param uid
     * @param roleId
     * @return
     */
    boolean updateUserRole(Long uid, Integer roleId);
}
