package com.tyjw.inspectline.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tyjw.inspectline.entity.dto.ThroughPointDTO;
import com.tyjw.inspectline.entity.model.ThroughPoint;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.entity.vo.ThroughPointVO;

/**
 * <p>
 * 穿越点 服务类
 * </p>
 *
 * @author tianfei
 * @since 2019-12-24
 */
public interface ThroughPointService extends IService<ThroughPoint> {

    ResultInfo<ThroughPoint> insert(ThroughPoint record);

    ResultInfo<Page<ThroughPointVO>> pageList(ThroughPointDTO dto);
}
