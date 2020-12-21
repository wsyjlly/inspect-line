package com.tyjw.inspectline.entity.vo;

import com.tyjw.inspectline.entity.model.ThroughPoint;
import lombok.Data;

@Data
public class ThroughPointVO extends ThroughPoint{

    private String typeName;//类型名称
    private String icon;//icon图标地址

}
