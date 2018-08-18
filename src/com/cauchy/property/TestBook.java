package com.cauchy.property;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
	@Test
	public void testBook() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Book book = (Book) context.getBean("book");
		book.bookDemo();
		
	}
}
