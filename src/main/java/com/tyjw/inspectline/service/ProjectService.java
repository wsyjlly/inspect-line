package com.tyjw.inspectline.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tyjw.inspectline.entity.model.ProjectDO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author tianfei
 * @since 2020-02-27
 */
public interface ProjectService extends IService<ProjectDO> {

    /**
     * 查詢所有項目列表
     * @return
     */
    List<ProjectDO> queryList();

    /**
     * 通过项目id查询
     * @return
     */
    ProjectDO queryByProjectId(Integer projectId);

}
