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
 * 施工单位
 * </p>
 *
 * @author tianfei
 * @since 2020-02-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("construction_unit")
public class ConstructionUnitDO extends Model<ConstructionUnitDO> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    /**
     * 名称
     */
    private String name;

    /**
     * 编号
     */
    private String number;

    /**
     * 施工地点
     */
    private String address;

    /**
     * 设施类型id
     */
    private Integer type;

    /**
     * 经度
     */
    private Double lng;

    /**
     * 维度
     */
    private Double lat;

    /**
     * 三方施工现场照片
     */
    private String image;

    /**
     * 风险等级
     */
    private Integer riskGrade;

    /**
     * 作业区
     */
    private String workSpace;

    /**
     * 施工方法
     */
    private Integer method;

    /**
     * 工程进度
     */
    private Integer schedule;

    /**
     * 采取措施
     */
    private Integer takeSteps;

    /**
     * 里程，单位m
     */
    private Integer mileage;

    /**
     * 保护措施
     */
    private String protectSteps;

    /**
     * 施工开始时间
     */
    private Date startTime;

    /**
     * 施工结束时间
     */
    private Date endTime;

    /**
     * 作业许可 0否；1是
     */
    private Integer workPermission;

    /**
     * 问题描述
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
     * 项目id
     */
    private Integer projectId;

    /**
     * 施工类型
     */
    private Integer constructionType;

    /**
     * 所属站场id
     */
    private Integer pipeSiteId;

    /**
     * 所属管道id
     */
    private Integer pipeInfoId;

    /**
     * 施工区安全区图片
     */
    private String safeAreaImage;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
