package com.atguigu.spring.beans.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean<Car> {

	public void setBrand(String brand) {
		this.brand = brand;
	}

	private String brand;
	
	@Override
	public Car getObject() throws Exception {
		// TODO Auto-generated method stub		
		return new Car("BMW", 50000);
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

	
}
