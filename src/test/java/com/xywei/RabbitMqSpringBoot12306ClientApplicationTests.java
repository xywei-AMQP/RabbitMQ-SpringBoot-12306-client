package com.xywei;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.xywei.service.rabbitmq.RabbitMQService;

@SpringBootTest
class RabbitMqSpringBoot12306ClientApplicationTests {

	@Autowired
	private RabbitMQService rabbitMQService;

	@Test
	void contextLoads() {
	}

	@Test
	public void testDIValue() {
		
		System.out.println(rabbitMQService);
	}

}
