package com.tyjw.inspectline.web.init;

import com.tyjw.inspectline.common.Global;
import com.tyjw.inspectline.web.queue.ConsumerPosition;
import com.tyjw.inspectline.web.queue.ProducerService;
import com.tyjw.inspectline.web.websocket.NettyWebSocketServerStart;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//import com.tyjw.inspectline.event.AiDangerKafka;

/**
 * 项目启动初始化
 */
@Component
public class InitRunStart {

	@PostConstruct
	public void init() {
		Global.THREAD_POOL.execute(new ConsumerPosition());
		Global.THREAD_POOL.execute(new NettyWebSocketServerStart());
		Global.THREAD_POOL.execute(new ProducerService());
	}
}
