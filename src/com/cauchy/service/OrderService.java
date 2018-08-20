package com.cauchy.service;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class OrderService {
	private OrderDao orderDao;

	public OrderDao getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}
	public void accountMoney() {
		orderDao.lessMoney();
		orderDao.moreMoney();
	}
}
