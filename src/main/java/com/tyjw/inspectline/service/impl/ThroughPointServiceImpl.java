package com.tyjw.inspectline.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tyjw.inspectline.common.TyjwEnum;
import com.tyjw.inspectline.dao.ThroughPointDAO;
import com.tyjw.inspectline.entity.dto.ThroughPointDTO;
import com.tyjw.inspectline.entity.model.SysDict;
import com.tyjw.inspectline.entity.model.ThroughPoint;
import com.tyjw.inspectline.entity.pojo.ResultEnum;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.service.SysDictService;
import com.tyjw.inspectline.service.ThroughPointService;
import com.tyjw.inspectline.entity.vo.ThroughPointVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 穿越点 服务实现类
 * </p>
 *
 * @author tianfei
 * @since 2019-12-24
 */
@Service
public class ThroughPointServiceImpl extends ServiceImpl<ThroughPointDAO, ThroughPoint> implements ThroughPointService {


    @Autowired
    private SysDictService sysDictService;

    @Override
    public ResultInfo<ThroughPoint> insert(ThroughPoint record) {
        ResultInfo<ThroughPoint> resultInfo = new ResultInfo<>(ResultEnum.FAIL);
        boolean success = record.insert();
        if (success) {
            resultInfo.setResultEnum(ResultEnum.SUCCESS);
            resultInfo.setReturnData(record);
        }
        return resultInfo;
    }

    @Override
    public ResultInfo<Page<ThroughPointVO>> pageList(ThroughPointDTO dto) {
        ResultInfo<Page<ThroughPointVO>> resultInfo = new ResultInfo<>();
        try {
            QueryWrapper<ThroughPoint> qw = new QueryWrapper<>();
            qw.orderByDesc("id");
            qw.eq("state", TyjwEnum.DELETE_NO.getValue());
            qw.eq("project_id", dto.getProjectId());
            Page<ThroughPoint> page = new Page<>(dto.getPageNum(), dto.getPageSize());
            page = (Page<ThroughPoint>) this.page(page, qw);
            List<ThroughPointVO> list = new ArrayList<>();
            if (page.getTotal() > 0) {
                Integer type = page.getRecords().get(0).getType();
                SysDict sysDict = sysDictService.getById(type);
                String icon = sysDict.getImage();
                String typeName = sysDict.getName();
                for (ThroughPoint item : page.getRecords()) {
                    ThroughPointVO vo = new ThroughPointVO();
                    BeanUtils.copyProperties(item, vo);
                    vo.setTypeName(typeName);
                    vo.setIcon(icon);
                    list.add(vo);
                }
            }
            Page<ThroughPointVO> pageVO = new Page<>();
            BeanUtils.copyProperties(page, pageVO);
            pageVO.setRecords(list);
            resultInfo.setResultEnum(ResultEnum.SUCCESS);
            resultInfo.setHasNext(pageVO.hasNext() ? 1 : 0);
            resultInfo.setReturnData(pageVO);
            return resultInfo;
        } catch (BeansException e) {
            e.printStackTrace();
            resultInfo.setResultEnum(ResultEnum.SYS_SERVER_ERROR);
            return resultInfo;
        }
    }
}
