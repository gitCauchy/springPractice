package com.cauchy.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyBook {
	public void before1() {
		System.out.println("====before1====");
	}
	public void after1() {
		System.out.println("====after1====");
	}
	public void around1(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("====around1====");
		proceedingJoinPoint.proceed();
		System.out.println("====around2====");
	}
}
