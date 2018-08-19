package com.cauchy.anno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnoUser {
	@Test
	public void testAnnoUser() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AnnoUserService annoUserService = (AnnoUserService) context.getBean("annoUserService");
		annoUserService.add();
	}
}
