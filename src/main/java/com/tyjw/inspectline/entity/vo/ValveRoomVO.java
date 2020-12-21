package com.tyjw.inspectline.entity.vo;

import com.tyjw.inspectline.entity.model.ValveRoomDO;
import lombok.Data;

@Data
public class ValveRoomVO extends ValveRoomDO {

    private String typeName;//类型名称
    private String icon;//icon图标地址
    private String pipeInfoName;//所属管道名称
    private String pipeSiteName;//所属站场名称
    private String valveTypeName;//阀室类型名称

}
