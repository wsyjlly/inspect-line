package com.tyjw.inspectline.entity.vo;

import com.tyjw.inspectline.entity.model.ConstructionUnitDO;
import lombok.Data;

@Data
public class ConstructionUnitVO extends ConstructionUnitDO {

    private String typeName;//类型名称
    private String icon;//icon图标地址
    private String pipeInfoName;//所属管道名称
    private String pipeSiteName;//所属站场名称
    private String constructionTypeName;//第三方施工类型名称
}
