package com.tyjw.inspectline.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tyjw.inspectline.dao.StationDAO;
import com.tyjw.inspectline.entity.dto.StationDTO;
import com.tyjw.inspectline.entity.model.StationDO;
import com.tyjw.inspectline.entity.model.SysDict;
import com.tyjw.inspectline.entity.pojo.ResultEnum;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.service.StationService;
import com.tyjw.inspectline.service.SysDictService;
import com.tyjw.inspectline.entity.vo.StationVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 场站/保护站 服务实现类
 * </p>
 *
 * @author tianfei
 * @since 2020-02-07
 */
@Service
public class StationServiceImpl extends ServiceImpl<StationDAO, StationDO> implements StationService {


    @Autowired
    private SysDictService sysDictService;

    @Override
    public ResultInfo<Page<StationVO>> pageList(StationDTO dto) {
        ResultInfo<Page<StationVO>> resultInfo = new ResultInfo<>();
        String beginDate = null;
        String endDate = null;
        try {
            QueryWrapper<StationDO> qw = new QueryWrapper<>();
            qw.orderByDesc("id");
            qw.eq("state", 0);
            qw.eq("project_id", dto.getProjectId());
            Page<StationDO> page = new Page<>(dto.getPageNum(), dto.getPageSize());
            page = (Page<StationDO>) this.page(page, qw);
            List<StationVO> list = new ArrayList<>();
            if (page.getTotal() > 0) {
                Integer type = page.getRecords().get(0).getType();
                SysDict sysDict = sysDictService.getById(type);
                String icon = sysDict.getImage();
                String typeName = sysDict.getName();
                for (StationDO item : page.getRecords()) {
                    StationVO vo = new StationVO();
                    BeanUtils.copyProperties(item, vo);
                    vo.setTypeName(typeName);
                    vo.setIcon(icon);
                    list.add(vo);
                }
            }
            Page<StationVO> pageVO = new Page<>();
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
