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
 * 
 * </p>
 *
 * @author tianfei
 * @since 2020-02-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("pipeline_card")
public class PipelineCardDO extends Model<PipelineCardDO> {

    private static final long serialVersionUID = 1L;

    /**
     *  id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 系统桩号
     */
    private String sysPipeNo;

    /**
     * 现场桩号
     */
    private String realPipeNo;

    /**
     * 桩类型
     */
    private Integer cardType;

    /**
     * 经度
     */
    private Double lng;

    /**
     * 维度
     */
    private Double lat;

    /**
     * 高程
     */
    private Float altitude;

    /**
     * 地理位置
     */
    private String address;

    /**
     * 所属站场id
     */
    private Integer pipeSiteId;

    /**
     * 所属管道id
     */
    private Integer pipeInfoId;

    /**
     * 项目id
     */
    private Integer projectId;

    /**
     * 基础设施类型id
     */
    private Integer type;

    /**
     * 是否删除
     */
    private Integer state;

    /**
     * 描述
     */
    private String description;

    private String image;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
