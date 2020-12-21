package com.tyjw.inspectline.entity.model;

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
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tyjw_project")
public class ProjectDO extends Model<ProjectDO> {

    private static final long serialVersionUID = 1L;

    /**
     * 项目id
     */
    private Integer projectId;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * access_key
     */
    private String accessKey;

    /**
     * access_key_secret
     */
    private String accessKeySecret;

    /**
     * 是否停用0正常 1停用
     */
    private Integer state;


    @Override
    protected Serializable pkVal() {
        return this.projectId;
    }

}
