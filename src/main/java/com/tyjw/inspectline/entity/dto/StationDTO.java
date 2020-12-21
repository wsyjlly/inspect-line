package com.tyjw.inspectline.entity.dto;

import com.tyjw.inspectline.entity.model.StationDO;
import lombok.Data;

@Data
public class StationDTO extends StationDO {

    private int pageSize=10;
    private int pageNum=1;

}
