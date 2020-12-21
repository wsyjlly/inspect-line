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
 * 阀室
 * </p>
 *
 * @author tianfei
 * @since 2020-02-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("valve_room")
public class ValveRoomDO extends Model<ValveRoomDO> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    /**
     * 阀室名称
     */
    private String name;

    /**
     * 阀室编号
     */
    private String number;

    /**
     * 行政区域
     */
    private String address;

    /**
     * 里程 单位m
     */
    private Integer mileage;

    /**
     * 设施类型id
     */
    private Integer type;

    /**
     * 阀室类型
     */
    private Integer valveType;

    /**
     * 经度
     */
    private Double lng;

    /**
     * 维度
     */
    private Double lat;

    /**
     * 图片地址
     */
    private String image;

    /**
     * 作业区
     */
    private String workSpace;

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
     * 责任人
     */
    private String dutyPerson;
    /**
     * 手机号
     */
    private String dutyMobile;

    /**
     * 所属站场id
     */
    private Integer pipeSiteId;

    /**
     * 所属管道id
     */
    private Integer pipeInfoId;

    /**
     * 组织编号
     */
    private String orgCode;

    /**
     * 组织名称
     */
    private String orgName;

    /**
     * 是否有围墙
     */
    private Integer fenceding;

    /**
     * 描述
     */
    private String description;

    /**
     * 设计单位
     */
    private String designunit;

    /**
     * 装配公司
     */
    private String assemblyCompany;

    /**
     * 检查公司
     */
    private String inspectingCompany;

    /**
     * 测试公司
     */
    private String testingCompany;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
