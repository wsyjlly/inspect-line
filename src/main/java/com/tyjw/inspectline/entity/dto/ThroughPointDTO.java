package com.tyjw.inspectline.entity.dto;

import com.tyjw.inspectline.entity.model.PlanDO;
import com.tyjw.inspectline.entity.model.ThroughPoint;
import lombok.Data;

@Data
public class ThroughPointDTO extends ThroughPoint {

    private int pageSize=10;
    private int pageNum=1;

}
