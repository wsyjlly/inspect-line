package com.tyjw.inspectline.common;


import com.tyjw.inspectline.entity.model.DangerBody;
import com.tyjw.inspectline.entity.projo.WotianyuTelemetryList;
import com.vividsolutions.jts.geom.Geometry;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class  Global {

	//公共线程池
	public static ExecutorService  THREAD_POOL=Executors.newFixedThreadPool(8);

	//实时遥测数据队列，声明一个容量为100的缓存队列
	public static BlockingQueue<WotianyuTelemetryList.DataList.Data> queue = new LinkedBlockingQueue<>(10);

	public static Map<Integer,WotianyuTelemetryList.DataList.Data> dataMap = new HashMap<>();

	//ai险情数据队列，声明一个容量为100的缓存队列
	public static BlockingQueue<DangerBody> aiQueue = new LinkedBlockingQueue<>(100);

	public static Map<Integer, Geometry> bdMap = new HashMap<>();
	
}
