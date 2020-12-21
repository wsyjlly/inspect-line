package com.tyjw.inspectline.entity.vo;

import com.tyjw.inspectline.entity.model.DangerBody;
import lombok.Data;

@Data
public class DangerBodyVO extends DangerBody {

    /**
     * 目标名称
     */
    private String targetName;

    /**
     * 目标类型图片
     */
    private String targetIcon;
    /**
     * 险情等级
     */
    private Integer level;

    private String levelIcon;

    private String levelIconClick;

    /**
     * 险情统计数量
     */
    private Integer count;//统计数量

    private DangerResultVO dangerResult;//险情处理结果

//    private String dangerResultUserName;//处理
//    private String dangerResultUserPhone;



}
