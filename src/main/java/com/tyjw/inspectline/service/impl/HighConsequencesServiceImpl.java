package com.tyjw.inspectline.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tyjw.inspectline.common.TyjwEnum;
import com.tyjw.inspectline.dao.HighConsequencesDAO;
import com.tyjw.inspectline.entity.dto.HighConsequencesDTO;
import com.tyjw.inspectline.geo.GeoUtils;
import com.tyjw.inspectline.geo.Point;
import com.tyjw.inspectline.entity.model.*;
import com.tyjw.inspectline.entity.pojo.ResultEnum;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.service.*;
import com.tyjw.inspectline.entity.vo.HighConsequencesTypeMappingVO;
import com.tyjw.inspectline.entity.vo.HighConsequencesVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 高后果区 服务实现类
 * </p>
 *
 * @author tianfei
 * @since 2019-12-24
 */
@Service
@Transactional
@Slf4j
public class HighConsequencesServiceImpl extends ServiceImpl<HighConsequencesDAO, HighConsequencesDO> implements HighConsequencesService {

    @Autowired
    private PipelineService pipelineService;
    @Autowired
    private SysDictService sysDictService;
    @Autowired
    private PipelineInfoService pipelineInfoService;
    @Autowired
    private PipelineSiteService pipelineSiteService;
    @Autowired
    private PipelineCardService pipelineCardService;
    @Autowired
    private HighConsequencesTypeMappingService highConsequencesTypeMappingService;

    @Override
    public ResultInfo<HighConsequencesDO> insert(HighConsequencesDTO dto) {
        HighConsequencesDO record = new HighConsequencesDO();
        BeanUtils.copyProperties(dto, record);
        ResultInfo<HighConsequencesDO> resultInfo = new ResultInfo<>(ResultEnum.FAIL);
        if (record.getBufferPoints() == null) {
            //生成缓冲区
            List<Point> bufferPoints = getBufferPoints(record.getStartCardId(), record.getEndCardId(), record.getDistance(), record.getProjectId());
            record.setBufferPoints(JSON.toJSONString(bufferPoints));
        }
        //查询基础设施类型
        QueryWrapper<SysDict> queryWrapperType = new QueryWrapper<>();
        queryWrapperType.eq("type", TyjwEnum.DICT_TYPE_FACILITIES_HIGH_CONSEQUENCES.getValue());
        queryWrapperType.eq("project_id", record.getProjectId());
        SysDict sysDict = sysDictService.getOne(queryWrapperType);
        record.setType(sysDict.getId());
        record.setState(TyjwEnum.DELETE_NO.getValue());
        boolean success = record.insert();
        if (success) {
            if (dto.getHighTypeList() != null && dto.getHighTypeList().size() > 0) {
                for (Integer typeId : dto.getHighTypeList()) {
                    HighConsequencesTypeMappingDO hctDO = new HighConsequencesTypeMappingDO();
                    hctDO.setHighId(record.getId());
                    hctDO.setTypeId(typeId);
                    hctDO.insert();
                }
            }
            resultInfo.setResultEnum(ResultEnum.SUCCESS);
            resultInfo.setReturnData(record);
        }
        return resultInfo;
    }

    @Override
    public ResultInfo<Page<HighConsequencesVO>> pageList(HighConsequencesDTO dto) {
        ResultInfo<Page<HighConsequencesVO>> resultInfo = new ResultInfo<>();
        String beginDate = null;
        String endDate = null;
        try {
            QueryWrapper<HighConsequencesDO> qw = new QueryWrapper<>();
            qw.orderByDesc("id");
            qw.eq("state", 0);
            if (dto.getPipeInfoId() != null && dto.getPipeInfoId()!= TyjwEnum.SELECT_OPTION_ALL.getValue())
                qw.eq("pipe_info_id", dto.getPipeInfoId());
            if (dto.getPipeSiteId() != null && dto.getPipeSiteId()!= TyjwEnum.SELECT_OPTION_ALL.getValue())
                qw.eq("pipe_site_id", dto.getPipeSiteId());
            if (dto.getLevel() != null && dto.getLevel()!= TyjwEnum.SELECT_OPTION_ALL.getValue())
                qw.eq("level", dto.getLevel());
            if (StringUtils.isNotBlank(dto.getNumber()))
                qw.like(true, "number", dto.getNumber());
            Page<HighConsequencesDO> page = new Page<>(dto.getPageNum(), dto.getPageSize());
            page = (Page<HighConsequencesDO>) this.page(page, qw);
            List<HighConsequencesVO> list = new ArrayList<>();
            if (page.getTotal() > 0) {
                //查询基础设施类型
                QueryWrapper<SysDict> queryWrapperType = new QueryWrapper<>();
                queryWrapperType.eq("type", TyjwEnum.DICT_TYPE_FACILITIES_HIGH_CONSEQUENCES.getValue());
                queryWrapperType.eq("project_id", dto.getProjectId());
                SysDict sysDict = sysDictService.getOne(queryWrapperType);
                //管道信息
                Map<Integer, PipelineInfoDO> pipelineInfoMap = pipelineInfoService.queryMapByProjectId(dto.getProjectId());
                //站场信息
                Map<Integer, PipelineSiteDO> pipeSiteMap = pipelineSiteService.queryMapByProjectId(dto.getProjectId());
                for (HighConsequencesDO item : page.getRecords()) {
                    HighConsequencesVO vo = new HighConsequencesVO();
                    BeanUtils.copyProperties(item, vo);
                    try {
                        if (null != sysDict) {
                            vo.setTypeName(sysDict.getName());
                            vo.setIcon(sysDict.getImage());
                        }
                        if (null != item.getPipeInfoId() && pipelineInfoMap.containsKey(item.getPipeInfoId()))
                            vo.setPipeInfoName(pipelineInfoMap.get(item.getPipeInfoId()).getName());
                        if (null != item.getPipeSiteId() && pipeSiteMap.containsKey(item.getPipeSiteId()))
                            vo.setPipeSiteName(pipeSiteMap.get(item.getPipeSiteId()).getName());
                        if (item.getStartCardId() != null) {
                            PipelineCardDO startCard = pipelineCardService.getById(item.getStartCardId());
                            vo.setStartCardSysPineNo(startCard.getSysPipeNo());
                        }
                        if (item.getEndCardId() != null) {
                            PipelineCardDO endCard = pipelineCardService.getById(item.getEndCardId());
                            vo.setEndCardSysPineNo(endCard.getSysPipeNo());
                        }
                        //查询高后果区类型
                        List<HighConsequencesTypeMappingVO> highTypeList = highConsequencesTypeMappingService.queryListByHighId(item.getId(), item.getProjectId());
                        vo.setHighTypeList(highTypeList);
                        list.add(vo);
                    } catch (Exception e) {
                        e.printStackTrace();
                        list.add(vo);
                    }
                }
            }
            Page<HighConsequencesVO> pageVO = new Page<>();
            BeanUtils.copyProperties(page, pageVO);
            pageVO.setRecords(list);
            resultInfo.setResultEnum(ResultEnum.SUCCESS);
            resultInfo.setHasNext(pageVO.hasNext() ? 1 : 0);
            resultInfo.setTotal(pageVO.getTotal());
            resultInfo.setReturnData(pageVO);
            return resultInfo;
        } catch (BeansException e) {
            e.printStackTrace();
            resultInfo.setResultEnum(ResultEnum.SYS_SERVER_ERROR);
            return resultInfo;
        }
    }

    @Override
    public List<Point> getBufferPoints(HighConsequencesDO record) {
        //生成缓冲区
        List<PipelinePointDO> points = JSON.parseArray(record.getPipelinePoints(), PipelinePointDO.class);
        if (null != points && points.size() > 1) {
            //按照管道id 将点进行排序
            Collections.sort(points);
            PipelinePointDO firstPoint = points.get(0);
            PipelinePointDO lastPoint = points.get(points.size() - 1);
            //查询管道区间所有点
            List<PipelinePointDO> pipelinePointDOList = pipelineService.queryRange(firstPoint, lastPoint);
            List<Point> pointList = new ArrayList<>();

            log.info("管道区间所有点：[{}]", JSON.toJSONString(pointList));
            //生成缓冲区
            for (PipelinePointDO pipelinePointDO : pipelinePointDOList) {
                Point point = new Point();
                BeanUtils.copyProperties(pipelinePointDO, point);
                pointList.add(point);
            }
            List<Point> bufferPoints = GeoUtils.queryBuffer(pointList, record.getDistance());
            log.info("生成缓冲区后：[{}]", JSON.toJSONString(bufferPoints));
            return bufferPoints;
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public List<SysDict> queryHighTypes(Integer projectId) {
        SysDict sysDict = new SysDict();
        sysDict.setProjectId(projectId);
        sysDict.setType(TyjwEnum.DICT_TYPE_HIGH_CONSEQUENCES_TYPE.getValue());
        return sysDictService.queryList(sysDict);
    }

    @Override
    public List<Point> getBufferPoints(Integer startCardId, Integer endCardId, Integer distance, Integer projectId) {
        //查询桩牌区间所有点
        List<PipelineCardDO> pipelineCardList = pipelineCardService.queryRange(startCardId, endCardId, projectId);
        List<Point> pointList = new ArrayList<>();

        log.info("桩牌区间所有点：[{}]", JSON.toJSONString(pointList));
        //生成缓冲区
        for (PipelineCardDO item : pipelineCardList) {
            Point point = new Point();
            BeanUtils.copyProperties(item, point);
            pointList.add(point);
        }
        List<Point> bufferPoints = GeoUtils.queryBuffer(pointList, distance);
        log.info("生成缓冲区后：[{}]", JSON.toJSONString(bufferPoints));
        return bufferPoints;
    }

    @Override
    public ResultInfo modify(HighConsequencesDTO dto) {
        HighConsequencesDO record = new HighConsequencesDO();
        BeanUtils.copyProperties(dto, record);
        ResultInfo<HighConsequencesDO> resultInfo = new ResultInfo<>(ResultEnum.FAIL);
        if (record.getStartCardId() != null && record.getEndCardId() != null) {
            //生成缓冲区
            List<Point> bufferPoints = getBufferPoints(record.getStartCardId(), record.getEndCardId(), record.getDistance(), record.getProjectId());
            record.setBufferPoints(JSON.toJSONString(bufferPoints));
        }
        boolean success = record.updateById();
        if (success) {
            if (dto.getHighTypeList() != null && dto.getHighTypeList().size() > 0) {
                //删除之前映射数据
                QueryWrapper<HighConsequencesTypeMappingDO> queryWrapper = new QueryWrapper<>();
                queryWrapper.eq("high_id", record.getId());
                highConsequencesTypeMappingService.remove(queryWrapper);
                for (Integer typeId : dto.getHighTypeList()) {
                    HighConsequencesTypeMappingDO hctDO = new HighConsequencesTypeMappingDO();
                    hctDO.setHighId(record.getId());
                    hctDO.setTypeId(typeId);
                    hctDO.insert();
                }
            }
            resultInfo.setResultEnum(ResultEnum.SUCCESS);
//            resultInfo.setReturnData(record);
        }
        return resultInfo;
    }

    @Override
    public ResultInfo delete(Integer id) {
        HighConsequencesDO record = new HighConsequencesDO();
        record.setId(id);
        record.setState(TyjwEnum.DELETE_YES.getValue());
        ResultInfo resultInfo = new ResultInfo<>(ResultEnum.FAIL);
        if (record.updateById()) {
            return resultInfo.setResultEnum(ResultEnum.SUCCESS);
        }
        return resultInfo;
    }
}
