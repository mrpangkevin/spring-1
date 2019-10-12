package com.atguigu.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main (String[] args) {
//		HelloWorld hw = new HelloWorld();
//		hw.setName("kevin");
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//		HelloWorld hw = (HelloWorld)ctx.getBean("helloWorld");
//		hw.hello();
		
		
		Car car = (Car)ctx.getBean("car_audi");
		System.out.println(car);
		Car car2 = (Car)ctx.getBean("car_bmw");
		System.out.println(car2);
		
		Person person = (Person)ctx.getBean("person");
		System.out.println(person);
		Person person2 = (Person)ctx.getBean("person2");
		System.out.println(person2);
		Person person3 = (Person)ctx.getBean("person3");
		System.out.println(person3);
	}
}
