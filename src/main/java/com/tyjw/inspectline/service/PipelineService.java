package com.tyjw.inspectline.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tyjw.inspectline.geo.Point;
import com.tyjw.inspectline.entity.model.PipelinePointDO;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.vividsolutions.jts.geom.Geometry;

import java.util.List;

/**
 * <p>
 * 管道信息 服务类
 * </p>
 *
 * @author tianfei
 * @since 2020-01-14
 */
public interface PipelineService extends IService<PipelinePointDO> {

    /**
     * 查询管道数据
     * @param projectId
     * @return
     */
    ResultInfo queryList(Integer projectId);

    /**
     * 通过id 排序，查询区间段所有管道信息点集合
     * @param firstPoint
     * @param lastPoint
     * @return
     */
    List<PipelinePointDO> queryRange(PipelinePointDO firstPoint, PipelinePointDO lastPoint);

    /**
     * 获取管道中心线电子围栏
     *
     * @param distance 边界距离
     * @param projectId 项目id
     * @return
     */
    List<Point> getBufferPoints(Integer distance, Integer projectId);

    /**
     * 通过项目id 查询对应缓冲区（50m）
     * @param projectId
     * @return
     */
    Geometry queryBufferByProjectId(Integer projectId);
}
