package com.cauchy.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {
	@Test
	public void testService() {
		ApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		OrderService orderService = (OrderService) context.getBean("orderService");
		orderService.accountMoney();
		
	}
}
