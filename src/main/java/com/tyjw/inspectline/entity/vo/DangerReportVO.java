package com.tyjw.inspectline.entity.vo;

import com.tyjw.inspectline.entity.model.PlanDO;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class DangerReportVO implements Serializable {

    private PlanDO planVO;//计划信息
    private List<DangerBodyVO> dangerList;//险情列表
    private int dangerTotal;//险情总数量
    private int unassignNum;//未指派数量
    private int finishNum;//已处理数量
    private int startNum;//处理中数量
    private String targetNames;//目标名称

}
