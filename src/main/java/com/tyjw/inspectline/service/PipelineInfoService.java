package com.tyjw.inspectline.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tyjw.inspectline.entity.model.PipelineInfoDO;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 管道信息 服务类
 * </p>
 *
 * @author tianfei
 * @since 2020-02-16
 */
public interface PipelineInfoService extends IService<PipelineInfoDO> {

    /**
     * 通过项目id查询所有管道信息
     * @param projectId
     * @return
     */
    Map<Integer, PipelineInfoDO> queryMapByProjectId(Integer projectId);

    List<PipelineInfoDO> queryList(Integer projectId);
}
