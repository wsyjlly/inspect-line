package com.tyjw.inspectline.entity.vo;

import com.tyjw.inspectline.entity.model.DomImageDO;
import lombok.Data;

import java.util.List;

@Data
public class DomImageVO extends DomImageDO {

    private List<DomImageDO> list;

}
