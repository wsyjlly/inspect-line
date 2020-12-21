package com.tyjw.inspectline.entity.dto;

import com.tyjw.inspectline.entity.model.DangerBody;
import com.tyjw.inspectline.entity.model.PipelineCardDO;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 桩牌查询对象DTO
 */
@Data
public class PipelineCardDTO extends PipelineCardDO implements Serializable {

    private static final long serialVersionUID = 1L;

    private int pageNum=1;
    private int pageSize=10;


}
