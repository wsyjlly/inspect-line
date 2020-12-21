package com.tyjw.inspectline.entity.pojo.facilities;

import lombok.Data;

import java.io.Serializable;

/**
 * 基础设施封装类
 */
@Data
public class FacilitiesPojo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 项目编号
     */
    private Integer projectId;

    /**
     * 工程名称
     */
    private String name;

    /**
     * 行政区域
     */
    private String area;

    /**
     * 坐标点
     */
    private Marker marker;

    /**
     * 展示图片
     */
    private String image;

    /**
     * 工程简介
     */
    private String description;

    /**
     * 备注
     */
    private String remark;

    /**
     * 设施类型id
     */
    private Byte type;

    /**
     * 设施类型名称
     */
    private String typeName;

    /**
     * 省
     */
    private String provinces;

    /**
     * 市
     */
    private String city;

    /**
     * 县
     */
    private String county;

    /**
     * 省行政码
     */
    private Integer provincesCode;

    /**
     * 市行政区码
     */
    private Integer cityCode;

    /**
     * 县行政区码
     */
    private Integer countyCode;

    /**
     * 是否删除 0正常  1删除
     */
    private Byte state;



}
