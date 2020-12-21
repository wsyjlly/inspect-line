package com.tyjw.inspectline.common;

import com.tyjw.inspectline.web.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Objects;


@Component
public class Constants {

    /**
     * 根据项目id条件查询任务列表
     */
    @Value("${wty.plan.list}")
    public String wty_plan_list;
    /**
     * 历史遥测
     */
    @Value("${wty.history.data}")
    public String wty_history_data;
    /**
     * 历史视频
     */
    @Value("${wty.history.video}")
    public String wty_history_video;
    /**
     * 直播地址获取
     */
    @Value("${wty.data.live.video}")
    public String WTY_DATA_LIVE_VIDEO;
    /**
     *
     */
    @Value("${wty.video.type.sd}")
    public int WTY_VIDEO_SD;//标清

    @Value("${wty.video.type.hd}")
    public int WTY_VIDEO_HD;//高清

    /**
     *
     */
    @Value("${wty.telemetry.push.host}")
    public String WTY_TELEMETRY_PUSH_HOST;//遥测数据实时推送服务HOST
    /**
     *
     */
    @Value("${wty.telemetry.push.port}")
    public int WTY_TELEMETRY_PUSH_PORT;//遥测数据实时推送服务PORT

    /**
     *
     */
    //获取遥测分发token接口
    @Value("${wty.data.live.telemetry}")
    public String WTY_DATA_LIVE_TELEMETRY;

    /**
     * AI检测状态  key
     */
    @Value("${redis.aicheck.status.key}")
    public String REDIS_AICHECK_STATUS_KEY;
    /**
     * AI检测状态  hashkey
     */
    @Value("${redis.aicheck.status.hashkey}")
    public String REDIS_AICHECK_STATUS_HASHKEY;

    /**
     * 用户登录token  key
     */
    @Value("${redis.user.login.key}")
    public String REDIS_LOGIN_USER_KEY;

    /**
     * gofastdfs   url
     */
    @Value("${go.fastdfs.url}")
    public String GO_FASTDFS_URL;

    /**
     * gofastdfs   path
     */
    @Value("${go.fastdfs.path}")
    public String GO_FASTDFS_PATH;
    /**
     * gofastdfs   scene
     */
    @Value("${go.fastdfs.scene}")
    public String GO_FASTDFS_SCENE;
    /**
     * gofastdfs   showUrl
     */
    @Value("${go.fastdfs.showUrl}")
    public String GO_FASTDFS_SHOWURL;
    /**
     * gofastdfs   showUrl
     */
    @Value("${go.fastdfs.showUrl.out}")
    public String GO_FASTDFS_SHOWURL_OUT;


    @Value("${websocket.port}")
    public int WEBSOCKET_PORT;


    @Value("${report.template.path}")
    public String REPORT_TEMPLATE_PATH;
    @Value("${report.template.name}")
    public String REPORT_TEMPLATE_NAME;
    @Value("${report.html.path}")
    public String REPORT_HTML_PATH;

    /**
     * 开始算法并返回直播地址
     * AI
     */
    @Value("${wty.ai.live.video}")
    public String WTY_AI_LIVE_VIDEO;
    /**
     * 获取历史视频url
     * AI
     */
    @Value("${wty.ai.history.video}")
    public String WTY_AI_HISTORY_VIDEO;
}