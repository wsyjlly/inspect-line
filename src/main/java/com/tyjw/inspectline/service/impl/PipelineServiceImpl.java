package com.tyjw.inspectline.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tyjw.inspectline.common.Global;
import com.tyjw.inspectline.dao.PipelinePointDAO;
import com.tyjw.inspectline.geo.GeoUtils;
import com.tyjw.inspectline.geo.Point;
import com.tyjw.inspectline.entity.model.PipelinePointDO;
import com.tyjw.inspectline.entity.pojo.ResultEnum;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.service.PipelineService;
import com.vividsolutions.jts.geom.Geometry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 管道信息 服务实现类
 * </p>
 *
 * @author tianfei
 * @since 2020-01-14
 */
@Slf4j
@Service
public class PipelineServiceImpl extends ServiceImpl<PipelinePointDAO, PipelinePointDO> implements PipelineService {

    @Override
    public ResultInfo queryList(Integer projectId) {
        ResultInfo<List<PipelinePointDO>> resultInfo = new ResultInfo<>();
        QueryWrapper<PipelinePointDO> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("project_id",projectId);
        queryWrapper.select("id","lng","lat");
        try {
            List<PipelinePointDO> list = this.list(queryWrapper);
            resultInfo.setResultEnum(ResultEnum.SUCCESS);
            resultInfo.setReturnData(list);
            return resultInfo;
        } catch (Exception e) {
            e.printStackTrace();
            log.error("查询项目：[{}]管道信息异常",projectId);
            resultInfo.setResultEnum(ResultEnum.SYS_SERVER_ERROR);
            return resultInfo;
        }
    }

    @Override
    public List<PipelinePointDO> queryRange(PipelinePointDO firstPoint, PipelinePointDO lastPoint) {
        //查询管道区间段所有点
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.between("id",firstPoint.getId(),lastPoint.getId());
        return this.list(queryWrapper);
    }

    @Override
    public List<Point> getBufferPoints(Integer distance, Integer projectId) {
        //查询桩牌区间所有点
        List<PipelinePointDO> pipelinePointList = this.list();
        List<Point> pointList = new ArrayList<>();
        //生成缓冲区
        for (PipelinePointDO item : pipelinePointList) {
            Point point = new Point();
            BeanUtils.copyProperties(item, point);
            pointList.add(point);
        }
        List<Point> bufferPoints = GeoUtils.queryBuffer(pointList, distance);
//        log.info("生成缓冲区后：[{}]", JSON.toJSONString(bufferPoints));
        return bufferPoints;
    }

    @Override
    public Geometry queryBufferByProjectId(Integer projectId) {
        //查询桩牌区间所有点
        List<PipelinePointDO> pipelinePointList = this.list();
        List<Point> pointList = new ArrayList<>();
        //生成缓冲区
        for (PipelinePointDO item : pipelinePointList) {
            Point point = new Point();
            BeanUtils.copyProperties(item, point);
            pointList.add(point);
        }
        Geometry geometry = GeoUtils.queryGeometry(pointList, 50);
        if (null!=geometry)
            Global.bdMap.put(projectId,geometry);
        return geometry;
    }

}
