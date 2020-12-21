package com.tyjw.inspectline.web.telemetry;

import com.tyjw.inspectline.common.Global;
import com.tyjw.inspectline.web.telemetry.tcp.TcpClientChannelInitializer;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.ModelMap;

import java.net.InetSocketAddress;
import java.util.*;

import static com.tyjw.inspectline.web.telemetry.common.HttpRequest.getBoxList;
import static com.tyjw.inspectline.web.telemetry.common.HttpRequest.login;


/**********************************
 * @Author YSW
 * @Description 	->http登录
 * 					->http定时每搁10秒获取云盒列表，检测云盒是否在线
 * 						->在线云盒检测是否建立过Tcp Channel，未建立过则直接建立Channel，建立过则检测Tcp Channel是否关闭，关闭则重新建立连接，存储Channel
 * 						->不在线云盒检测是否建立了Tcp Channel，已建立则检测Channel是否关闭，未关闭则关闭，移除Channel
 * @Date 2020.11.30 - 14:19
 * test : hengat11 110: hengat10
 **********************************/

@Slf4j
@Configuration
public class TcpClient {
	public static final String loginHost = "http://47.104.142.82:12000";
	public static String userId = "";
	public static String utoken = "";
	public static String username = "hengat10";
	public static String password = "123456!";
	private static final EventLoopGroup group = new NioEventLoopGroup();
	private static final HashMap<String, Channel> channelMap = new HashMap<>();
	public static final HashMap<Integer, String> videoUrlMap = new HashMap<>();

	//Spring注入Bean时开启线程
	public TcpClient(){
		Global.THREAD_POOL.execute(TcpClient::start);
		new Timer().schedule(new TimerTask() {
			@Override
			public void run() {
				buildTcpConnect();
			}
		},1000,10000);
	}

	public static void start() {
		ModelMap login = login(username, password);
		log.info(login.toString());
		if (login.get("state").equals(1)) {
			userId = Integer.toString((Integer) login.get("userId"));
			utoken = (String) login.get("utoken");
			new Timer().schedule(new TimerTask() {
				@Override
				public void run() {
					buildTcpConnect();
				}
			},1000,10000);
		} else {
			throw new IllegalStateException("登录异常...");
		}
	}

	/**
	 * 云盒状态与所对应Tcp连接状态定时检测与管理
	 */
	private static void buildTcpConnect() {
		try {
			log.debug("Box status and tcp channel status schedule check...");
			ModelMap map = getBoxList();
			//http请求云盒列表正常返回
			if (map.get("state").equals(0)) {
				ArrayList<HashMap<String, Object>> boxList = (ArrayList<HashMap<String, Object>>) map.get("content");
				//遍历所有云盒
				boxList.forEach(box ->{
					String boxSn = (String) box.get("boxSn");
					int taskId = (int) box.get("taskId");
					int onLine = (int) box.get("onLine");
					videoUrlMap.put(taskId,"rtsp://47.104.142.82:554/"+boxSn+"-"+taskId);
					//云盒在线
					if (onLine == 1) {
						log.debug("Box<"+boxSn+"> is online!");
						//未建立过Tcp Client 连接
						if (Objects.isNull(channelMap.get(boxSn))){
							//建立Tcp连接
							Channel channel = newTcpClient(boxSn,taskId,(String) box.get("telemetryServerIp"),(int) box.get("telemetryServerPort"));
							//存储Tcp连接
							channelMap.put(boxSn,channel);
							log.debug("First connected Box<"+boxSn+"> Tcp client: connected Success!");
						//已建立过Tcp Client 连接
						}else {
							Channel channel = (Channel) channelMap.get(boxSn);
							log.debug("Check Box<"+boxSn+"> Tcp client status > isOpen: "+channel.isOpen());
							//Tcp连接已关闭
							if (!(channel.isOpen())){
								//重新建立Tcp连接
								channel = newTcpClient(boxSn,taskId,(String) box.get("telemetryServerIp"),(int) box.get("telemetryServerPort"));
								//存储更新Tcp连接
								channelMap.put(boxSn,channel);
								log.debug("Reconnected Box<"+boxSn+"> Tcp client: connected Success!");
							} else {
								log.debug("Check Box<"+boxSn+"> Tcp client is open: "+channel.isActive());
							}
						}
					//云盒离线
					} else {
						Channel channel = (Channel) channelMap.get(boxSn);
						//Tcp存储未删除
						if (Objects.nonNull(channel)){
							//Tcp链接在线
							if (channel.isOpen()){
								channel.close();
								log.debug("Box: <"+boxSn+"> Tcp client: close !");
							}
							//存储移除Tcp
							channelMap.remove(boxSn);
							log.debug("Box<"+boxSn+"> is offline!");
						}
					}
				});
			}else {
				log.error("定时获取云盒列表线程异常, http重新登录...");
				ModelMap login = login(username, password);
				if (login.get("state").equals(1)) {
					userId = Integer.toString((Integer) login.get("userId"));
					utoken = (String) login.get("utoken");
					log.info("http重新登录成功！");
				} else {
					log.error("http登录异常！");
				}
			}
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * 建立在线云盒建立对应的Tcp Client接收遥测数据，发送到客户端
	 * @param boxSn
	 * @param taskId
	 * @param ip
	 * @param port
	 * @return
	 */
	public static Channel newTcpClient(String boxSn,int taskId,String ip,int port) {
		Bootstrap bootstrap = new Bootstrap();
				bootstrap.group(group)
				.option(ChannelOption.TCP_NODELAY, true)
				.channel(NioSocketChannel.class)
				.handler(new TcpClientChannelInitializer(boxSn,taskId));
		Channel channel = null;
		try {
			ChannelFuture future = bootstrap.connect(new InetSocketAddress(ip, port)).sync();
			channel = future.channel();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return channel;
	}
}