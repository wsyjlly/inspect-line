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
 * 用户表
 * </p>
 *
 * @author tianfei
 * @since 2020-01-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tyjw_user")
public class UserDO extends Model<UserDO> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 密码
     */
    private String password;

    /**
     * android/web/pc/ios
     */
    private String registerSource;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 最后登陆的ip
     */
    private String lastIp;

    /**
     * 最后登录时间
     */
    private Date lastTime;

    /**
     * 登陆后系统生成的token
     */
    private String token;

    /**
     * 头像地址
     */
    private String avatarUrl;

    /**
     * 地址
     */
    private String address;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 0可用，1不可用
     */
    private Integer state;

    /**
     * 项目id
     */
    private Integer projectId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
