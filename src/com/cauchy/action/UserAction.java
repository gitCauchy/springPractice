package com.cauchy.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cauchy.property.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	public String execute() throws Exception{
		System.out.println("====action====");
		ApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) context.getBean("userService");
		userService.add();
		return NONE;
	}
}
