package com.tyjw.inspectline.entity.vo;

import com.tyjw.inspectline.entity.model.StationDO;
import lombok.Data;

@Data
public class StationVO extends StationDO{

    private String typeName;//类型名称
    private String icon;//icon图标地址
}
