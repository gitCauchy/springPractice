package com.cauchy.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean3 {
	// 测试实例化工厂方法
	@Test
	public void testBean() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean3 bean3 = (Bean3) context.getBean("bean3");
		System.out.println(bean3);
		bean3.add();
	}

}
