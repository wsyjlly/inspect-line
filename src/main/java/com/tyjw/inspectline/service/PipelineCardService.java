package com.tyjw.inspectline.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tyjw.inspectline.entity.dto.PipelineCardDTO;
import com.tyjw.inspectline.entity.model.PipelineCardDO;
import com.tyjw.inspectline.entity.model.SysDict;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.entity.vo.PipelineCardVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author tianfei
 * @since 2020-02-16
 */
public interface PipelineCardService extends IService<PipelineCardDO> {

    /**
     * 添加操作
     * @param record
     * @return
     */
    ResultInfo<PipelineCardDO> insert(PipelineCardDO record);

    /**
     * 分页查询标牌
     * @param dto
     * @return
     */
    ResultInfo<Page<PipelineCardVO>> pageList(PipelineCardDTO dto);

    /**
     * 查询桩牌类型
     * @param projectId 项目id
     * @return
     */
    List<SysDict> queryCardType(Integer projectId);

    /**
     * 修改操作
     * @param record
     * @return
     */
    ResultInfo modify(PipelineCardDO record);

    /**
     * 删除操作
     * @param id
     * @return
     */
    ResultInfo delete(Integer id);

    /**
     * 查询桩牌区间所有点
     * @param startCardId
     * @param endCardId
     * @param projectId
     * @return
     */
    List<PipelineCardDO> queryRange(Integer startCardId, Integer endCardId, Integer projectId);


    /**
     * 查询列表
     *
     * @param dto
     * @param pipeInfoId 所属管道id
     * @param pipeSiteId 所属站场id
     * @param sysPipeNo  系统桩号（模糊查询）
     * @param cardType   桩牌类型id
     * @return
     */
    ResultInfo<List<PipelineCardVO>> queryList(PipelineCardDTO dto);
}
