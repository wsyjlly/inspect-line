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
 * 管道站场
 * </p>
 *
 * @author tianfei
 * @since 2020-02-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("pipeline_site")
public class PipelineSiteDO extends Model<PipelineSiteDO> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 站场名称
     */
    private String name;

    /**
     * 项目id
     */
    private Integer projectId;

    /**
     * 是否删除
     */
    private Integer state;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
