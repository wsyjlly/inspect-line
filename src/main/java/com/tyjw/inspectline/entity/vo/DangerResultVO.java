package com.tyjw.inspectline.entity.vo;

import com.tyjw.inspectline.entity.model.DangerResult;
import lombok.Data;

@Data
public class DangerResultVO extends DangerResult {


    /**
     * 手机号
     */
    private String phone;

    /**
     * 险情类型 1变化检测 2目标检测 3手动标注
     */
    private Integer type;


}
