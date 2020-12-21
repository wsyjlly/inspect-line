package com.tyjw.inspectline.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tyjw.inspectline.dao.SysDictDAO;
import com.tyjw.inspectline.entity.model.SysDict;
import com.tyjw.inspectline.service.SysDictService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 字典表 服务实现类
 * </p>
 *
 * @author tianfei
 * @since 2019-12-24
 */
@Service
@Slf4j
@Transactional
public class SysDictServiceImpl extends ServiceImpl<SysDictDAO, SysDict> implements SysDictService {


    @Override
    public List<SysDict> queryList(SysDict sysDict) {
        QueryWrapper<SysDict> queryWrapper = new QueryWrapper<>();
        if (sysDict.getType()!=null)
            queryWrapper.eq("type", sysDict.getType());
        if (sysDict.getProjectId()!=null)
            queryWrapper.eq("project_id", sysDict.getProjectId());
        if (sysDict.getPid()!=null)
            queryWrapper.eq("pid",sysDict.getPid());
        if (StringUtils.isNotBlank(sysDict.getTableName()))
            queryWrapper.eq("table_name",sysDict.getTableName());
        try {
            return this.list(queryWrapper);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("条件查询字典列表异常:[{}],参数：[{}]",e.getMessage(), JSON.toJSONString(sysDict));
            return new ArrayList<>();
        }
    }

    @Override
    public Map<Integer, SysDict> queryListByProjectIdAndType(Integer projectId, Integer type) {
        QueryWrapper<SysDict> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("project_id", projectId);
        queryWrapper.eq("type",type);
        List<SysDict> list = this.list(queryWrapper);
        Map<Integer, SysDict> map = new HashMap<>();
        for (SysDict item : list) {
            map.put(item.getId(),item);
        }
        return map;
    }
}
