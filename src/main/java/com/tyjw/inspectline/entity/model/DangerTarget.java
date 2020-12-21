package com.tyjw.inspectline.entity.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 险情目标类型表
 * </p>
 *
 * @author tianfei
 * @since 2020-01-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class DangerTarget extends Model<DangerTarget> {

    private static final long serialVersionUID = 1L;

    /**
     * 目标编号
     */
    @TableId(value = "target_id", type = IdType.AUTO)
    private Integer targetId;

    /**
     * 项目id
     */
    private Integer projectId;

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

    @Override
    protected Serializable pkVal() {
        return this.targetId;
    }

}
