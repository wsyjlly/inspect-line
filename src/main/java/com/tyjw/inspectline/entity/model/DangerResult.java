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
 * 险情处理表（责任人、处理结果）
 * </p>
 *
 * @author tianfei
 * @since 2020-01-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class DangerResult extends Model<DangerResult> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 险情id
     */
    private Long bodyId;

    /**
     * 人员编号
     */
    private Long userId;

    /**
     * 处理人名称
     */
    private String userName;

    /**
     * 描述
     */
    private String formulation;

    /**
     * 现场处理照片
     */
    private String sceneImgs;

    /**
     * 现场视频
     */
    private String sceneVideo;

    /**
     * 处理时间
     */
    private Date timeStamp;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 是否删除 0正常 1删除
     */
    private Integer state;

    /**
     * 险情处理状态 1处理中 2已完成
     */
    private Integer status;

    /**
     * 分配时间
     */
    private Date createTime;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
