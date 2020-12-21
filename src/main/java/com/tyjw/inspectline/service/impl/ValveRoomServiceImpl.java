package com.tyjw.inspectline.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tyjw.inspectline.common.TyjwEnum;
import com.tyjw.inspectline.dao.ValveRoomDAO;
import com.tyjw.inspectline.entity.dto.ValveRoomDTO;
import com.tyjw.inspectline.entity.model.PipelineInfoDO;
import com.tyjw.inspectline.entity.model.PipelineSiteDO;
import com.tyjw.inspectline.entity.model.SysDict;
import com.tyjw.inspectline.entity.model.ValveRoomDO;
import com.tyjw.inspectline.entity.pojo.ResultEnum;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.service.PipelineInfoService;
import com.tyjw.inspectline.service.PipelineSiteService;
import com.tyjw.inspectline.service.SysDictService;
import com.tyjw.inspectline.service.ValveRoomService;
import com.tyjw.inspectline.entity.vo.ValveRoomVO;
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
 * 阀室 服务实现类
 * </p>
 *
 * @author tianfei
 * @since 2019-12-24
 */
@Service
public class ValveRoomServiceImpl extends ServiceImpl<ValveRoomDAO, ValveRoomDO> implements ValveRoomService {

    @Autowired
    private SysDictService sysDictService;
    @Autowired
    private PipelineInfoService pipelineInfoService;
    @Autowired
    private PipelineSiteService pipelineSiteService;

    @Override
    public ResultInfo<ValveRoomDO> insert(ValveRoomDO record) {
        ResultInfo<ValveRoomDO> resultInfo = new ResultInfo<>(ResultEnum.FAIL);
        //查询基础设施类型
        QueryWrapper<SysDict> queryWrapperType = new QueryWrapper<>();
        queryWrapperType.eq("type", TyjwEnum.DICT_TYPE_FACILITIES_VALVE_ROOM.getValue());
        queryWrapperType.eq("project_id", record.getProjectId());
        SysDict sysDict = sysDictService.getOne(queryWrapperType);
        record.setType(sysDict.getId());
        record.setState(TyjwEnum.DELETE_NO.getValue());
        boolean success = record.insert();
        if (success) {
            resultInfo.setResultEnum(ResultEnum.SUCCESS);
            resultInfo.setReturnData(record);
        }
        return resultInfo;
    }

    @Override
    public ResultInfo<Page<ValveRoomVO>> pageList(ValveRoomDTO dto) {
        ResultInfo<Page<ValveRoomVO>> resultInfo = new ResultInfo<>();
        try {
            QueryWrapper<ValveRoomDO> qw = new QueryWrapper<>();
            qw.orderByDesc("id");
            qw.eq("state", 0);
            qw.eq("project_id", dto.getProjectId());
            if (StringUtils.isNotBlank(dto.getName()))
                qw.like(true,"name",dto.getName());
            if (StringUtils.isNotBlank(dto.getNumber()))
                qw.like(true,"number",dto.getNumber());
            if (null!=dto.getValveType() && dto.getValveType()!= TyjwEnum.SELECT_OPTION_ALL.getValue())
                qw.eq("valve_type",dto.getValveType());
            if (null!=dto.getPipeInfoId() && dto.getPipeInfoId()!= TyjwEnum.SELECT_OPTION_ALL.getValue())
                qw.eq("pipe_info_id",dto.getPipeInfoId());
            if (null!=dto.getPipeSiteId() && dto.getPipeSiteId()!= TyjwEnum.SELECT_OPTION_ALL.getValue())
                qw.eq("pipe_site_id",dto.getPipeSiteId());
            Page<ValveRoomDO> page = new Page<>(dto.getPageNum(), dto.getPageSize());
            page = (Page<ValveRoomDO>) this.page(page, qw);
            List<ValveRoomVO> list = new ArrayList<>();
            if (page.getTotal() > 0) {
                //查询基础设施类型
                QueryWrapper<SysDict> queryWrapperType = new QueryWrapper<>();
                queryWrapperType.eq("type", TyjwEnum.DICT_TYPE_FACILITIES_VALVE_ROOM.getValue());
                queryWrapperType.eq("project_id", dto.getProjectId());
                SysDict sysDict = sysDictService.getOne(queryWrapperType);
                //查询阀室类型
                Map<Integer, SysDict> valveTypeMap = sysDictService.queryListByProjectIdAndType(dto.getProjectId(), TyjwEnum.DICT_TYPE_VALVE_ROOM.getValue());
                //管道信息
                Map<Integer, PipelineInfoDO> pipelineInfoMap = pipelineInfoService.queryMapByProjectId(dto.getProjectId());
                //站场信息
                Map<Integer, PipelineSiteDO> pipeSiteMap = pipelineSiteService.queryMapByProjectId(dto.getProjectId());
                for (ValveRoomDO item : page.getRecords()) {
                    ValveRoomVO vo = new ValveRoomVO();
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
                        if (null != item.getValveType() && valveTypeMap.containsKey(item.getValveType()))
                            vo.setValveTypeName(valveTypeMap.get(item.getValveType()).getName());
                        list.add(vo);
                    } catch (BeansException e) {
                        e.printStackTrace();
                        list.add(vo);
                    }
                }
            }
            Page<ValveRoomVO> pageVO = new Page<>();
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
    public ResultInfo modify(ValveRoomDO record) {
        ResultInfo resultInfo = new ResultInfo<>(ResultEnum.FAIL);
        if (record.updateById()) {
            resultInfo.setResultEnum(ResultEnum.SUCCESS);
            return resultInfo;
        }
        return resultInfo;
    }

    @Override
    public ResultInfo delete(Integer id) {
        ValveRoomDO record = new ValveRoomDO();
        record.setId(id);
        record.setState(TyjwEnum.DELETE_YES.getValue());
        ResultInfo resultInfo = new ResultInfo<>(ResultEnum.FAIL);
        if (record.updateById()) {
            return resultInfo.setResultEnum(ResultEnum.SUCCESS);
        }
        return resultInfo;
    }

    @Override
    public List<SysDict> queryValveType(Integer projectId) {
        SysDict sysDict = new SysDict();
        sysDict.setProjectId(projectId);
        sysDict.setType(TyjwEnum.DICT_TYPE_VALVE_ROOM.getValue());
        return sysDictService.queryList(sysDict);
    }
}
