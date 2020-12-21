package com.tyjw.inspectline.entity.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 高后果区
 * </p>
 *
 * @author tianfei
 * @since 2020-02-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("high_consequences")
public class HighConsequencesDO extends Model<HighConsequencesDO> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    /**
     * 高后果区名称
     */
    private String name;

    /**
     * 设施类型id
     */
    private Integer type;

    /**
     * 高后果区编号
     */
    private String number;

    /**
     * 行政区域
     */
    private String address;

    /**
     * 管径，单位mm
     */
    private Integer steelPipe;

    /**
     * 管材等级
     */
    private Integer pipeGrade;

    /**
     * 设计压力
     */
    private Integer mpa;

    /**
     * 高后果区等级
     */
    private Integer level;

    /**
     * 管线区域点集合 [{"lng":1111,"lat":333}]
     */
    private String pipelinePoints;

    /**
     * 颜色值
     */
    private String color;

    /**
     * 描述
     */
    private String description;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 是否删除
     */
    private Integer state;

    /**
     * 缓冲区边界距离
     */
    private Integer distance;

    /**
     * 缓冲区
     */
    private String bufferPoints;

    /**
     * 项目id
     */
    private Integer projectId;

    /**
     * 起始桩
     */
    private Integer startCardId;

    /**
     * 终止桩
     */
    private Integer endCardId;

    /**
     * 所属站场id
     */
    private Integer pipeSiteId;

    /**
     * 所属管道id
     */
    private Integer pipeInfoId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 责任人
     */
    private String dutyPerson;

    /**
     * 联系方式
     */
    private String dutyMobile;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
