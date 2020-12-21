package com.tyjw.inspectline.web.event;/*
package com.tyjw.inspectline.event;
import java.util.Date;

import cn.hutool.http.HttpUtil;
import com.google.protobuf.InvalidProtocolBufferException;
import com.tyjw.inspectline.common.TyjwEnum;
import com.tyjw.inspectline.entity.model.DangerBody;
import com.tyjw.inspectline.service.DangerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.utils.ByteUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import com.tyjw.inspectline.entity.projo.ServiceData;

import java.util.List;

@Component
@AllArgsConstructor
@Slf4j
public class KafkaConsumer {

    @Autowired
    private DangerService dangerService;

    @KafkaListener(topics = "kafka-topic-ai-beili-target_detect", groupId = "group_id_ai_target")
    public void data(ConsumerRecord consumerRecord) throws InvalidProtocolBufferException {
        log.info("时间戳：{}",consumerRecord.timestamp());
        byte[] value = (byte[]) consumerRecord.value();
        ServiceData.TargetDetectResult.Builder builder = ServiceData.TargetDetectResult.newBuilder().mergeFrom(value);
//        log.info("接收AI推送险情结果：{}",builder.toString());
        ServiceData.ImageExtendData markedImage = builder.getMarkedImage();
        String imageUrl = markedImage.getImageUrl();//目标图片地址，全路径
        log.info("--------------------------{}",imageUrl);
        if (StringUtils.isBlank(imageUrl)){
            log.error("AI检测结果图片信息不完整");
            return;
        }
        Integer taskId = markedImage.getTid();//任务id
        if (null==taskId){
            log.error("AI检测结果任务id不完整");
            return;
        }
        ServiceData.PositionPb location = markedImage.getLocation();
        Double lng = location.getLng();//目标经度
        Double lat = location.getLat();//目标维度
        if (null==lng || null==lat){
            log.error("AI检测结果经纬度不完整：[{}],[{}]",lng,lat);
            return;
        }
        ServiceData.TargetInfo targetInfo = builder.getTargets(0);
        String targetName = targetInfo.getTargetName();//目标类别中文/英文名，例如 "car"
        float targetProbability = targetInfo.getTargetProbability();//目标概率，比如0.8
        DangerBody dangerBody = new DangerBody();
//      dangerBody.setProjectId(0);
        dangerBody.setTaskId(taskId);
        dangerBody.setTargetId(6);//目标类型
        dangerBody.setCredibility(targetProbability);
//      dangerBody.setDistanceX(0.0F);
//      dangerBody.setDistanceY(0.0F);
        dangerBody.setLng(lng);
        dangerBody.setLat(lat);
//      dangerBody.setHeight(0.0F);
        dangerBody.setNowImageUrl(imageUrl);
//      dangerBody.setHisImageUrl("");
        dangerBody.setType(TyjwEnum.DANGET_TYPE_TARGET.getValue());
        dangerBody.setRemarks("AI检测目标为："+targetName);
        dangerBody.setTimeStamp(new Date(consumerRecord.timestamp()));
        boolean success = dangerService.saveAiDanger(dangerBody);
        log.info("AI保存结果：[{}]",success);
    }


    public static void main(String[] args) {
        String s = HttpUtil.get("http://10.0.0.94:8080/task/video_url?tid=753&aid=3");
        System.out.println(s);
    }


}*/
