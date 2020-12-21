package com.tyjw.inspectline.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tyjw.inspectline.entity.model.DangerBody;
import com.tyjw.inspectline.entity.pojo.DangerPojo;
import com.tyjw.inspectline.entity.vo.DangerBodyVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 险情内容表 Mapper 接口
 * </p>
 *
 * @author tianfei
 * @since 2020-01-06
 */
public interface DangerBodyDAO extends BaseMapper<DangerBody> {


    /**
     * 通过项目id查询每个计划的险情个数
     *
     * @param projectId
     * @return <taskId, count>
     */
    Map<Integer, Integer> selectTaskDangerNumber(@Param("projectId") Integer projectId);

    /**
     * 根据险情处理状态统计
     *
     * @param projectId 项目id
     * @param taskId    任务id
     * @param targetId  目标类型id
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @return
     */
    List<DangerPojo> statusStatistics(@Param("projectId") Integer projectId, @Param("taskId") Integer taskId, @Param("targetId") Integer targetId, @Param("startTime") String startTime, @Param("endTime") String endTime);

    /**
     * 根据险情类型统计
     *
     * @param projectId 项目id
     * @param taskId    任务id
     * @param targetId  目标类型id
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @return
     */
    List<DangerBodyVO> typeStatistics(@Param("projectId") Integer projectId, @Param("taskId") Integer taskId, @Param("targetId") Integer targetId, @Param("startTime") String startTime, @Param("endTime") String endTime);


    /**
     * 通过项目id查询对应的险情数量
     *
     * @param projectId 项目id
     * @return List<taskId   ,   count>
     */
    List<DangerBodyVO> selectDangerNumberByTask(@Param("projectId") Integer projectId);

    /**
     * 分页条件险情列表
     *
     * @param page      分页信息
     * @param taskId    任务id
     * @param targetId  目标类型id
     * @param type      险情类型 1变化检测 2目标检测 3手动标注
     * @param status    险情处理状态 0未指派 1处理中 2已解决
     * @param projectId
     * @return
     */
    IPage<DangerBodyVO> pageList(Page<DangerBodyVO> page, @Param("taskId") Integer taskId, @Param("targetId") Integer targetId, @Param("type") Integer type, @Param("status") Integer status, @Param("moreStatus") List<Integer> moreStatus, @Param("projectId") Integer projectId);

    /**
     * 分页条件险情列表(巡线员)
     *
     * @param page      分页信息
     * @param taskId    任务id
     * @param targetId  目标类型id
     * @param type      险情类型 1变化检测 2目标检测 3手动标注
     * @param status    险情处理状态 0未指派 1处理中 2已解决
     * @param projectId 项目id
     * @param resultUid 巡线处理人
     * @return
     */
    IPage<DangerBodyVO> pageListPatrol(Page<DangerBodyVO> page, @Param("taskId") Integer taskId, @Param("targetId") Integer targetId, @Param("type") Integer type, @Param("status") Integer status, @Param("moreStatus") List<Integer> moreStatus, @Param("projectId") Integer projectId,@Param("resultUid") Long resultUid);
}
