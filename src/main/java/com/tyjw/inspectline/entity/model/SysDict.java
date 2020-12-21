package com.tyjw.inspectline.entity.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 字典表
 * </p>
 *
 * @author tianfei
 * @since 2019-12-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysDict extends Model<SysDict> {

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
     * 父节点id
     */
    private Integer pid;

    /**
     * 数据类别
     */
    private Integer type;

    /**
     * 层级关系
     */
    private Integer level;

    /**
     * 图片地址
     */
    private String image;

    /**
     * 项目id
     */
    private Integer projectId;

    /**
     * 对应表
     */
    private String tableName;


    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
