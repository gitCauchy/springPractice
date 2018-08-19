package com.cauchy.anno;

import javax.annotation.Resource;

public class BookService {
	@Resource(name="bookDao")
	private BookDao bookDao;
	@Resource(name="orderDao")
	private OrderDao orderDao;
	public void add() {
		bookDao.add();
		orderDao.add();
	}
	
}
