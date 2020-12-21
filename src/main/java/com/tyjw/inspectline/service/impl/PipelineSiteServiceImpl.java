package com.tyjw.inspectline.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tyjw.inspectline.common.TyjwEnum;
import com.tyjw.inspectline.dao.PipelineSiteDAO;
import com.tyjw.inspectline.entity.model.PipelineSiteDO;
import com.tyjw.inspectline.service.PipelineSiteService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 管道站场 服务实现类
 * </p>
 *
 * @author tianfei
 * @since 2020-02-16
 */
@Service
public class PipelineSiteServiceImpl extends ServiceImpl<PipelineSiteDAO, PipelineSiteDO> implements PipelineSiteService {

    @Override
    public Map<Integer, PipelineSiteDO> queryMapByProjectId(Integer projectId) {
        List<PipelineSiteDO> list = queryList(projectId);
        Map<Integer, PipelineSiteDO> map = new HashMap<>();
        for (PipelineSiteDO item : list) {
            map.put(item.getId(), item);
        }
        return map;
    }

    @Override
    public List<PipelineSiteDO> queryList(Integer projectId) {
        try {
            QueryWrapper<PipelineSiteDO> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("project_id", projectId);
            queryWrapper.eq("state", TyjwEnum.DELETE_NO.getValue());
            List<PipelineSiteDO> list = this.list(queryWrapper);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
