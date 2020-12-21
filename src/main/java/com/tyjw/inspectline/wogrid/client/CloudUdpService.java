package com.tyjw.inspectline.wogrid.client;

import com.tyjw.inspectline.common.Constants;
import com.tyjw.inspectline.entity.pojo.WtyResult;
import com.tyjw.inspectline.service.WtyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Slf4j
@Service("cloudUdpService")
public class CloudUdpService {

	public static ConcurrentMap<Integer, CloudUdpClient> cloudUdpMap = new ConcurrentHashMap<Integer, CloudUdpClient>();

	@Autowired
	private WtyService wtyService;
	@Autowired
	private Constants constants;
	
	
	/**
	 * 根据taskId创建与云平台的UDP<br>
	 * 参数来自云平台
	 * @param taskId 任务编号
	 * @param userId 用户编号
	 * @param token  用户token
	 */
/*	public void createCloudUdp(int taskId,int userId,String token){
		if(cloudUdpMap.containsKey(taskId)){
			if(!cloudUdpMap.get(taskId).isAlive()){
				CloudUdpClient cc=new CloudUdpClient(taskId,userId,token);
				cc.start();
				cloudUdpMap.put(taskId, cc);
			}
		}else{
			CloudUdpClient cc=new CloudUdpClient(taskId,userId,token);
			cc.start();
			cloudUdpMap.put(taskId, cc);
		}
	}*/
	/**
	 * 根据taskId创建与云平台的UDP<br>
	 * 参数来自云平台
	 * @param taskId 任务编号
	 */
	public void createCloudUdp(int taskId,String accessKey,String accessKeySecret){
		if(!cloudUdpMap.containsKey(taskId) || !cloudUdpMap.get(taskId).isAlive()){
			WtyResult wtyResult = wtyService.dataLiveToken(accessKey,accessKeySecret,taskId);
			if (wtyResult.getCode()==200){
				Map<String, Object> map = (Map<String, Object>) wtyResult.getData();
				int uid = (int) map.get("uid");
				String token = (String) map.get("token");
				CloudUdpClient cc=new CloudUdpClient(taskId,uid,token);
				cc.start();
				cloudUdpMap.put(taskId, cc);
			}else {
				log.info("获取遥测分发token接口失败，{}，任务id为{}",wtyResult.getMessage(),taskId);
			}
		}
	}
	
	

	/**
	 * 在没有实时飞行时断开所有云端的UDP
	 */
	public void clearCloudUdp(){
		for(CloudUdpClient cc:cloudUdpMap.values()){
			cc.closeChannel();
		}
		cloudUdpMap.clear();
	}
}
