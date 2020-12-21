package com.tyjw.inspectline.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tyjw.inspectline.common.TyjwEnum;
import com.tyjw.inspectline.dao.PipelineCardDAO;
import com.tyjw.inspectline.entity.dto.PipelineCardDTO;
import com.tyjw.inspectline.entity.model.PipelineCardDO;
import com.tyjw.inspectline.entity.model.PipelineInfoDO;
import com.tyjw.inspectline.entity.model.PipelineSiteDO;
import com.tyjw.inspectline.entity.model.SysDict;
import com.tyjw.inspectline.entity.pojo.ResultEnum;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.service.PipelineCardService;
import com.tyjw.inspectline.service.PipelineInfoService;
import com.tyjw.inspectline.service.PipelineSiteService;
import com.tyjw.inspectline.service.SysDictService;
import com.tyjw.inspectline.entity.vo.PipelineCardVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author tianfei
 * @since 2020-02-16
 */
@Service
@Slf4j
@Transactional
public class PipelineCardServiceImpl extends ServiceImpl<PipelineCardDAO, PipelineCardDO> implements PipelineCardService {

    @Autowired
    private SysDictService sysDictService;
    @Autowired
    private PipelineInfoService pipelineInfoService;
    @Autowired
    private PipelineSiteService pipelineSiteService;

    @Override
    public ResultInfo<PipelineCardDO> insert(PipelineCardDO record) {
        ResultInfo<PipelineCardDO> resultInfo = new ResultInfo<>(ResultEnum.FAIL);
        //查询基础设施类型
        QueryWrapper<SysDict> queryWrapperType = new QueryWrapper<>();
        queryWrapperType.eq("type", TyjwEnum.DICT_TYPE_FACILITIES_PIPELINE_CARD.getValue());
        queryWrapperType.eq("project_id", record.getProjectId());
        SysDict sysDict = sysDictService.getOne(queryWrapperType);
        record.setType(sysDict.getId());
        record.setState(TyjwEnum.DELETE_NO.getValue());
        //系统桩号判断是否唯一
        if (StringUtils.isNotBlank(record.getSysPipeNo())) {
            QueryWrapper<PipelineCardDO> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("sys_pipe_no", record.getSysPipeNo());
            PipelineCardDO one = this.getOne(queryWrapper);
            if (one != null) {
                resultInfo.setMessage("该系统桩号已存在，请重新输入");
                resultInfo.setResultEnum(ResultEnum.FAIL);
                return resultInfo;
            }
        }
        if (record.insert()) {
            resultInfo.setResultEnum(ResultEnum.SUCCESS);
            resultInfo.setReturnData(record);
            return resultInfo;
        }
        return resultInfo;
    }

    @Override
    public ResultInfo<Page<PipelineCardVO>> pageList(PipelineCardDTO dto) {
        ResultInfo<Page<PipelineCardVO>> resultInfo = new ResultInfo<>();
        String beginDate = null;
        String endDate = null;
        try {
            QueryWrapper<PipelineCardDO> qw = new QueryWrapper<>();
            qw.eq("state", 0);
            qw.eq("project_id", dto.getProjectId());
            if (dto.getPipeInfoId() != null && dto.getPipeInfoId()!= TyjwEnum.SELECT_OPTION_ALL.getValue())
                qw.eq("pipe_info_id", dto.getPipeInfoId());
            if (dto.getPipeSiteId() != null && dto.getPipeSiteId()!= TyjwEnum.SELECT_OPTION_ALL.getValue())
                qw.eq("pipe_site_id", dto.getPipeSiteId());
            if (dto.getCardType() != null && dto.getCardType()!= TyjwEnum.SELECT_OPTION_ALL.getValue())
                qw.eq("card_type", dto.getCardType());
            if (StringUtils.isNotBlank(dto.getSysPipeNo()))
                qw.like(true, "sys_pipe_no", dto.getSysPipeNo());
            Page<PipelineCardDO> page = new Page<>(dto.getPageNum(), dto.getPageSize());
            page = (Page<PipelineCardDO>) this.page(page, qw);
            List<PipelineCardVO> list = new ArrayList<>();
            if (page.getTotal() > 0) {
                //查询基础设施类型
                QueryWrapper<SysDict> queryWrapperType = new QueryWrapper<>();
                queryWrapperType.eq("type", TyjwEnum.DICT_TYPE_FACILITIES_PIPELINE_CARD.getValue());
                queryWrapperType.eq("project_id", dto.getProjectId());
                SysDict sysDict = sysDictService.getOne(queryWrapperType);
                //管道信息
                Map<Integer, PipelineInfoDO> pipelineInfoMap = pipelineInfoService.queryMapByProjectId(dto.getProjectId());
                //站场信息
                Map<Integer, PipelineSiteDO> pipeSiteMap = pipelineSiteService.queryMapByProjectId(dto.getProjectId());
                //桩牌类型
                Map<Integer, SysDict> cardTypeMap = sysDictService.queryListByProjectIdAndType(dto.getProjectId(), TyjwEnum.DICT_TYPE_PIPE_CARD_TYPE.getValue());
                for (PipelineCardDO item : page.getRecords()) {
                    PipelineCardVO vo = new PipelineCardVO();
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
                        if (null != item.getCardType() && cardTypeMap.containsKey(item.getCardType()))
                            vo.setCardTypeName(cardTypeMap.get(item.getCardType()).getName());
                        list.add(vo);
                    } catch (BeansException e) {
                        e.printStackTrace();
                        list.add(vo);
                    }
                }
            }
            Page<PipelineCardVO> pageVO = new Page<>();
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
    public List<SysDict> queryCardType(Integer projectId) {
        SysDict sysDict = new SysDict();
        sysDict.setProjectId(projectId);
        sysDict.setType(TyjwEnum.DICT_TYPE_PIPE_CARD_TYPE.getValue());
        return sysDictService.queryList(sysDict);
    }

    @Override
    public ResultInfo modify(PipelineCardDO record) {
        ResultInfo resultInfo = new ResultInfo<>(ResultEnum.FAIL);
        //系统桩号判断是否唯一
        if (StringUtils.isNotBlank(record.getSysPipeNo())) {
            QueryWrapper<PipelineCardDO> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("sys_pipe_no", record.getSysPipeNo());
            PipelineCardDO one = this.getOne(queryWrapper);
            if (one != null && one.getId().intValue() != record.getId().intValue()) {
                resultInfo.setMessage("该系统桩号已存在，请重新输入");
                return resultInfo;
            }
        }
        if (record.updateById()) {
            resultInfo.setResultEnum(ResultEnum.SUCCESS);
            return resultInfo;
        }
        return resultInfo;
    }

    @Override
    public ResultInfo delete(Integer id) {
        PipelineCardDO record = new PipelineCardDO();
        record.setId(id);
        record.setState(TyjwEnum.DELETE_YES.getValue());
        ResultInfo resultInfo = new ResultInfo<>(ResultEnum.FAIL);
        if (record.updateById()) {
            return resultInfo.setResultEnum(ResultEnum.SUCCESS);
        }
        return resultInfo;
    }

    @Override
    public List<PipelineCardDO> queryRange(Integer startCardId, Integer endCardId, Integer projectId) {
        //查询桩牌区间段所有点
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.between("id", startCardId > endCardId ? endCardId : startCardId, startCardId > endCardId ? startCardId : endCardId);
        queryWrapper.eq("project_id", projectId);
        return this.list(queryWrapper);
    }

    @Override
    public ResultInfo<List<PipelineCardVO>> queryList(PipelineCardDTO dto) {
        ResultInfo<List<PipelineCardVO>> resultInfo = new ResultInfo<>(ResultEnum.FAIL);
        QueryWrapper<PipelineCardDO> qw = new QueryWrapper<>();
        qw.eq("state", 0);
        qw.eq("project_id", dto.getProjectId());
        if (dto.getPipeInfoId() != null && dto.getPipeInfoId()!= TyjwEnum.SELECT_OPTION_ALL.getValue())
            qw.eq("pipe_info_id", dto.getPipeInfoId());
        if (dto.getPipeSiteId() != null && dto.getPipeSiteId()!= TyjwEnum.SELECT_OPTION_ALL.getValue())
            qw.eq("pipe_site_id", dto.getPipeSiteId());
        if (dto.getCardType() != null && dto.getCardType()!= TyjwEnum.SELECT_OPTION_ALL.getValue())
            qw.eq("card_type", dto.getCardType());
        if (StringUtils.isNotBlank(dto.getSysPipeNo()))
            qw.like(true, "sys_pipe_no", dto.getSysPipeNo());
        List<PipelineCardDO> list = this.list(qw);
        List<PipelineCardVO> listVO = new ArrayList<>();
        if (list!=null && list.size() > 0) {
            //查询基础设施类型
            QueryWrapper<SysDict> queryWrapperType = new QueryWrapper<>();
            queryWrapperType.eq("type", TyjwEnum.DICT_TYPE_FACILITIES_PIPELINE_CARD.getValue());
            queryWrapperType.eq("project_id", dto.getProjectId());
            SysDict sysDict = sysDictService.getOne(queryWrapperType);
            //管道信息
            Map<Integer, PipelineInfoDO> pipelineInfoMap = pipelineInfoService.queryMapByProjectId(dto.getProjectId());
            //站场信息
            Map<Integer, PipelineSiteDO> pipeSiteMap = pipelineSiteService.queryMapByProjectId(dto.getProjectId());
            //桩牌类型
            Map<Integer, SysDict> cardTypeMap = sysDictService.queryListByProjectIdAndType(dto.getProjectId(), TyjwEnum.DICT_TYPE_PIPE_CARD_TYPE.getValue());
            for (PipelineCardDO item : list) {
                PipelineCardVO vo = new PipelineCardVO();
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
                    if (null != item.getCardType() && cardTypeMap.containsKey(item.getCardType()))
                        vo.setCardTypeName(cardTypeMap.get(item.getCardType()).getName());
                    listVO.add(vo);
                } catch (BeansException e) {
                    e.printStackTrace();
                    listVO.add(vo);
                }
            }
            resultInfo.setResultEnum(ResultEnum.SUCCESS);
            resultInfo.setReturnData(listVO);
            resultInfo.setTotal(listVO.size());
            return resultInfo;
        }
        return resultInfo;
    }

}
