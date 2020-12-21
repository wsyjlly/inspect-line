package com.tyjw.inspectline.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tyjw.inspectline.common.TyjwEnum;
import com.tyjw.inspectline.dao.PipelineInfoDAO;
import com.tyjw.inspectline.entity.model.PipelineInfoDO;
import com.tyjw.inspectline.service.PipelineInfoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 管道信息 服务实现类
 * </p>
 *
 * @author tianfei
 * @since 2020-02-16
 */
@Service
public class PipelineInfoServiceImpl extends ServiceImpl<PipelineInfoDAO, PipelineInfoDO> implements PipelineInfoService {

    @Override
    public Map<Integer, PipelineInfoDO> queryMapByProjectId(Integer projectId) {
        List<PipelineInfoDO> list = queryList(projectId);
        Map<Integer, PipelineInfoDO> map = new HashMap<>();
        for (PipelineInfoDO item : list) {
            map.put(item.getId(),item);
        }
        return map;
    }

    @Override
    public List<PipelineInfoDO> queryList(Integer projectId) {
        QueryWrapper<PipelineInfoDO> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("project_id", projectId);
        queryWrapper.eq("state", TyjwEnum.DELETE_NO.getValue());
        try {
            List<PipelineInfoDO> list = this.list(queryWrapper);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
