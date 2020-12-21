package com.tyjw.inspectline.service.impl;


import com.tyjw.inspectline.dao.RoleUserDAO;
import com.tyjw.inspectline.entity.model.RoleDO;
import com.tyjw.inspectline.entity.model.RoleUserDO;
import com.tyjw.inspectline.entity.model.RoleUserDOExample;
import com.tyjw.inspectline.service.RoleUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 角色
 */
@Transactional
@Service(value = "roleUserService")
@Slf4j
public class RoleUserServiceImpl implements RoleUserService {

    @Autowired
    private RoleUserDAO dao;

    @Override
    public RoleUserDO findUserRoleByUid(Long uid) {
        RoleUserDOExample example = new RoleUserDOExample();
        RoleUserDOExample.Criteria criteria = example.createCriteria();
        criteria.andSysUserIdEqualTo(uid);
        List<RoleUserDO> list = dao.selectByExample(example);
        if (null!=list && list.size()==1)
            return list.get(0);
        return null;
    }

    @Override
    public RoleDO findRoleByUid(Long uid) {
        return dao.findRoleByUid(uid);
    }

    @Override
    public long addUserRole(Long uid, Integer roleId) {
        RoleUserDO record = new RoleUserDO();
        record.setSysUserId(uid);
        record.setSysRoleId(roleId);
        return dao.insertSelective(record);
    }

    @Override
    public boolean updateUserRole(Long uid, Integer roleId) {
        RoleUserDOExample example = new RoleUserDOExample();
        RoleUserDOExample.Criteria criteria= example.createCriteria();
        criteria.andSysUserIdEqualTo(uid);
        List<RoleUserDO> list = dao.selectByExample(example);
        if (null!=list && list.size()>0){
            RoleUserDO record = list.get(0);
            record.setSysUserId(uid);
            record.setSysRoleId(roleId);
            int num = dao.updateByPrimaryKeySelective(record);
            if (num==1)
                return true;
            else
                return false;
        }else{
            return false;
        }
    }


}
