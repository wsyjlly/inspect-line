package com.tyjw.inspectline.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tyjw.inspectline.common.TyjwEnum;
import com.tyjw.inspectline.dao.ProjectDAO;
import com.tyjw.inspectline.entity.model.ProjectDO;
import com.tyjw.inspectline.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tianfei
 * @since 2020-02-27
 */
@Service
public class ProjectServiceImpl extends ServiceImpl<ProjectDAO, ProjectDO> implements ProjectService {

    @Override
    public List<ProjectDO> queryList() {
        QueryWrapper<ProjectDO> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("state", TyjwEnum.DELETE_NO);
        return this.list(queryWrapper);
    }

    @Override
    public ProjectDO queryByProjectId(Integer projectId) {
        QueryWrapper<ProjectDO> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("state", TyjwEnum.DELETE_NO);
        queryWrapper.eq("project_id",projectId);
        return this.getOne(queryWrapper);
    }
}
