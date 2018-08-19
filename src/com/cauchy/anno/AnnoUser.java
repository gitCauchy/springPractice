package com.cauchy.anno;

import org.springframework.stereotype.Component;

@Component(value="annoUser")//<bean id = "user" class = "... ..."
public class AnnoUser {
	public void add() {
		System.out.println("======add=====");
	}
}
