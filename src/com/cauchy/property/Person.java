package com.cauchy.property;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private String pname;

	public void setPname(String pname) {
		this.pname = pname;
	}
	public void test1() {
		System.out.println(pname);
	}
	
	private String [] arrs;
	private List<String> list;
	private Map<String,String> map;
	private Properties properties;

	public void setArrs(String[] arrs) {
		this.arrs = arrs;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	public void test2() {
		System.out.println(arrs);
		System.out.println(list);
		System.out.println(map);
		System.out.println(properties);
	}
	
}
