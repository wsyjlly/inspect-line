package com.tyjw.inspectline.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tyjw.inspectline.entity.dto.DangerDTO;
import com.tyjw.inspectline.entity.model.DangerBody;
import com.tyjw.inspectline.entity.model.DangerResult;
import com.tyjw.inspectline.entity.model.DangerTarget;
import com.tyjw.inspectline.entity.model.UserDO;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.entity.vo.DangerBodyVO;
import com.tyjw.inspectline.entity.vo.DangerResultVO;

import java.util.List;
import java.util.Map;


public interface DangerService {

    /**
     * 查询险情类型列表
     *
     * @param project 项目id
     * @return
     */
    List<DangerTarget> selectDangerType(Integer projectId);

    /**
     * 险情标注
     *
     * @param record
     * @return
     */
    ResultInfo insert(DangerDTO record);

    /**
     * 查询险情列表-分页
     *
     * @param param
     * @return
     */
    ResultInfo<Page<DangerBodyVO>> pageList(DangerDTO param);

    /**
     * 分页条件险情列表(巡线员)
     * @param dto
     * @param resultUid 巡线员id
     * @return
     */
    ResultInfo<Page<DangerBodyVO>> pageListPatrol(DangerDTO dto, Long resultUid);

    /**
     * 查询详情
     *
     * @param id
     * @return
     */
    ResultInfo selectDangerInfo(Long id);


    /**
     * 通过任务id和项目id查询险情数量
     *
     * @param taskid    任务id
     * @param projectid 项目id
     * @return
     */
    Integer selectNumberByTaskidAndProjectid(int taskid, int projectid);

    /**
     * 查询计划列表险情个数
     *
     * @param projectid
     * @return <taskId, count>
     */
    Map<Integer, Integer> selectTaskDangerNumber(int projectid);



    /**
     * 查询需要分配的险情责任人
     *
     * @param projectId
     * @return
     */
    List<UserDO> queryDangerUsers(Integer projectId);

    /**
     * 上报险情处理结果
     *
     * @param DangerResultDO
     * @return
     */
    ResultInfo saveDangerResultDO(DangerResult DangerResultDO);

    /**
     * 险情状态数据统计
     * taskName 任务名称
     * targetId 险情类型表id
     * startTime    开始时间（yyyy-MM-dd）
     * endTime  结束时间（yyyy-MM-dd）
     *
     * @param dto
     * @return
     */
    Map<String, Object> statusStatistics(DangerDTO dto);


    /**
     * 险情分类数据统计
     * taskName 任务名称
     * targetId 险情类型表id
     * startTime    开始时间（yyyy-MM-dd）
     * endTime  结束时间（yyyy-MM-dd）
     *
     * @param dto
     * @return
     */
    Map<String, Integer> typeStatistics(DangerDTO dto);

    ResultInfo dangerStatistics(DangerDTO dto);

    /**
     * 通过任务查询对应的险情数量
     *
     * @param projectId 项目id
     * @return List<taskId   ,   count>
     */
    List<DangerBodyVO> selectDangerNumberByTask(Integer projectId);

    /**
     * 查询险情处理结果
     *
     * @param id 险情id
     * @return
     */
    List<DangerResultVO> dangerResults(Long id);


    /**
     * 修改险情
     * @param record
     * @return
     */
    ResultInfo modify(DangerDTO record);

    /**
     * 保存AI检测结果
     * @param dangerBody
     * @return
     */
    boolean saveAiDanger(DangerBody dangerBody);

    /**
     * 获取AI检测状态
     *
     * @param taskId
     * @param status
     */
    int getAiCheckStatus(Integer taskId);
}
