package com.tyjw.inspectline.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tyjw.inspectline.entity.dto.HighConsequencesDTO;
import com.tyjw.inspectline.geo.Point;
import com.tyjw.inspectline.entity.model.HighConsequencesDO;
import com.tyjw.inspectline.entity.model.SysDict;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.entity.vo.HighConsequencesVO;

import java.util.List;

/**
 * <p>
 * 高后果区 服务类
 * </p>
 *
 * @author tianfei
 * @since 2019-12-24
 */
public interface HighConsequencesService extends IService<HighConsequencesDO> {

    ResultInfo<HighConsequencesDO> insert(HighConsequencesDTO dto);

    ResultInfo<Page<HighConsequencesVO>> pageList(HighConsequencesDTO dto);

    List<Point> getBufferPoints(HighConsequencesDO record);

    /**
     * 查询高后果区类型
     * @param projectId
     * @return
     */
    List<SysDict> queryHighTypes(Integer projectId);

    /**
     * 获取缓冲区
     * @param startCardId
     * @param endCardId
     * @param distance
     * @param projectId
     * @return
     */
    List<Point> getBufferPoints(Integer startCardId, Integer endCardId, Integer distance, Integer projectId);

    /**
     * 修改
     * @param dto
     * @return
     */
    ResultInfo modify(HighConsequencesDTO dto);

    /**
     * 删除
     * @param id
     * @return
     */
    ResultInfo delete(Integer id);
}
