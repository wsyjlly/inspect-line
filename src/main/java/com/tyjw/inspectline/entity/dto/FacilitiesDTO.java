package com.tyjw.inspectline.entity.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class FacilitiesDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer pageSize;
    private Integer pageNum;

}
