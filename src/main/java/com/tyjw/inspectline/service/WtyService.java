package com.tyjw.inspectline.service;

import com.tyjw.inspectline.entity.pojo.WtyResult;

public interface WtyService {
    /**
     * 根据项目id条件查询任务列表
     * @param id    企业或项目授权Access Key ID
     * @param secret    企业或项目授权Access Key Secret
     * @param projectid 项目id，Key必须拥有项目的权限
     * @param status    任务状态，共有4种，-1(作废)，0(未开始)，1(飞行中)，2(飞行结束)
     * @param startTime 任务状态，共有4种，-1(作废)，0(未开始)，1(飞行中)，2(飞行结束)
     * @param endTime   查询结束时间(查询条件为任务开始时间)，格式必须为严格的'2019-01-01'
     * @return
     */
    WtyResult planList(String id, String secret, int projectid, Integer status, String startTime, String endTime);

    /**
     *
     * @param id 企业或项目授权Access Key ID
     * @param secret    企业或项目授权Access Key Secret
     * @param projectid 项目id
     * @param taskid    任务id
     * @param type  数据类型：1表示遥测数据，2表示自定义上传遥测数据，其它值无效)
     * @return
     */
    WtyResult historyData(String id, String secret, int projectid, int taskid, int type);


    /**
     *
     * @param id 企业或项目授权Access Key ID
     * @param secret    企业或项目授权Access Key Secret
     * @param projectid 项目id
     * @param taskid    任务id
     * @param type  视频类型：3表示直播转存视频(标清)，4表示机载视频(高清)，其它值无效
     * @return
     */
    WtyResult historyVideo(String id, String secret, int projectid, int taskid, int type);

    /**
     * 获取直播地址
     * @param id
     * @param secret
     * @param projectid
     * @param planId
     * @return
     */
    WtyResult liveVideo(String id, String secret, int projectid, Integer planId);

    /**
     *  获取遥测分发token接口
     * @param id    企业或项目授权Access Key ID
     * @param secret    企业或项目授权Access Key Secret
     * @param planId    任务id;KEY必须拥有该任务的权限, 该任务必须处于飞行中
     * @return
     */
    WtyResult dataLiveToken(String id, String secret, Integer planId);
}
