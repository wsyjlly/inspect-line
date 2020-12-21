package com.tyjw.inspectline.entity.dto;

import com.tyjw.inspectline.entity.model.HighConsequencesDO;
import lombok.Data;

import java.util.List;

@Data
public class HighConsequencesDTO extends HighConsequencesDO {

    private int pageSize=10;
    private int pageNum=1;



    private List<Integer> highTypeList;//高后果区类型id集合

}
