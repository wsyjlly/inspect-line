package com.tyjw.inspectline.web.telemetry.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Objects;

import static com.tyjw.inspectline.web.telemetry.TcpClient.loginHost;
import static com.tyjw.inspectline.web.telemetry.TcpClient.utoken;
import static com.tyjw.inspectline.web.telemetry.TcpClient.userId;

/**********************************
 * @Author YSW
 * @Description
 * @Date 2020.12.16 - 9:49
 **********************************/

public class HttpRequest {
	/**
	 * Http登录云平台获取 userId utoken 作为获取云盒列表的请求头字段
	 * @param name
	 * @param password
	 * @return
	 */
	public static ModelMap login(String name, String password) {
		HashMap<String, Object> map = new HashMap<>(2);
		map.put("accountNumber", name);
		map.put("accountCode", password);
		HttpHeaders httpHeaders = new HttpHeaders();
		HttpEntity<HashMap<String, Object>> httpEntity = new HttpEntity<>(map, httpHeaders);
		RestTemplate restTemplate = new RestTemplate();
		ModelMap result = restTemplate.postForObject(loginHost+"/api/client/login", httpEntity, ModelMap.class);
		ModelMap resultMap = new ModelMap();
		resultMap.addAttribute("state", 0);
		if (result.get("state").equals(0)) {
			resultMap.addAttribute("state", 1);
			Object respBody = result.get("content");
			if (Objects.nonNull(respBody)) {
				ModelMap modelMap = new ObjectMapper()
						.convertValue(respBody, ModelMap.class);
				resultMap.addAllAttributes(modelMap);
			}
		}
		return resultMap;
	}

	/**
	 * Http获取云盒列表
	 * @return
	 */
	public static ModelMap getBoxList() {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("x-uid", userId);
		httpHeaders.add("x-token", utoken);
		HttpEntity<String> requestEntity = new HttpEntity<>(null, httpHeaders);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<ModelMap> request = restTemplate.exchange(loginHost+"/api/box/list", HttpMethod.GET, requestEntity, ModelMap.class);
		ModelMap result = request.getBody();
		return result;
	}
}
