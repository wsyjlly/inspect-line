package com.tyjw.inspectline.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tyjw.inspectline.common.Constants;
import com.tyjw.inspectline.dao.UserDAO;
import com.tyjw.inspectline.entity.model.UserDO;
import com.tyjw.inspectline.entity.pojo.ResultEnum;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.redis.service.RedisService;
import com.tyjw.inspectline.service.UserService;
import com.tyjw.inspectline.web.websocket.ChannelObj;
import com.tyjw.inspectline.web.websocket.MessageUtils;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Slf4j
@Service
public class UserServiceImpl extends ServiceImpl<UserDAO, UserDO> implements UserService {

    @Autowired
    private UserDAO userDAO;
    @Autowired
    private RedisService redisService;
    @Autowired
    private Constants constants;


    @Override
    public ResultInfo login(UserDO userDO) {
        ResultInfo resultInfo = new ResultInfo();
        QueryWrapper<UserDO> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("phone", userDO.getPhone());
        queryWrapper.eq("password", DigestUtils.md5DigestAsHex(userDO.getPassword().getBytes()));
        try {
            List<UserDO> list = this.list(queryWrapper);
            if (null == list || list.size() == 0) {
                resultInfo.setResultEnum(ResultEnum.FAIL);
                resultInfo.setMessage("用户名或密码不正确");
                return resultInfo;
            }
            if (list.size() == 1) {
                UserDO record = list.get(0);
                System.out.println(record);
                if (record.getState() == 0) {
                    String token = getUuid();
                    //更新数据库
                    record.setLastIp(userDO.getLastIp());
                    record.setLastTime(new Date());
                    record.setToken(token);
                    record.updateById();
                    record.setToken(token);
                    record.setPassword(null);
                    resultInfo.setResultEnum(ResultEnum.SUCCESS);
                    resultInfo.setReturnData(record);
                    try {
                        redisService.set(constants.REDIS_LOGIN_USER_KEY + record.getId(), record);
                    } catch (Exception e) {
                        e.printStackTrace();
                        log.error("--------------------用户[{}]登录存入redis 缓存失败");
                        return new ResultInfo(ResultEnum.SYS_SERVER_ERROR);
                    }
                    return resultInfo;
                } else {
                    resultInfo.setResultEnum(ResultEnum.FAIL);
                    resultInfo.setMessage("该用户账号已被冻结，请联系客服");
                    return resultInfo;
                }
            } else {
                resultInfo.setResultEnum(ResultEnum.SYS_SERVER_ERROR);
                log.error("登录账号和密码同时查到多个，phone:{},pwd:{}", userDO.getPhone(), userDO.getPassword());
                return resultInfo;
            }
        } catch (Exception e) {
            resultInfo.setResultEnum(ResultEnum.SYS_SERVER_ERROR);
            log.error("登录异常退出");
            return resultInfo;
        }
    }

    @Override
    public ResultInfo loginout(Long uid) {
        ResultInfo resultInfo = new ResultInfo(ResultEnum.SUCCESS);
        try {
            redisService.delete(constants.REDIS_LOGIN_USER_KEY + uid);
            //关闭重复id的链接
            Collection<ChannelObj> iterator = MessageUtils.CHANNEL_MAP.values();
            for (ChannelObj channelObj : iterator) {
                ChannelHandlerContext context = channelObj.getCtx();
                Channel channel = context.channel();
                String socketUid = channelObj.getUserId();
                if (channel.isActive() && uid.toString().equals(socketUid)) {
                    InetSocketAddress ipSocket = (InetSocketAddress) channel.remoteAddress();
                    String clientIp = ipSocket.getAddress().getHostAddress();
                    log.info("用户退出关闭channel的id为：{}，用户id：{}，客户端ip地址：{},端口：{}", channel.id(), uid, clientIp, ipSocket.getPort());
                    channel.close();
                    MessageUtils.CHANNEL_MAP.remove(channel.id());
                    break;
                }
            }
        } catch (Exception e) {
            log.error("用户{}退出登录异常", uid);
            return new ResultInfo(ResultEnum.USER_LOGOUT_ERROR);
        }
        return resultInfo;
    }

    @Override
    public UserDO selectUserById(Long uid) {
        if (null == uid) {
            log.info("通过用户id查用户时，参数不能为null");
            return null;
        } else {
            try {
                return this.getById(uid);
            } catch (Exception e) {
                log.error("通过用户id查用户时异常，用户id为{}", uid);
                return null;
            }
        }
    }

    @Override
    public UserDO cacheUserById(Long uid) {
        return (UserDO) redisService.get("tyjw_inspectline:login_user:uid_"+uid);
    }

    @Override
    public List<UserDO> selectUserByRole(Integer projectId, List<Integer> roleIds) {
       /* List<Integer> roleIds = new ArrayList<>();
        for (int i = 0; i < roles.length; i++) {
            roleIds.add(roles[i]);
        }*/
        List<UserDO> list = userDAO.selectUserByRole(projectId,roleIds);
        return list;
    }

    /**
     * 生成uuid
     *
     * @return
     */
    public static String getUuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static void main(String[] args) {
        System.out.println(DigestUtils.md5DigestAsHex("18601721093".getBytes()).toUpperCase());
    }

}
