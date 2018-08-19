package com.cauchy.anno;

import org.springframework.stereotype.Component;
@Component(value="annoUserDao")
public class AnnoUserDao {
	public void add() {
		System.out.println("====dao====");
	}
}
