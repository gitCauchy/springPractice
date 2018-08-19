package com.cauchy.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
	@Test
	public void testBook() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AopBook aopBook = (AopBook) context.getBean("aopBook");
		aopBook.add();
	}
}
