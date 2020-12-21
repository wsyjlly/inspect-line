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
 * 管道信息
 * </p>
 *
 * @author tianfei
 * @since 2020-01-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("pipeline_point")
public class PipelinePointDO extends Model<PipelinePointDO> implements Comparable<PipelinePointDO> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 经度
     */
    private Double lng;

    /**
     * 维度
     */
    private Double lat;

    /**
     * 项目id
     */
    private Integer projectId;

    /**
     * 编号
     */
    private String number;

    /**
     * 高程
     */
    private Float altitude;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public int compareTo(PipelinePointDO o) {
        return Long.compare(id,o.id);
    }


}
