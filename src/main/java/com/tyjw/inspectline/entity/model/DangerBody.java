package com.tyjw.inspectline.entity.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 险情内容表
 * </p>
 *
 * @author tianfei
 * @since 2020-01-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class DangerBody extends Model<DangerBody> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 项目id
     */
    private Integer projectId;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 任务id
     */
    private Integer taskId;

    private String taskName;

    /**
     * 目标类型编号
     */
    private Integer targetId;

    /**
     * 可信度
     */
    private Float credibility;

    /**
     * X方向距离
     */
    private Float distanceX;

    /**
     * Y方向距离
     */
    private Float distanceY;

    /**
     * 经度
     */
    private Double lng;

    /**
     * 纬度
     */
    private Double lat;

    /**
     * 高度
     */
    private Float height;

    /**
     * 当前图片
     */
    private String nowImageUrl;

    /**
     * 历史图片
     */
    private String hisImageUrl;

    /**
     * 发现时间
     */
    private Date timeStamp;

    /**
     * 险情类型 1变化检测 2目标检测 3手动标注
     */
    private Integer type;

    /**
     * 险情处理状态 0未指派 1处理中 2已解决
     */
    private Integer status;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 是否删除 
     */
    private Integer state;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
