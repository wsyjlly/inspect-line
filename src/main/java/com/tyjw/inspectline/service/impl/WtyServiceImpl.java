package com.tyjw.inspectline.service.impl;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.tyjw.inspectline.common.Constants;
import com.tyjw.inspectline.entity.pojo.WtyResult;
import com.tyjw.inspectline.service.WtyService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Transactional
@Service
public class WtyServiceImpl implements WtyService {

    @Autowired
    private Constants constants;

    @Override
    public WtyResult planList(String id, String secret, int projectid, Integer status, String startTime, String endTime) {
        String url = constants.wty_plan_list;
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("secret", secret);
        map.put("projectid",projectid);
        if (null!=status)
            map.put("status",status);
        if (StringUtils.isNotBlank(startTime))
            map.put("startTime",startTime);
        if (StringUtils.isNotBlank(endTime))
            map.put("endTime",endTime);
        String result = null;
        try {
            result = HttpUtil.get(url, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JSON.parseObject(result, WtyResult.class);
    }

    @Override
    public WtyResult historyData(String id, String secret, int projectid, int taskid, int type) {
        String url = constants.wty_history_data;
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("secret", secret);
        map.put("projectid", projectid);
        map.put("taskid", taskid);
        map.put("type", type);
        String result = null;
        try {
            result = HttpUtil.get(url, map);
//            log.info("请求wty任务详情接口返回：{}",result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JSON.parseObject(result, WtyResult.class);
    }

    @Override
    public WtyResult historyVideo(String id, String secret, int projectid, int taskid, int type) {
        String url = constants.wty_history_video;
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("secret", secret);
        map.put("projectid", projectid);
        map.put("taskid", taskid);
        map.put("type", type);
        String result = null;
        try {
            result = HttpUtil.get(url, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JSON.parseObject(result, WtyResult.class);
    }

    @Override
    public WtyResult liveVideo(String id, String secret, int projectid, Integer planId) {
        String url = constants.WTY_DATA_LIVE_VIDEO;
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("secret", secret);
        map.put("taskid", planId);
        String result = null;
        try {
            result = HttpUtil.get(url, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JSON.parseObject(result, WtyResult.class);
    }

    @Override
    public WtyResult dataLiveToken(String id, String secret, Integer planId) {
        String url = constants.WTY_DATA_LIVE_TELEMETRY;
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("secret", secret);
        map.put("taskid", planId);
        String result = null;
        try {
            result = HttpUtil.get(url, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JSON.parseObject(result, WtyResult.class);
    }

    public static void main(String[] args) {
//        String url = "http://eapi.wogrid.com/info/tasks";
        String url = "http://eapi.wogrid.com/data/history/telemetry";
        Map<String, Object> map = new HashMap<>();
        map.put("id", "e1da631ecdb94ec2a3f23ae100c25ffa");
        map.put("secret", "60J8eOq3l2bQxD1M260B531");
        map.put("projectid", 1);
        map.put("taskid", 1);
        map.put("type", 1);
        String result = null;
        try {
            result = HttpUtil.get(url, map);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
