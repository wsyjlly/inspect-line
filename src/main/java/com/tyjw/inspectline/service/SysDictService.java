package com.tyjw.inspectline.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tyjw.inspectline.entity.model.SysDict;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 字典表 服务类
 * </p>
 *
 * @author tianfei
 * @since 2019-12-24
 */
public interface SysDictService extends IService<SysDict> {

    /**
     * 条件查询
     * @param sysDict
     * @return
     */
    List<SysDict> queryList(SysDict sysDict);

    /**
     * 通过项目id和类型查询数据
     * @param projectId 项目id
     * @param type  类型
     * @return
     */
    Map<Integer, SysDict> queryListByProjectIdAndType(Integer projectId, Integer type);

}
