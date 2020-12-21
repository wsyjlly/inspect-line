package com.tyjw.inspectline.web.queue;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import com.tyjw.inspectline.common.Global;
import com.tyjw.inspectline.entity.model.DangerBody;
import com.tyjw.inspectline.entity.projo.WotianyuTelemetryList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Slf4j
@Service("producerService")
public class ProducerService implements Runnable {


    public static void sendPosition(WotianyuTelemetryList.DataList.Data data) {
        try {
            if (!Global.queue.offer(data, 2, TimeUnit.SECONDS)) {//设定的等待时间为2s，如果超过2s还没加进去返回true
                log.error("放入数据失败");
            }
        } catch (InterruptedException e) {
            log.error("放入数据异常");
        }
//       Global.dataMap.put(data.getTaskId(),data);
    }

    public void sendAiDanger(DangerBody DangerBodyDO) {
        log.info("发送者发送AI数据");
        try {
//            if (!Global.aiQueue.offer(DangerBodyDO, 2, TimeUnit.SECONDS)) {//设定的等待时间为2s，如果超过2s还没加进去返回true
            if (!Global.aiQueue.offer(DangerBodyDO)) {//设定的等待时间为2s，如果超过2s还没加进去返回true
                log.error("放入AI数据失败");
            }
        } catch (Exception e) {
            log.error("放入AI数据异常");
        }
    }

    @Override
    public void run() {
        /*while (true) {
            receiveYukongData();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
    }

    private static final String yukong_url = "https://yukong-api.yukong.live/api/third/task/page/list";
    private static final String yukong_token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJjdXJyZW50VGltZU1pbGxpcyI6IjE2MDQwMzc4Mzg2MzMiLCJleHAiOjE5MTk1NzA2MzgsImFjY291bnQiOiI5NDgiLCJwbGF0Zm9ybSI6InRoaXJkIn0.WWHWv1moyHsSCIsdKD9BLY0CUZDCpAkRtOg--rc2Po8";

    public void receiveYukongData() {
        HashMap<String, String> headers = new HashMap<>();//存放请求头，可以存放多个请求头
        headers.put("u-token", yukong_token);
        JSONObject params = new JSONObject();
        params.put("taskState", 1);
        String result = HttpUtil.createPost(yukong_url).timeout(2000)
                .addHeaders(headers)
                .body(params)
                .execute().body();
        log.info("yukong:[{}]",result);
        JSONObject jsonObject = new JSONObject(result);
        if (jsonObject.getInt("state").intValue() != 0) {
            return;
        }
        JSONArray records = jsonObject.getJSONObject("returnData").getJSONArray("records");
        records.jsonIter().forEach(item -> {
            WotianyuTelemetryList.DataList.Data.Builder builder = WotianyuTelemetryList.DataList.Data.newBuilder();
            builder.setTaskId(item.getInt("taskId"));
            builder.setUavId(0);
            builder.setMissionComputerId(0);
            if (item.containsKey("rtmp"))
                builder.setUavName(item.getStr("rtmp"));
            builder.setLatitude(item.getDouble("lat"));
            builder.setLongitude(item.getDouble("lng"));
            builder.setPitch(0.0F);
            builder.setRoll(0.0F);
            builder.setYaw(0.0F);
            builder.setUltrasonicHeight(item.getFloat("altitude"));
            builder.setAltitudeHeight(item.getFloat("altitude"));
            builder.setAirspeed(item.getFloat("velocity"));
            builder.setVelocity(item.getFloat("velocity"));
            builder.setTimestamps(System.currentTimeMillis());
            sendPosition(builder.build());
        });

    }

    public void readTxt() {
        String path = "F:\\workspaces\\油气管道巡线\\test\\2695.txt";
//        String path = "/data/server/tahe/709.txt";
        BufferedReader read = null;
        try {
            read = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
            String bytesBase64String = read.readLine();
            WotianyuTelemetryList.DataList dataList = WotianyuTelemetryList.DataList.parseFrom(Base64.getDecoder().decode(bytesBase64String));
            List<WotianyuTelemetryList.DataList.Data> list = dataList.getDataListList();
            int count = 0;
            for (WotianyuTelemetryList.DataList.Data data : list) {
                sendPosition(data);
                Thread.sleep(1000);
                count++;
            }
            if (count == list.size()) {
                count = 0;
                readTxt();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        /*String path = "F:\\workspaces\\油气管道巡线\\test\\3119.txt";
        BufferedReader read = null;
        try {
            read = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
            String bytesBase64String = read.readLine();
            WotianyuTelemetryList.DataList dataList = WotianyuTelemetryList.DataList.parseFrom(Base64.getDecoder().decode(bytesBase64String));
            List<WotianyuTelemetryList.DataList.Data> list = dataList.getDataListList();
            int count = 0;
            List<Map<String,Object>> list2 = new ArrayList<>();
            for (WotianyuTelemetryList.DataList.Data data : list) {
//                System.out.println(DateUtil.stampToDate(data.getTimestamps()+"")+"--"+data.getLongitude());
//                log.info("时间：[{}],lng:[{}] lat:[{}]",DateUtil.stampToDate(data.getTimestamps()+""),data.getLongitude(),data.getLatitude());
//                System.out.println(data.getTimestamps()+" "+data.getLongitude()+" "+data.getLatitude());
                Map<String,Object> map = new HashMap<>();
                map.put("timestamps",data.getTimestamps());
                map.put("lng",data.getLongitude());
                map.put("lat",data.getLatitude());
                list2.add(map);
//                Thread.sleep(1000);
                count++;
            }
            System.out.println(count);
            AppendToFile.appendMethodA("F:\\test\\3119.txt", JSON.toJSONString(list2));
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        String url = "https://yukong-api.wogrid.com/api/third/task/page/list";
        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJjdXJyZW50VGltZU1pbGxpcyI6IjE2MDM4ODA2ODk5ODIiLCJleHAiOjE5MTk0MTM0ODksImFjY291bnQiOiIxIiwicGxhdGZvcm0iOiJ0aGlyZCJ9._aYFqTd5RidvuNCU-2CgotpYKOWQDVF7UGSPxG3OLXw";

        HashMap<String, String> headers = new HashMap<>();//存放请求头，可以存放多个请求头
        headers.put("u-token", token);
        JSONObject params = new JSONObject();
        params.put("taskState", 2);

        String result = HttpUtil.createPost(url)
                .addHeaders(headers)
                .body(params)
                .execute().body();
        System.out.println(result);
        JSONObject jsonObject = new JSONObject(result);
        if (jsonObject.getInt("state").intValue() != 0) {
            return;
        }
        JSONArray records = jsonObject.getJSONObject("returnData").getJSONArray("records");
        records.jsonIter().forEach(item -> {
            WotianyuTelemetryList.DataList.Data.Builder builder = WotianyuTelemetryList.DataList.Data.newBuilder();
            builder.setTaskId(item.getInt("taskId"));
            builder.setUavId(0);
            builder.setMissionComputerId(0);
            if (item.containsKey("rtmp")) {
                builder.setUavName(item.getStr("rtmp"));
            }
            builder.setLatitude(item.getDouble("lat"));
            builder.setLongitude(item.getDouble("lng"));
            builder.setPitch(0.0F);
            builder.setRoll(0.0F);
            builder.setYaw(0.0F);
            builder.setUltrasonicHeight(item.getFloat("altitude"));
            builder.setAltitudeHeight(item.getFloat("altitude"));
            builder.setAirspeed(item.getFloat("velocity"));
            builder.setVelocity(item.getFloat("velocity"));
            builder.setTimestamps(System.currentTimeMillis());
            sendPosition(builder.build());
        });


    }

}
