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
 * 场站/保护站
 * </p>
 *
 * @author tianfei
 * @since 2020-02-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tyjw_station")
public class StationDO extends Model<StationDO> {

    private static final long serialVersionUID = 1L;

    /**
     * 场站/保护站id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 场站/保护站名称
     */
    private String name;

    /**
     * 纬度
     */
    private Double lat;

    /**
     * 经度
     */
    private Double lng;

    /**
     * 海拔高度 米
     */
    private Double height;

    /**
     * 覆盖角度
     */
    private Integer angle;

    /**
     * 方位角1
     */
    private Integer azimuth1;

    /**
     * 方位角2
     */
    private Integer azimuth2;

    /**
     * 俯仰角1
     */
    private Integer pitch1;

    /**
     * 俯仰角2
     */
    private Integer pitch2;

    /**
     * 状态 0 正常  1禁用
     */
    private Integer state;

    /**
     * 项目id
     */
    private Integer projectId;

    /**
     * 基础设施类型
     */
    private Integer type;

    /**
     * 地址
     */
    private String address;

    /**
     * 图片地址
     */
    private String image;

    /**
     * 半径，单位米
     */
    private Integer radius;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
