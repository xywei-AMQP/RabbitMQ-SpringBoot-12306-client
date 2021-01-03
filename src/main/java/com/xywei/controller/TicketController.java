package com.xywei.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.xywei.vo.UserResult;

/**
 * 模拟接收用户买票的请求
 * 
 * @author future
 * @Datetime 2021年1月3日 下午4:00:22<br/>
 * @Description
 */
@RestController
@RequestMapping("/ticket")
public class TicketController {

	@Autowired
	private RestTemplate restTemplate;

	private String url = "http://127.0.0.1:10000/ticket/handle/{userId}";

	@GetMapping("/buy")
	public UserResult ticketBuy(Integer userId) {

		Map<String, Integer> userMap = new HashMap<String, Integer>();
		userMap.put("userId", userId);

		// 直接发送请求给服务端
		UserResult result = restTemplate.getForObject(url, UserResult.class, userId);

		// 如何返回用户抢票是否成功的信息？
		return result;
	}
}
