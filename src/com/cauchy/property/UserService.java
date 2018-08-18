package com.cauchy.property;

public class UserService {
	// 定义dao类型的属性
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void add() {
		System.out.println("service");
		userDao.add();
	}
	
}
