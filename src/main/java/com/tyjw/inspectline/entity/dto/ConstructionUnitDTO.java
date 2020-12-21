package com.tyjw.inspectline.entity.dto;

import com.tyjw.inspectline.entity.model.ConstructionUnitDO;
import lombok.Data;

@Data
public class ConstructionUnitDTO extends ConstructionUnitDO {

    private int pageSize=10;
    private int pageNum=1;

}
