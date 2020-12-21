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
 * 穿越点
 * </p>
 *
 * @author tianfei
 * @since 2020-01-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ThroughPoint extends Model<ThroughPoint> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    /**
     * 穿越点名称（公路/河流/铁路）
     */
    private String name;

    /**
     * 行政划分
     */
    private String address;

    /**
     * 穿越点图片
     */
    private String image;

    /**
     * 穿越长度
     */
    private Integer mileage;

    /**
     * 设施类型id
     */
    private Integer type;

    /**
     * 穿越类型
     */
    private Integer throuthType;

    /**
     * 经度
     */
    private Double lng;

    /**
     * 维度
     */
    private Double lat;

    /**
     * 作业区
     */
    private String workSpace;

    /**
     * 管道名称
     */
    private String pipelineName;

    /**
     * 管线位置
     */
    private String pipelineLocation;

    /**
     * 钢管管径 单位mm
     */
    private Integer steelPipe;

    /**
     * 套管管径，单位mm
     */
    private Integer drivePipe;

    /**
     * 其他保护措施
     */
    private String otherProtect;

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


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
