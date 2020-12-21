package com.tyjw.inspectline.web.controller;

import com.tyjw.inspectline.entity.model.RoleDO;
import com.tyjw.inspectline.entity.model.UserDO;
import com.tyjw.inspectline.entity.pojo.ResultEnum;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.service.RoleUserService;
import com.tyjw.inspectline.service.UserService;
import com.tyjw.inspectline.common.utils.NetworkUtil;
import com.tyjw.inspectline.common.utils.RegexUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private RoleUserService roleUserService;

    /**
     * 登录
     * @param userDO
     * @param phone 手机号
     * @param password  密码
     * @return
     */
    @PostMapping(value = "/api/user/login")
    public ResultInfo login(@RequestBody UserDO userDO, HttpServletRequest httpServletRequest){
        ResultInfo resultInfo = new ResultInfo();
        if (StringUtils.isBlank(userDO.getPhone())){
            resultInfo.setResultEnum(ResultEnum.FAIL);
            resultInfo.setMessage("手机号不能为空");
            return resultInfo;
        }
        if (!RegexUtils.checkMobile(userDO.getPhone())){
            resultInfo.setResultEnum(ResultEnum.FAIL);
            resultInfo.setMessage("手机号格式不正确");
            return resultInfo;
        }
        if (StringUtils.isBlank(userDO.getPassword())){
            resultInfo.setResultEnum(ResultEnum.FAIL);
            resultInfo.setMessage("密码不能为空");
            return resultInfo;
        }
        try {
            String ip = NetworkUtil.getIpAddress(httpServletRequest);
            userDO.setLastIp(ip);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userService.login(userDO);
    }

    /**
     * 退出登录
     * @param uid
     * @return
     */
    @GetMapping(value = "/api/user/loginout")
    public ResultInfo loginout(@RequestHeader("u-uid") Long uid){
        return userService.loginout(uid);
    }

    /**
     * 查询用户角色
     * @param uid
     * @return
     */
    @GetMapping(value = "/api/user/role")
    public ResultInfo userRole(@RequestHeader("u-uid") Long uid){
        ResultInfo resultInfo = new ResultInfo();
        try {
            RoleDO roleDO = roleUserService.findRoleByUid(uid);
            if (null!=roleDO){
                resultInfo.setResultEnum(ResultEnum.SUCCESS);
                resultInfo.setReturnData(roleDO);
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultInfo.setResultEnum(ResultEnum.FAIL);
        }
        return resultInfo;
    }


}
