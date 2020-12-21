package com.tyjw.inspectline.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tyjw.inspectline.common.TyjwEnum;
import com.tyjw.inspectline.dao.ConstructionUnitDAO;
import com.tyjw.inspectline.entity.dto.ConstructionUnitDTO;
import com.tyjw.inspectline.entity.model.ConstructionUnitDO;
import com.tyjw.inspectline.entity.model.PipelineInfoDO;
import com.tyjw.inspectline.entity.model.PipelineSiteDO;
import com.tyjw.inspectline.entity.model.SysDict;
import com.tyjw.inspectline.entity.pojo.ResultEnum;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.service.ConstructionUnitService;
import com.tyjw.inspectline.service.PipelineInfoService;
import com.tyjw.inspectline.service.PipelineSiteService;
import com.tyjw.inspectline.service.SysDictService;
import com.tyjw.inspectline.entity.vo.ConstructionUnitVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 施工单位 服务实现类
 * </p>
 *
 * @author tianfei
 * @since 2019-12-24
 */
@Service
public class ConstructionUnitServiceImpl extends ServiceImpl<ConstructionUnitDAO, ConstructionUnitDO> implements ConstructionUnitService {

    @Autowired
    private SysDictService sysDictService;
    @Autowired
    private PipelineInfoService pipelineInfoService;
    @Autowired
    private PipelineSiteService pipelineSiteService;

    @Override
    public ResultInfo<ConstructionUnitDO> insert(ConstructionUnitDO record) {
        ResultInfo<ConstructionUnitDO> resultInfo = new ResultInfo<>(ResultEnum.FAIL);
        //查询基础设施类型
        QueryWrapper<SysDict> queryWrapperType = new QueryWrapper<>();
        queryWrapperType.eq("type", TyjwEnum.DICT_TYPE_FACILITIES_CONSTRUCTION_UNIT.getValue());
        queryWrapperType.eq("project_id", record.getProjectId());
        SysDict sysDict = sysDictService.getOne(queryWrapperType);
        record.setType(sysDict.getId());
        boolean success = record.insert();
        if (success) {
            resultInfo.setResultEnum(ResultEnum.SUCCESS);
            resultInfo.setReturnData(record);
        }
        return resultInfo;
    }

    @Override
    public ResultInfo<Page<ConstructionUnitVO>> pageList(ConstructionUnitDTO dto) {
        ResultInfo<Page<ConstructionUnitVO>> resultInfo = new ResultInfo<>();
        String beginDate = null;
        String endDate = null;
        try {
            QueryWrapper<ConstructionUnitDO> qw = new QueryWrapper<>();
            qw.orderByDesc("id");
            qw.eq("state", 0);
            qw.eq("project_id", dto.getProjectId());
            if (StringUtils.isNotBlank(dto.getName()))
                qw.like(true,"name",dto.getName());
            if (StringUtils.isNotBlank(dto.getNumber()))
                qw.like(true,"number",dto.getNumber());
            if (null!=dto.getConstructionType() && dto.getConstructionType()!= TyjwEnum.SELECT_OPTION_ALL.getValue())
                qw.eq("construction_type",dto.getConstructionType());
            if (null!=dto.getPipeInfoId() && dto.getPipeInfoId()!= TyjwEnum.SELECT_OPTION_ALL.getValue())
                qw.eq("pipe_info_id",dto.getPipeInfoId());
            if (null!=dto.getPipeSiteId() && dto.getPipeSiteId()!= TyjwEnum.SELECT_OPTION_ALL.getValue())
                qw.eq("pipe_site_id",dto.getPipeSiteId());
            Page<ConstructionUnitDO> page = new Page<>(dto.getPageNum(), dto.getPageSize());
            page = (Page<ConstructionUnitDO>) this.page(page, qw);
            List<ConstructionUnitVO> list = new ArrayList<>();
            if (page.getTotal() > 0) {
                //查询基础设施类型
                QueryWrapper<SysDict> queryWrapperType = new QueryWrapper<>();
                queryWrapperType.eq("type", TyjwEnum.DICT_TYPE_FACILITIES_CONSTRUCTION_UNIT.getValue());
                queryWrapperType.eq("project_id", dto.getProjectId());
                SysDict sysDict = sysDictService.getOne(queryWrapperType);
                String icon = sysDict.getImage();
                String typeName = sysDict.getName();
                //查询阀室类型
                Map<Integer, SysDict> constructionTypeMap = sysDictService.queryListByProjectIdAndType(dto.getProjectId(), TyjwEnum.DICT_TYPE_CONSTRUCTION_UNIT.getValue());
                //管道信息
                Map<Integer, PipelineInfoDO> pipelineInfoMap = pipelineInfoService.queryMapByProjectId(dto.getProjectId());
                //站场信息
                Map<Integer, PipelineSiteDO> pipeSiteMap = pipelineSiteService.queryMapByProjectId(dto.getProjectId());
                for (ConstructionUnitDO item : page.getRecords()) {
                    ConstructionUnitVO vo = new ConstructionUnitVO();
                    BeanUtils.copyProperties(item, vo);
                    try {
                        vo.setTypeName(typeName);
                        vo.setIcon(icon);
                        if (null != item.getPipeInfoId() && pipelineInfoMap.containsKey(item.getPipeInfoId()))
                            vo.setPipeInfoName(pipelineInfoMap.get(item.getPipeInfoId()).getName());
                        if (null != item.getPipeSiteId() && pipeSiteMap.containsKey(item.getPipeSiteId()))
                            vo.setPipeSiteName(pipeSiteMap.get(item.getPipeSiteId()).getName());
                        if (null!=item.getConstructionType() && constructionTypeMap.containsKey(item.getConstructionType()))
                            vo.setConstructionTypeName(constructionTypeMap.get(item.getConstructionType()).getName());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    list.add(vo);
                }
            }
            Page<ConstructionUnitVO> pageVO = new Page<>();
            BeanUtils.copyProperties(page, pageVO);
            pageVO.setRecords(list);
            resultInfo.setResultEnum(ResultEnum.SUCCESS);
            resultInfo.setHasNext(pageVO.hasNext() ? 1 : 0);
            resultInfo.setReturnData(pageVO);
            resultInfo.setTotal(pageVO.getTotal());
            return resultInfo;
        } catch (BeansException e) {
            e.printStackTrace();
            resultInfo.setResultEnum(ResultEnum.SYS_SERVER_ERROR);
            return resultInfo;
        }
    }

    @Override
    public ResultInfo modify(ConstructionUnitDO record) {
        ResultInfo resultInfo = new ResultInfo<>(ResultEnum.FAIL);
        if (record.updateById()) {
            resultInfo.setResultEnum(ResultEnum.SUCCESS);
            return resultInfo;
        }
        return resultInfo;
    }

    @Override
    public ResultInfo delete(Integer id) {
        ConstructionUnitDO record = new ConstructionUnitDO();
        record.setId(id);
        record.setState(TyjwEnum.DELETE_YES.getValue());
        ResultInfo resultInfo = new ResultInfo<>(ResultEnum.FAIL);
        if (record.updateById()) {
            return resultInfo.setResultEnum(ResultEnum.SUCCESS);
        }
        return resultInfo;
    }

    @Override
    public List<SysDict> queryConstructionUnitType(Integer projectId) {
        SysDict sysDict = new SysDict();
        sysDict.setProjectId(projectId);
        sysDict.setType(TyjwEnum.DICT_TYPE_CONSTRUCTION_UNIT.getValue());
        return sysDictService.queryList(sysDict);
    }
}
