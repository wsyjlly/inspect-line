package com.tyjw.inspectline.entity.dto;

import com.tyjw.inspectline.entity.model.PlanDO;
import lombok.Data;

@Data
public class PlanDTO extends PlanDO {

    private int pageSize=10;
    private int pageNum=1;

    private int newDanger;
    private Integer dangerSort;//


}
