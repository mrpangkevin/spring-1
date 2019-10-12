package com.atguigu.spring.beans;

public class HelloWorld {

	private String name;

	public String getName() {
		return name;
	}

	public void setName2(String name) {
		this.name = name;
		System.out.println("set Name:" + name);
	}	
	
	public void hello() {
		System.out.println("hello:"+name);
	}

	public HelloWorld() {
		System.out.println("HelloWorld Constructor.");
	}
	
	
}
