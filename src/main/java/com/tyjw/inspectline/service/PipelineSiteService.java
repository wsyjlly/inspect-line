package com.tyjw.inspectline.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tyjw.inspectline.entity.model.PipelineSiteDO;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 管道站场 服务类
 * </p>
 *
 * @author tianfei
 * @since 2020-02-16
 */
public interface PipelineSiteService extends IService<PipelineSiteDO> {

    /**
     * 通过项目id查询所有站场信息
     * @param projectId
     * @return
     */
    Map<Integer, PipelineSiteDO> queryMapByProjectId(Integer projectId);

    List<PipelineSiteDO> queryList(Integer projectId);
}
