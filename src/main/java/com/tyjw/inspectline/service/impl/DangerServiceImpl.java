package com.tyjw.inspectline.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tyjw.inspectline.common.TyjwEnum;
import com.tyjw.inspectline.common.utils.PinYinUtil;
import com.tyjw.inspectline.dao.DangerBodyDAO;
import com.tyjw.inspectline.entity.dto.DangerDTO;
import com.tyjw.inspectline.entity.model.*;
import com.tyjw.inspectline.entity.vo.DangerBodyVO;
import com.tyjw.inspectline.entity.vo.DangerResultVO;
import com.tyjw.inspectline.geo.GeoUtils;
import com.tyjw.inspectline.entity.pojo.DangerPojo;
import com.tyjw.inspectline.entity.pojo.ResultEnum;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.service.*;
import com.tyjw.inspectline.web.websocket.MessageUtils;
import com.vividsolutions.jts.geom.Geometry;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Slf4j
@Service("dangerService")
@Transactional
public class DangerServiceImpl extends ServiceImpl<DangerBodyDAO, DangerBody> implements DangerService {

    @Autowired
    private DangerTargetService dangerTargetService;
    @Autowired
    private DangerResultService dangerResultService;
    @Autowired
    private UserService userService;
    @Autowired
    private DangerBodyDAO dangerBodyDAO;
    @Autowired
    private PlanService planService;
    @Autowired
    private PipelineService pipelineService;


    @Override
    public List<DangerTarget> selectDangerType(Integer projectId) {
        QueryWrapper<DangerTarget> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("project_id", projectId);
        return dangerTargetService.list(queryWrapper);
    }

    @Override
    public ResultInfo insert(DangerDTO dto) {
        DangerBody record = new DangerBody();
        BeanUtils.copyProperties(dto, record);
        record.setStatus(TyjwEnum.DANGER_STATUS_UNASSIGN.getValue());
        record.setType(TyjwEnum.DANGET_TYPE_MANUAL.getValue());
        boolean insert = record.insert();
        if (insert) {
            List<String> ids = new ArrayList<>();
            //如果险情处理人存在，需要添加入库
            if (null != dto.getDangerUsers() && dto.getDangerUsers().size() > 0) {
                List<DangerResult> dangerUserList = new ArrayList<>();
                for (Long uid : dto.getDangerUsers()) {
                    DangerResult dangerResultDO = new DangerResult();
                    dangerResultDO.setBodyId(record.getId());
                    dangerResultDO.setUserId(uid);
                    dangerResultDO.setState(0);
                    dangerResultDO.setCreateTime(new Date());
                    dangerResultDO.setStatus(TyjwEnum.DANGER_STATUS_START.getValue());
                    dangerUserList.add(dangerResultDO);
                    ids.add(uid.toString());
                }
                boolean b = dangerResultService.saveBatch(dangerUserList);
                if (b) {
                    record.setStatus(TyjwEnum.DANGER_STATUS_START.getValue());
                    record.updateById();
                    List<Integer> roleIds = new ArrayList<>();
                    roleIds.add(TyjwEnum.ROLE_ADMIN.getValue());
                    List<UserDO> userList = userService.selectUserByRole(48,roleIds);
                    for (UserDO userDO:userList){
                        ids.add(userDO.getId().toString());
                    }
                    MessageUtils.sendTextMessageToMore(ids,5,record);
                }
            }
        }
        return new ResultInfo(ResultEnum.SUCCESS);
    }

    @Override
    public ResultInfo<Page<DangerBodyVO>> pageList(DangerDTO dto) {
        ResultInfo<Page<DangerBodyVO>> resultInfo = new ResultInfo<>();
        Page<DangerBodyVO> page = new Page<>(dto.getPageNum(), dto.getPageSize());
        page = (Page<DangerBodyVO>) dangerBodyDAO.pageList(page, dto.getTaskId(), dto.getTargetId(), dto.getType(), dto.getStatus(), dto.getMoreStatus(), dto.getProjectId());
        resultInfo.setResultEnum(ResultEnum.SUCCESS);
        resultInfo.setHasNext(page.hasNext() ? 1 : 0);
        resultInfo.setTotal(page.getTotal());
        resultInfo.setReturnData(page);
//        log.info("险情列表：[{}]", JSON.toJSONString(page));
        return resultInfo;
    }

    @Override
    public ResultInfo<Page<DangerBodyVO>> pageListPatrol(DangerDTO dto, Long resultUid) {
        ResultInfo<Page<DangerBodyVO>> resultInfo = new ResultInfo<>();
        Page<DangerBodyVO> page = new Page<>(dto.getPageNum(), dto.getPageSize());
        page = (Page<DangerBodyVO>) dangerBodyDAO.pageListPatrol(page, dto.getTaskId(), dto.getTargetId(), dto.getType(), dto.getStatus(), dto.getMoreStatus(), dto.getProjectId(), resultUid);
        resultInfo.setResultEnum(ResultEnum.SUCCESS);
        resultInfo.setHasNext(page.hasNext() ? 1 : 0);
        resultInfo.setReturnData(page);
        resultInfo.setTotal(page.getTotal());
//        log.info("险情列表：[{}]", JSON.toJSONString(page));
        return resultInfo;
    }

    @Override
    public ResultInfo selectDangerInfo(Long id) {
        ResultInfo<DangerBodyVO> resultInfo = new ResultInfo<>();
        try {
            DangerBody dangerBody = this.getById(id);
            DangerBodyVO vo = new DangerBodyVO();
            List<DangerResultVO> dangerResultVOS = this.dangerResults(id);
            if (null!=dangerResultVOS && dangerResultVOS.size()>0) {
                vo.setDangerResult(dangerResultVOS.get(0));
            }
            BeanUtils.copyProperties(dangerBody, vo);
            resultInfo.setReturnData(vo);
            resultInfo.setResultEnum(ResultEnum.SUCCESS);
            return resultInfo;
        } catch (BeansException e) {
            e.printStackTrace();
            resultInfo.setResultEnum(ResultEnum.SYS_SERVER_ERROR);
            return resultInfo;
        }
    }

    @Override
    public Integer selectNumberByTaskidAndProjectid(int taskid, int projectid) {
        QueryWrapper<DangerBody> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("project_id", projectid);
        queryWrapper.eq("task_id", taskid);
        queryWrapper.eq("state", TyjwEnum.DELETE_NO.getValue());
        return this.count(queryWrapper);
    }

    @Override
    public Map<Integer, Integer> selectTaskDangerNumber(int projectId) {
        return dangerBodyDAO.selectTaskDangerNumber(projectId);
    }

    @Override
    public List<UserDO> queryDangerUsers(Integer projectId) {
        try {
//            List<UserDO> list = userService.selectUserByRole(projectId,TyjwEnum.ROLE_PATROL.getValue());
            List<Integer> roleIds = new ArrayList<>();
            roleIds.add(TyjwEnum.ROLE_PATROL.getValue());
            List<UserDO> list = userService.selectUserByRole(projectId,roleIds);
            return list;
        } catch (Exception e) {
            log.error("查询险情处理人异常.......");
            return new ArrayList<>();
        }
    }

    @Override
    public ResultInfo saveDangerResultDO(DangerResult dangerResultDO) {
        ResultInfo resultInfo = new ResultInfo();
        //查询分配该用户的险情
        QueryWrapper<DangerResult> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("body_id", dangerResultDO.getBodyId());
        queryWrapper.eq("user_id", dangerResultDO.getUserId());
        DangerResult one = dangerResultService.getOne(queryWrapper);
        if (null != one) {
            dangerResultDO.setTimeStamp(new Date());
            dangerResultDO.setId(one.getId());
            dangerResultDO.setStatus(TyjwEnum.DANGER_STATUS_FINISH.getValue());
            //上报处理结果
            boolean success = dangerResultDO.updateById();
            if (success) {
                //修改险情处理状态
                DangerBody dangerBody = new DangerBody();
                dangerBody.setId(dangerResultDO.getBodyId());
                dangerBody.setStatus(TyjwEnum.DANGER_STATUS_FINISH.getValue());
                dangerBody.updateById();
                resultInfo.setResultEnum(ResultEnum.SUCCESS);
            } else {
                resultInfo.setResultEnum(ResultEnum.FAIL);
            }
        } else {
            resultInfo.setResultEnum(ResultEnum.FAIL);
            resultInfo.setMessage("没有查询到需要处理的险情");
        }
        return resultInfo;
    }

    @Override
    public Map<String, Object> statusStatistics(DangerDTO dto) {
        Integer projectId = null;
        Integer taskId = null;
        Integer targetId = null;
        String startTime = null;
        String endTime = null;
        if (null != dto.getProjectId()) {
            projectId = dto.getProjectId();
        }
        if (null != dto.getTaskId()) {
            taskId = dto.getTaskId();
        }
        if (null != dto.getTargetId())//险情类型
        {
            targetId = dto.getTargetId();
        }
        if (StringUtils.isNotBlank(dto.getStartTime())) {
            startTime = dto.getStartTime();
        }
        if (StringUtils.isNotBlank(dto.getEndTime())) {
            endTime = dto.getEndTime();
        }
        Map<String, Object> data = new HashMap<>();
        data.put("newDanger", 0);
        data.put("exeDanger", 0);
        data.put("finishDanger", 0);
        List<DangerPojo> list = dangerBodyDAO.statusStatistics(projectId, taskId, targetId, startTime, endTime);
        if (null != list && list.size() > 0) {
            for (DangerPojo pojo : list) {
                Integer status = pojo.getStatus();
                Integer count = pojo.getCount();
                switch (status) {
                    case 0://未指派
                        data.put("newDanger", count);
                        break;
                    case 1://处理中
                        data.put("exeDanger", count);
                        break;
                    case 2://已处理
                        data.put("finishDanger", count);
                        break;
                    default:
                        break;
                }
            }
        }
        return data;
    }

    @Override
    public Map<String, Integer> typeStatistics(DangerDTO dto) {
        Integer projectId = null;
        Integer taskId = null;
        Integer targetId = null;
        String startTime = null;
        String endTime = null;
        if (null != dto.getProjectId()) {
            projectId = dto.getProjectId();
        }
        if (null != dto.getTaskId()) {
            taskId = dto.getTaskId();
        }
        if (null != dto.getTargetId())//险情类型
        {
            targetId = dto.getTargetId();
        }
        if (StringUtils.isNotBlank(dto.getStartTime())) {
            startTime = dto.getStartTime();
        }
        if (StringUtils.isNotBlank(dto.getEndTime())) {
            endTime = dto.getEndTime();
        }
        List<DangerBodyVO> list = dangerBodyDAO.typeStatistics(projectId, taskId, targetId, startTime, endTime);
        Map<String, Integer> data = new HashMap<>();
        List<DangerTarget> dangerTargets = selectDangerType(projectId);
        for (DangerTarget type : dangerTargets) {
            data.put(PinYinUtil.toPinyin(type.getTargetName()), 0);
        }
        if (null != list && list.size() > 0) {
            for (DangerBodyVO pojo : list) {
                String targetName = pojo.getTargetName();
                Integer count = pojo.getCount();
                data.put(PinYinUtil.toPinyin(targetName), count);
            }
        }
        return data;
    }

    @Override
    public ResultInfo dangerStatistics(DangerDTO dto) {
        ResultInfo resultInfo = new ResultInfo();
        Map<String, Object> map = new HashMap<>();
        try {
            Map<String, Object> stateMap = statusStatistics(dto);
            Map<String, Integer> typeMap = typeStatistics(dto);
            Page<DangerBody> page = new Page<>(dto.getPageNum(), dto.getPageSize());
            QueryWrapper<DangerBody> queryWrapper = new QueryWrapper<>();
            queryWrapper.orderByDesc("id");
            queryWrapper.eq("state", 0);
            queryWrapper.eq("project_id", dto.getProjectId());
            try {
                page = (Page<DangerBody>) page(page, queryWrapper);
            } catch (Exception e) {
                log.error("分页查询险情异常......,参数[{}]", JSON.toJSONString(dto));
            }
            map.put("state", stateMap);
            map.put("type", typeMap);
            map.put("list", page.getRecords());
            resultInfo.setHasNext(page.hasNext() ? 1 : 0);
            resultInfo.setTotal((int) page.getTotal());
            resultInfo.setReturnData(map);
            resultInfo.setResultEnum(ResultEnum.SUCCESS);
            return resultInfo;
        } catch (Exception e) {
            log.error("异常......{}", e.getMessage());
            resultInfo.setResultEnum(ResultEnum.SYS_SERVER_ERROR);
            resultInfo.setReturnData(map);
            return resultInfo;
        }
    }

    @Override
    public List<DangerBodyVO> selectDangerNumberByTask(Integer projectId) {
        return dangerBodyDAO.selectDangerNumberByTask(projectId);
    }

    @Override
    public List<DangerResultVO> dangerResults(Long id) {
        QueryWrapper<DangerResult> queryWrapper = new QueryWrapper();
        queryWrapper.orderByDesc("status");
        queryWrapper.eq("body_id", id);
        try {
            List<DangerResult> queryList = dangerResultService.list(queryWrapper);
            if (null == queryList) {
                return new ArrayList<>();
            }
            List<DangerResultVO> list = new ArrayList<>();
            for (DangerResult item : queryList) {
                DangerResultVO vo = new DangerResultVO();
                BeanUtils.copyProperties(item,vo);
                //查询险情信息
                DangerBody dangerBody = this.getById(item.getBodyId());
                vo.setType(dangerBody.getType());
                //查询险情责任人信息
                UserDO dangerUser = userService.selectUserById(item.getUserId());
                vo.setUserName(dangerUser.getUserName());
                vo.setPhone(dangerUser.getPhone());
                list.add(vo);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            log.error("查询险情处理结果异常[{}]", e);
            return new ArrayList<>();
        }
    }

    @Override
    public ResultInfo modify(DangerDTO dto) {
        DangerBody record = this.getById(dto.getId());
        BeanUtils.copyProperties(dto, record);
        record.setState(0);
        boolean b = record.updateById();
        if (b){
            List<String> ids = new ArrayList<>();
            //如果险情处理人存在，需要添加入库
            if (null != dto.getDangerUsers() && dto.getDangerUsers().size() > 0) {
                List<DangerResult> dangerUserList = new ArrayList<>();
                for (Long uid : dto.getDangerUsers()) {
                    QueryWrapper<DangerResult> queryWrapper = new QueryWrapper<>();
                    queryWrapper.eq("body_id",record.getId());
                    queryWrapper.eq("user_id",uid);
                    DangerResult findOne = dangerResultService.getOne(queryWrapper);
                    if (findOne!=null) {
                        break;
                    }
                    DangerResult dangerResultDO = new DangerResult();
                    dangerResultDO.setBodyId(record.getId());
                    dangerResultDO.setUserId(uid);
                    dangerResultDO.setState(0);
                    dangerResultDO.setCreateTime(new Date());
                    dangerResultDO.setStatus(TyjwEnum.DANGER_STATUS_START.getValue());
                    dangerUserList.add(dangerResultDO);
                    ids.add(uid.toString());
                }
                boolean success = dangerResultService.saveBatch(dangerUserList);
                if (success) {
                    record.setStatus(TyjwEnum.DANGER_STATUS_START.getValue());
                    record.updateById();
                    List<Integer> roleIds = new ArrayList<>();
                    roleIds.add(TyjwEnum.ROLE_ADMIN.getValue());
                    List<UserDO> userList = userService.selectUserByRole(48,roleIds);
                    for (UserDO userDO:userList){
                        ids.add(userDO.getId().toString());
                    }
                    MessageUtils.sendTextMessageToMore(ids,5,record);
                }
            }
            return new ResultInfo(ResultEnum.SUCCESS);
        }
        return new ResultInfo(ResultEnum.FAIL);
    }

    @Override
    public boolean saveAiDanger(DangerBody record) {
        if(record.getCredibility()<0.9) {
            return false;
        }
        PlanDO planDO = planService.queryById(record.getTaskId());
//        record.setProjectId(planDO.getProjectId());
        record.setProjectId(47);
        Geometry bg = pipelineService.queryBufferByProjectId(47);
        boolean intersects = GeoUtils.intersects(record.getLng(), record.getLat(), bg);
        if (!intersects){
            log.info("该险情坐标不在管道附近：[{},{}]",record.getLng(),record.getLat());
            return false;
        }
        record.setStatus(TyjwEnum.DANGER_STATUS_UNASSIGN.getValue());
        record.setState(0);
        boolean saveResult = this.save(record);
        if (saveResult){
            List<Integer> roleIds = new ArrayList<>();
            roleIds.add(TyjwEnum.ROLE_ADMIN.getValue());
            List<UserDO> userList = userService.selectUserByRole(48,roleIds);
            List<String> ids = new ArrayList<>();
            for (UserDO userDO:userList){
                ids.add(userDO.getId().toString());
            }
            MessageUtils.sendTextMessageToMore(ids,5,record);
        }
        return saveResult;
    }

    @Override
    public int getAiCheckStatus(Integer taskId) {
        return 0;
    }
}
