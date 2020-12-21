package com.tyjw.inspectline.pdf.demo.util;



import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther:
 * @Date: 2019/12/06/9:26
 * @Description:
 */
public class RunMain {

    public static void main(String[] args) throws Exception {
        //		这里是选择某个模板
        String templateName = "report";
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("reportName", "镇江巡检任务一");
        paramMap.put("flightDate", "2020-03-01");
        paramMap.put("uavName", "SD-40");
        paramMap.put("pilot", "王傲天");
        paramMap.put("planName", "任务一");//任务名称
        paramMap.put("taskNumber", "20200301");//任务编号
        paramMap.put("flightDuration", "1024");//飞行时长
        paramMap.put("flightDistance", "48km");//飞行里程
        paramMap.put("seetype", "正射向下");//观测方式
        paramMap.put("dangerNum", "2");//险情数量
        paramMap.put("dangerType", "占压");//险情类型
        paramMap.put("dangerCoordinate", "116.22222, 38.111111");//险情坐标
        paramMap.put("nowImageUrl", "http://116.178.68.235:8005/group1/tyjw-inspectline/20200227/16/58/7/filename");//险情坐标
        //调用具体的实现方法
        PdfUtil.contractHandler(templateName, paramMap);



    }

}