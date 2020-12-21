package com.tyjw.inspectline.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tyjw.inspectline.entity.dto.PlanDTO;
import com.tyjw.inspectline.entity.model.PlanDO;
import com.tyjw.inspectline.entity.model.PlanDOExample;
import com.tyjw.inspectline.entity.vo.PlanVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * PlanDAO继承基类
 */
@Repository
public interface PlanDAO extends MyBatisBaseDao<PlanDO, Integer, PlanDOExample>,BaseMapper<PlanDO> {
    Map<String,Object> flightStatistics(PlanDTO dto);

    /**
     * 分页查询历史任务列表
     * @param page
     * @param planName
     * @param startTime
     * @param endTime
     * @param dangerSort
     * @param projectId
     * @return
     */
    IPage<PlanVO> historyPageList(Page<PlanVO> page, @Param("planName") String planName, @Param("startTime") String startTime, @Param("endTime") String endTime, @Param("dangerSort") Integer dangerSort, @Param("projectId") Integer projectId);
}