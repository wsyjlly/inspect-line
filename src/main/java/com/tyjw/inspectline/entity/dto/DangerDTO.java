package com.tyjw.inspectline.entity.dto;

import com.tyjw.inspectline.entity.model.DangerBody;
import lombok.Data;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * 险情查询对象DTO
 */
@Data
public class DangerDTO extends DangerBody implements Serializable {

    private static final long serialVersionUID = 1L;

    private int pageNum=1;
    private int pageSize=10;
    private String startTime;//开始时间（yyyy-MM-dd）
    private String endTime;//结束时间（yyyy-MM-dd）

    private List<Long> dangerUsers;//险情处理人

    //险情处理状态 0未指派 1处理中 2已解决
    private List<Integer> moreStatus;//多种险情状态查询 [0,1,2]

}
