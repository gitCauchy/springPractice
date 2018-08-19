package com.cauchy.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="annoUserService")
public class AnnoUserService {
	//定义dao类型的属性
	@Autowired
	private AnnoUserDao annoUserDao;
	public void add() {
		System.out.println("====service====");
		annoUserDao.add();
	}
}
