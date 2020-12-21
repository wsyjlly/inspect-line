package com.tyjw.inspectline.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tyjw.inspectline.entity.model.UserDO;
import com.tyjw.inspectline.entity.pojo.ResultInfo;

import java.util.List;

public interface UserService extends IService<UserDO> {
    /**
     * 登录操作
     * @param userDO
     * @return
     */
    ResultInfo login(UserDO userDO);

    /**
     * 退出登录
     * @return
     */
    ResultInfo loginout(Long uid);

    /**
     * 通过用户id查询用户
     * @param uid
     * @return
     */
    UserDO selectUserById(Long uid);

    /**
     * 通过uid查询缓存用户信息
     * @param uid
     * @return
     */
    UserDO cacheUserById(Long uid);

    /**
     * 根据角色查询用户
     * @param roles
     * @return
     */
    List<UserDO> selectUserByRole(Integer projectId, List<Integer> roleIds);



}
