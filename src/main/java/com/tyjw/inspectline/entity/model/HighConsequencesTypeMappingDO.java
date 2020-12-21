package com.tyjw.inspectline.entity.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 高后果区类型关系表id（1对N）
 * </p>
 *
 * @author tianfei
 * @since 2020-02-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("high_consequences_type_mapping")
public class HighConsequencesTypeMappingDO extends Model<HighConsequencesTypeMappingDO> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 高后果区id
     */
    private Integer highId;

    /**
     * 类型id
     */
    private Integer typeId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
