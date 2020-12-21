package com.tyjw.inspectline.entity.dto;

import com.tyjw.inspectline.entity.model.ValveRoomDO;
import lombok.Data;

@Data
public class ValveRoomDTO extends ValveRoomDO {

    private int pageNum=1;
    private int pageSize=10;

}
