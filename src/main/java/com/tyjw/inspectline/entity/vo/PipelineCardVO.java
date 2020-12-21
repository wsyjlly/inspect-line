package com.tyjw.inspectline.entity.vo;

import com.tyjw.inspectline.entity.model.PipelineCardDO;
import lombok.Data;

@Data
public class PipelineCardVO extends PipelineCardDO {

    private String typeName;//类型名称
    private String icon;//icon图标地址

    private String cardTypeName;//桩类型名称
    private String pipeInfoName;//所属管道名称
    private String pipeSiteName;//所属站场名称


}
