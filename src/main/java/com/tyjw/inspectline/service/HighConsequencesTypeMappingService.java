package com.tyjw.inspectline.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tyjw.inspectline.entity.model.HighConsequencesTypeMappingDO;
import com.tyjw.inspectline.entity.vo.HighConsequencesTypeMappingVO;

import java.util.List;

/**
 * <p>
 * 高后果区类型关系表id（1对N） 服务类
 * </p>
 *
 * @author tianfei
 * @since 2020-02-17
 */
public interface HighConsequencesTypeMappingService extends IService<HighConsequencesTypeMappingDO> {

    /**
     * 通过高后果区id查询类型列表
     * 一个高后果区对应多个类型
     * @param highId 高后果区id
     * @param projectId 项目id
     * @return
     */
    List<HighConsequencesTypeMappingVO> queryListByHighId(Integer highId, Integer projectId);
}
