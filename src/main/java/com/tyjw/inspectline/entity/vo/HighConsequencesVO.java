package com.tyjw.inspectline.entity.vo;

import com.tyjw.inspectline.entity.model.HighConsequencesDO;
import lombok.Data;

import java.util.List;

@Data
public class HighConsequencesVO extends HighConsequencesDO {

    private String typeName;//类型名称
    private String icon;//icon图标地址
    private String pipeInfoName;//所属管道名称
    private String pipeSiteName;//所属站场名称
    private String startCardSysPineNo;//起始桩
    private String endCardSysPineNo;//终止桩
    private List<HighConsequencesTypeMappingVO> highTypeList;//高后果区

}
