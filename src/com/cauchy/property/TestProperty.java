package com.cauchy.property;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProperty {
	@Test
	public void testProperty() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PropertyDemo1 demo1 = (PropertyDemo1) context.getBean("propertyDemo1");
		System.out.println(demo1);
		demo1.test1();
	}
}
