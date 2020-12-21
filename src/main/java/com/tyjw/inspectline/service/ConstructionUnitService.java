package com.tyjw.inspectline.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tyjw.inspectline.entity.dto.ConstructionUnitDTO;
import com.tyjw.inspectline.entity.model.ConstructionUnitDO;
import com.tyjw.inspectline.entity.model.SysDict;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.entity.vo.ConstructionUnitVO;

import java.util.List;

/**
 * <p>
 * 施工单位 服务类
 * </p>
 *
 * @author tianfei
 * @since 2019-12-24
 */
public interface ConstructionUnitService extends IService<ConstructionUnitDO> {

    ResultInfo<ConstructionUnitDO> insert(ConstructionUnitDO record);

    ResultInfo<Page<ConstructionUnitVO>> pageList(ConstructionUnitDTO dto);

    ResultInfo modify(ConstructionUnitDO record);

    ResultInfo delete(Integer id);

    List<SysDict> queryConstructionUnitType(Integer projectId);
}
