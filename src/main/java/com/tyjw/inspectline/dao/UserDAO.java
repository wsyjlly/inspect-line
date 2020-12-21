package com.tyjw.inspectline.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tyjw.inspectline.entity.model.UserDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author tianfei
 * @since 2020-01-08
 */
public interface UserDAO extends BaseMapper<UserDO> {
    List<UserDO> selectUserByRole(@Param("projectId") Integer projectId, @Param("list") List<Integer> roles);
}