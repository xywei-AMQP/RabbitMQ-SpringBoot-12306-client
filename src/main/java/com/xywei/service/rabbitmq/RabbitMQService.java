package com.xywei.service.rabbitmq;

import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.xywei.vo.UserResult;

@Component
public class RabbitMQService {
	/**
	 * #client -> server
	 * rabbitmq.exchange.com.12306.ticket.client2server=exchange.ticket.client2server
	 * rabbitmq.routingkey.com.12306.ticket.client2server=routingkey.ticket.client2server
	 * 
	 * #server -> client
	 * rabbitmq.exchange.com.12306.ticket.server2client=exchange.ticket.server2client
	 * rabbitmq.routingkey.com.12306.ticket.server2client=routingkey.ticket.server2client
	 */

	@Value("${rabbitmq.exchange.com.12306.ticket.client2server}")
	private String exchangeClient2Server;
	@Value("${rabbitmq.routingkey.com.12306.ticket.client2server}")
	private String routingKeyClient2Server;

	@Value("${rabbitmq.exchange.com.12306.ticket.server2client}")
	private String exchangeServer2Client;
	@Value("${rabbitmq.routingkey.com.12306.ticket.server2client}")
	private String routingKeyServer2Client;

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public String send2RabbitMQ(int userId) {
		rabbitTemplate.convertAndSend(exchangeClient2Server, routingKeyClient2Server, userId);
		// TODO 发送过去之后，用户如何得知自己抢票的结果？这一步怎么处理？
		return null;
	}

	@RabbitListener(bindings = {
			@QueueBinding(value = @Queue, exchange = @Exchange(name = "${rabbitmq.exchange.com.12306.ticket.server2client}", type = "direct"), key = {
					"${rabbitmq.routingkey.com.12306.ticket.server2client}" }) })
	public String receiveFromRabbitMQ(UserResult result) {
		System.out.println("server 处理结果: " + result);
		return null;
	}

}
