package com.tyjw.inspectline.web.interceptor;

import com.alibaba.fastjson.JSON;
import com.tyjw.inspectline.common.Constants;
import com.tyjw.inspectline.entity.model.UserDO;
import com.tyjw.inspectline.entity.pojo.ResultEnum;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.service.impl.UserServiceImpl;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义拦截器
 */
@Component
public class MyInterceptor implements HandlerInterceptor {

    @Autowired
    private Constants constants;


    @Autowired
    private UserServiceImpl userService;


    /**
     * 判断用户是否登陆
     *
     * @param httpServletRequest
     * @param httpServletResponse
     * @param u-uid:              用户id
     * @param u-token:            用户登录token
     * @param u-projectId:        项目id
     * @param u-version:          用户版本
     * @param u-platform:         来源 //1:pc   2:android   3:ios
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        ResultInfo resultInfo = new ResultInfo();
        httpServletResponse.setHeader("Content-Type", "application/json;charset=utf-8");//这句话是解决乱码的
        String id = httpServletRequest.getHeader("u-uid");
        String token = httpServletRequest.getHeader("u-token");
        String projectId = httpServletRequest.getHeader("u-projectId");
        String version = httpServletRequest.getHeader("u-version");
        String platform = httpServletRequest.getHeader("u-platform");
        if (null == id) {
            resultInfo.setResultEnum(ResultEnum.USER_LOGOUT_ERROR);
            httpServletResponse.getWriter().write(JSON.toJSONString(resultInfo));
            return false;
        }
        UserDO loginUser = (UserDO) userService.cacheUserById(Long.parseLong(id));
        String redisToken = null;
        if (null != loginUser)
            redisToken = loginUser.getToken();
        if (StringUtils.isBlank(projectId) || !projectId.equals(loginUser.getProjectId().toString())) {
            resultInfo.setResultEnum(ResultEnum.PROJECT_NO_PERMISSIONS);
            httpServletResponse.getWriter().write(JSON.toJSONString(resultInfo));
            return false;
        }
        if (id != null && token != null && redisToken != null && token.equals(redisToken)) {
            return true;
        }
        httpServletResponse.getWriter().write(JSON.toJSONString(new ResultInfo(ResultEnum.USER_LOGOUT_ERROR)));
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }


    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse response, Object o, Exception ex) throws Exception {
    }


}
