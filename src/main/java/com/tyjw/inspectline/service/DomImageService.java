package com.tyjw.inspectline.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tyjw.inspectline.entity.model.DomImageDO;
import com.tyjw.inspectline.entity.vo.DomImageVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author tianfei
 * @since 2020-02-26
 */
public interface DomImageService extends IService<DomImageDO> {

    List<DomImageDO> queryList(Integer projectId);

    List<DomImageVO> queryVoList(Integer projectId);
}
