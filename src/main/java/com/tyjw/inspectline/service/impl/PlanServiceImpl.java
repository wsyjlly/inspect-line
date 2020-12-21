package com.tyjw.inspectline.service.impl;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.protobuf.InvalidProtocolBufferException;
import com.tyjw.gofastdfs.GoFastDfsUploadResult;
import com.tyjw.gofastdfs.GoFastdfsUtil;
import com.tyjw.inspectline.common.Constants;
import com.tyjw.inspectline.common.TyjwEnum;
import com.tyjw.inspectline.dao.PlanDAO;
import com.tyjw.inspectline.entity.dto.AirPlanHistoryDTO;
import com.tyjw.inspectline.entity.dto.DangerDTO;
import com.tyjw.inspectline.entity.dto.PlanDTO;
import com.tyjw.inspectline.entity.model.MediaDO;
import com.tyjw.inspectline.entity.model.PlanDO;
import com.tyjw.inspectline.entity.model.PlanDOExample;
import com.tyjw.inspectline.entity.model.ProjectDO;
import com.tyjw.inspectline.pdf.demo.util.HtmUtil;
import com.tyjw.inspectline.entity.pojo.ResultEnum;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.entity.pojo.WtyResult;
import com.tyjw.inspectline.entity.projo.WotianyuTelemetryList;
import com.tyjw.inspectline.service.DangerService;
import com.tyjw.inspectline.service.PlanService;
import com.tyjw.inspectline.service.ProjectService;
import com.tyjw.inspectline.service.WtyService;
import com.tyjw.inspectline.common.utils.DateStyle;
import com.tyjw.inspectline.common.utils.DateUtil;
import com.tyjw.inspectline.common.utils.DistanceUtil;
import com.tyjw.inspectline.entity.vo.DangerBodyVO;
import com.tyjw.inspectline.entity.vo.DangerReportVO;
import com.tyjw.inspectline.entity.vo.DangerResultVO;
import com.tyjw.inspectline.entity.vo.PlanVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.math.BigDecimal;
import java.util.*;

@Slf4j
@Transactional
@Service
public class PlanServiceImpl extends ServiceImpl<PlanDAO, PlanDO> implements PlanService {


    @Autowired
    private Constants constants;

    @Autowired
    private WtyService wtyService;

    @Autowired
    private DangerService dangerService;

    @Autowired
    private PlanDAO planDAO;

    @Autowired
    private ProjectService projectService;

    @Override
    public AirPlanHistoryDTO historyVideo(Integer planId, Integer projectId) {
        ProjectDO projectDO = projectService.queryByProjectId(projectId);
        AirPlanHistoryDTO dto = new AirPlanHistoryDTO();
        //获取直播转存视频(标清)
        WtyResult mediaResult = wtyService.historyVideo(projectDO.getAccessKey(), projectDO.getAccessKeySecret(), projectId, planId, constants.WTY_VIDEO_SD);
        dto.setMedia(getMediaList(mediaResult));
        //获取直播转存视频(标清)
        WtyResult localResult = wtyService.historyVideo(projectDO.getAccessKey(), projectDO.getAccessKeySecret(), projectId, planId, constants.WTY_VIDEO_HD);
        dto.setLocalMedia(getMediaList(localResult));
        return dto;
    }

    private List<MediaDO> getMediaList(WtyResult mediaResult) {
        List<MediaDO> list = new ArrayList<>();
        if (mediaResult.getCode() == 200) {
            List<Map<String, Object>> mediaAll = (List<Map<String, Object>>) mediaResult.getData();
            for (Map<String, Object> one : mediaAll) {
                MediaDO mt = new MediaDO();
                mt.setMediaUrl((String) one.get("url"));
                String startTime = (String) one.get("startTime");
                mt.setStartTime(DateUtil.StringToDate(startTime));
                list.add(mt);
            }
        }
        return list;
    }


    @Override
    public List<Map<String, Object>> list(PlanDTO planDTO, Integer projectId) {
        try {
            String startTime = null;
            String endTime = null;
            Date startDate = planDTO.getStartTime();
            Date endDate = planDTO.getEndTime();
            if (null != startDate)
                startTime = DateUtil.DateToString(startDate, DateStyle.YYYY_MM_DD);
            if (null != endDate)
                endTime = DateUtil.DateToString(endDate, DateStyle.YYYY_MM_DD);
            ProjectDO projectDO = projectService.queryByProjectId(projectId);
            WtyResult wtyResult = wtyService.planList(
                    projectDO.getAccessKey(), projectDO.getAccessKeySecret(), projectId,
                    planDTO.getFlightState(),
                    startTime,
                    endTime
            );
            List<Map<String, Object>> list = new ArrayList<>();
            if (wtyResult.getCode() == 200) {
                List<Map<String, Object>> tasks = (List<Map<String, Object>>) wtyResult.getData();
                if (null != tasks && tasks.size() > 0) {
                    //查询险情个数
                    List<DangerBodyVO> dangerList = dangerService.selectDangerNumberByTask(projectId);
                    Map<String, Integer> dangerNumMap = new HashMap<>();
                    for (DangerBodyVO danger : dangerList) {
                        dangerNumMap.put(danger.getTaskId().toString(), danger.getCount());
                    }
                    for (Map<String, Object> one : tasks) {
                        Map<String, Object> record = new HashMap<>();
                        record.put("planId", one.get("id"));//计划编号
                        record.put("planName", one.get("taskName"));//计划名称
                        record.put("userName", one.get("pilots"));//飞手名称
                        record.put("uavName", one.get("uavName"));//无人机型号
                        record.put("planLine", one.get("route"));//计划航线
                        record.put("startTime", DateUtil.StringToDate((String) one.get("flightStarttime")));//开始时间
                        record.put("endTime", DateUtil.StringToDate((String) one.get("flightEndtime")));//结束时间
                        record.put("flightState", one.get("status"));//任务的飞行状态(0未飞行1飞行中2已结束)
                        record.put("hasTelemetry", one.get("hasTelemetry"));//是否有遥测数据
                        record.put("hasVideo", one.get("hasVideo"));//是否有标清视频
                        record.put("hasHVideo", one.get("hasHVideo"));//是否有高清视频
                        record.put("taskNumber", one.get("taskNumber"));
                        record.put("pilots", one.get("pilots").toString());
                        record.put("dangerNum", null == dangerNumMap.get(one.get("id").toString()) ? 0 : dangerNumMap.get(one.get("id").toString()));
                        record.put("aiCheckStatus", dangerService.getAiCheckStatus((Integer) one.get("id")));
                        list.add(record);
                    }
                }
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    @SuppressWarnings("Duplicates")
    @Override
    public AirPlanHistoryDTO history(Integer id, Integer projectId) {
        try {
            ProjectDO projectDO = projectService.queryByProjectId(projectId);
            WtyResult wtyResult = wtyService.historyData(projectDO.getAccessKey(), projectDO.getAccessKeySecret(), projectId, id, 1);
            String bytesBase64String = null;
            if (wtyResult.getCode() == 200) {
                bytesBase64String = (String) wtyResult.getData();
            }
            AirPlanHistoryDTO dto = new AirPlanHistoryDTO();
            dto.setTrackString(bytesBase64String);
            return dto;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ResultInfo liveVideo(Integer planId, Integer projectId) {
        ResultInfo resultInfo = new ResultInfo(ResultEnum.SUCCESS);
        ProjectDO projectDO = projectService.queryByProjectId(projectId);
        WtyResult wtyResult = wtyService.liveVideo(projectDO.getAccessKey(), projectDO.getAccessKeySecret(), projectId, planId);
        if (wtyResult.getCode() == 200) {
            resultInfo.setReturnData(wtyResult.getData());
        } else {
            resultInfo.setResultEnum(ResultEnum.FAIL);
            resultInfo.setMessage(wtyResult.getMessage());
        }
        return resultInfo;
    }

    @Override
    public boolean insertFinishPlan(PlanDO record, Integer projectId) {
        ProjectDO projectDO = projectService.queryByProjectId(projectId);
        WtyResult wtyResult = wtyService.historyData(projectDO.getAccessKey(), projectDO.getAccessKeySecret(), projectId, record.getPlanId(), 1);
        String bytesBase64String = "";
        if (wtyResult.getCode() == 200) {
            bytesBase64String = (String) wtyResult.getData();
            WotianyuTelemetryList.DataList dataList = null;
            try {
                dataList = WotianyuTelemetryList.DataList.parseFrom(Base64.getDecoder().decode(bytesBase64String));
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }
            List<WotianyuTelemetryList.DataList.Data> list = dataList.getDataListList();
            BigDecimal flightDistance = BigDecimal.ZERO;
            for (int i = 0; i < list.size(); i++) {
                if (i != 0) {
                    flightDistance = flightDistance.add(BigDecimal.valueOf(DistanceUtil.getDistance(list.get(i - 1).getLongitude(), list.get(i - 1).getLatitude(), list.get(i).getLongitude(), list.get(i).getLatitude())));
                }
            }
            WotianyuTelemetryList.DataList.Data firstData = null;
            WotianyuTelemetryList.DataList.Data lastData = null;
            if (null != list && list.size() > 0) {
                firstData = list.get(0);
                lastData = list.get(list.size() - 1);
            }
            record.setFlightState(TyjwEnum.FLIGHT_STATE_FINISH.getValue());
            record.setState(0);
            record.setCreateTime(new Date());
            record.setFlightDuration((int) ((record.getEndTime().getTime() - record.getStartTime().getTime()) / 1000));//飞行时长
            record.setFlightDistance(flightDistance.doubleValue());//飞行里程
            if (null != firstData) {
                record.setStartLongitude(firstData.getLongitude());
                record.setStartLatitude(firstData.getLatitude());
            }
            if (null != lastData) {
                record.setEndLongitude(lastData.getLongitude());
                record.setEndLatitude(lastData.getLatitude());
            }
            record.setProjectId(projectId);
            planDAO.insertSelective(record);
        } else {
            record.setFlightState(TyjwEnum.FLIGHT_STATE_FINISH.getValue());
            record.setState(0);
            record.setCreateTime(new Date());
            record.setFlightDuration((int) ((record.getEndTime().getTime() - record.getStartTime().getTime()) / 1000));//飞行时长
            record.setFlightDistance(0.0);//飞行里程
            record.setProjectId(projectId);
            planDAO.insertSelective(record);
        }
        return false;
    }

    @Override
    public Map<String, Object> flightStatistics(PlanDTO dto) {
        Map<String, Object> map = planDAO.flightStatistics(dto);
        return map;
    }

    @Override
    public PageInfo<List<PlanDO>> detailStatistics(PlanDTO dto) {
        PlanDOExample example = new PlanDOExample();
        PlanDOExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("plan_id asc");
        try {
            if (null != dto.getStartTime()) {
                Date startDate = DateUtil.DateToDate(dto.getStartTime(), DateStyle.YYYY_MM_DD);
                criteria.andStartTimeGreaterThanOrEqualTo(startDate);
            }
            if (null != dto.getEndTime()) {
                String endstr = DateUtil.DateToString(dto.getEndTime(), DateStyle.YYYY_MM_DD);
                Date endDate = DateUtil.StringToDate(endstr + " 23:59:59");
                criteria.andEndTimeLessThanOrEqualTo(endDate);
            }
            if (StringUtils.isNotBlank(dto.getPlanName())) {
                criteria.andPlanNameLike("%" + dto.getPlanName() + "%");
            }
            if (null != dto.getPlanId())
                criteria.andPlanIdEqualTo(dto.getPlanId());
//            if (dto.getPageNum() != null && dto.getPageSize() != null)
            PageHelper.startPage(dto.getPageNum(), dto.getPageSize());
            List<PlanDO> list = planDAO.selectByExample(example);
            return new PageInfo(list);
        } catch (Exception e) {
            e.printStackTrace();
            return new PageInfo(new ArrayList<>());
        }
    }

    @Override
    public PlanDO queryById(Integer planId) {
        return planDAO.selectByPrimaryKey(planId);
    }

    @Override
    public Page<PlanVO> historyPageList(PlanDTO dto) {
        String planName = null;
        String startTime = null;
        String endTime = null;
        if (StringUtils.isNotBlank(dto.getPlanName()))
            planName = dto.getPlanName();
        if (null != dto.getStartTime()) {
            startTime = DateUtil.DateToString(dto.getStartTime(), DateStyle.YYYY_MM_DD);
        }
        if (null != dto.getEndTime()) {
            String endstr = DateUtil.DateToString(dto.getEndTime(), DateStyle.YYYY_MM_DD);
            Date endDate = DateUtil.StringToDate(endstr + " 23:59:59");
            endTime = DateUtil.DateToString(endDate, DateStyle.YYYY_MM_DD_HH_MM_SS);
        }
        Page<PlanVO> page = new Page<>(dto.getPageNum(), dto.getPageSize());
        page = (Page<PlanVO>) planDAO.historyPageList(page, planName, startTime, endTime, dto.getDangerSort(), dto.getProjectId());
        return page;
    }

    @Override
    public ResultInfo report(Integer taskId) {
        ResultInfo resultInfo = new ResultInfo(ResultEnum.SUCCESS);
        DangerReportVO reportVO = new DangerReportVO();
        PlanVO planVO = new PlanVO();
        PlanDO planDO = this.getById(taskId);
        BeanUtils.copyProperties(planDO,planVO);
        reportVO.setPlanVO(planVO);

        List<DangerBodyVO> dangerList = new ArrayList<>();
        DangerDTO dangerDTO = new DangerDTO();
        dangerDTO.setPageNum(1);
        dangerDTO.setPageSize(100);
        dangerDTO.setTaskId(taskId);
        dangerList = dangerService.pageList(dangerDTO).getReturnData().getRecords();

        if (dangerList != null && dangerList.size() > 0) {
            int dangerTotal=dangerList.size();//险情总数量
            int unassignNum=0;//未指派数量
            int finishNum=0;//已处理数量
            int startNum=0;//处理中数量
            StringBuffer stringBuffer = new StringBuffer("");
            for (DangerBodyVO record : dangerList) {
                stringBuffer.append(record.getTargetName()+"  ");
                switch (record.getStatus().intValue()){
                    case 0:
                        unassignNum++;
                        break;
                    case 1:
                        startNum++;
                        break;
                    case 2:
                        finishNum++;
                        break;
                    default:
                        break;
                }
                //查询险情处理结果
                List<DangerResultVO> dangerResultList = dangerService.dangerResults(record.getId());
                if (null!=dangerResultList && dangerResultList.size()>0) {
                    record.setDangerResult(dangerResultList.get(0));
                }
            }
            reportVO.setDangerList(dangerList);
            reportVO.setDangerTotal(dangerTotal);
            reportVO.setUnassignNum(unassignNum);
            reportVO.setFinishNum(finishNum);
            reportVO.setStartNum(startNum);
            reportVO.setTargetNames(stringBuffer.toString());

        }
        File file = null;
        try {
            String localHtmlName = System.currentTimeMillis() + ".html";
            file = HtmUtil.createHtm(constants.REPORT_TEMPLATE_PATH, constants.REPORT_TEMPLATE_NAME, constants.REPORT_HTML_PATH, localHtmlName, reportVO);
            com.tyjw.gofastdfs.ResultInfo resultInfo2 = GoFastdfsUtil.uploadFile(constants.GO_FASTDFS_URL, constants.GO_FASTDFS_PATH, constants.GO_FASTDFS_SCENE, file, constants.GO_FASTDFS_SHOWURL);
            log.info("请求gofastdfs返回：{}", JSON.toJSONString(resultInfo2));
            if (resultInfo2.getState() == 0) {
                GoFastDfsUploadResult goFastDfsUploadResult = (GoFastDfsUploadResult) resultInfo2.getReturnData();
                resultInfo.setReturnData("http://14.204.73.149" + goFastDfsUploadResult.getSrc() + "?download=1");
                return resultInfo;
            } else {
                resultInfo.setResultEnum(ResultEnum.FAIL);
                return resultInfo;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (file != null)
                file.delete();
        }
        return resultInfo;
    }

    @Override
    public String aiLiveVideo(Integer planId) {
        try {
            String result = HttpUtil.get(String.format(constants.WTY_AI_LIVE_VIDEO, planId),3000);
            JSONObject jsonObject = JSON.parseObject(result);
            int code = jsonObject.getInteger("code").intValue();
            if (code==0)
                return jsonObject.getString("res");
            return null;
        } catch (Exception e) {
            log.error("获取AI直播视频地址异常");
            return null;
        }
    }

    @Override
    public String aiHistoryVideo(Integer planId) {
        try {
            String result = HttpUtil.get(String.format(constants.WTY_AI_HISTORY_VIDEO, planId),3000);
            JSONObject jsonObject = JSON.parseObject(result);
            int code = jsonObject.getInteger("code").intValue();
            if (code==0)
                return jsonObject.getString("res");
            return null;
        } catch (Exception e) {
            log.error("获取AI历史视频地址异常");
            return null;
        }
    }


    public static void main(String[] args) throws InvalidProtocolBufferException {
        /*String bytesBase64String = "";
        WotianyuTelemetryList.DataList dataList = WotianyuTelemetryList.DataList.parseFrom(Base64.getDecoder().decode(bytesBase64String));
        List<WotianyuTelemetryList.DataList.Data> list = dataList.getDataListList();
        List<Object> list2 = new ArrayList<>();
        for (WotianyuTelemetryList.DataList.Data data : list) {
            Map<String, Object> map = new HashMap<>();
            map.put("airspeed", data.getAirspeed());
            map.put("altitudeHeight", data.getAltitudeHeight());
            map.put("latitude", data.getLatitude());
            map.put("longitude", data.getLongitude());
            map.put("pitch", data.getPitch());
            map.put("roll", data.getRoll());
            map.put("timeStamp", data.getTimestamps());
            map.put("velocity", data.getVelocity());
            map.put("yaw", data.getYaw());
            list2.add(map);
        }
        System.out.println(JSON.toJSONString(list2));*/

        String url = "{\"code\":0,\"msg\":\"success\",\"res\":\"www.baidu.com\"}";
        JSONObject jsonObject = JSON.parseObject(url);
        System.out.println(jsonObject.getInteger("code"));
        System.out.println(jsonObject.getString("res"));

    }

}
