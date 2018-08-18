package com.cauchy.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {
	@Test
	public void testUser() {
		// 1、加载配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2、创建对象
		User user = (User) context.getBean("user");
		// 3、输出对象的地址
		System.out.println(user);
		// 4、执行add()方法
		user.add();
	}
}
