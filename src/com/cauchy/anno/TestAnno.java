package com.cauchy.anno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnno {
	@Test
	public void testAnno() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AnnoUser annoUser = (AnnoUser) context.getBean("annoUser");
		System.out.println(annoUser);
		annoUser.add();
	}
}
