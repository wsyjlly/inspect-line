package com.tyjw.inspectline.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tyjw.inspectline.entity.dto.StationDTO;
import com.tyjw.inspectline.entity.model.StationDO;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.entity.vo.StationVO;

/**
 * <p>
 * 场站/保护站 服务类
 * </p>
 *
 * @author tianfei
 * @since 2020-02-07
 */
public interface StationService extends IService<StationDO> {

    ResultInfo<Page<StationVO>> pageList(StationDTO dto);
}
