package com.atguigu.spring.beans.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessBeforeInitialization "+bean+","+beanName+",");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		
		System.out.println("postProcessAfterInitialization "+bean+","+beanName+",");
		
		if ("car".equals(beanName)) {
			Car car = new Car();
			car.setBrand("Ford");
			return car;
		}else {
			return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
		}
	}
}
