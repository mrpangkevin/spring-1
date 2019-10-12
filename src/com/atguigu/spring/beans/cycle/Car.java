package com.atguigu.spring.beans.cycle;

public class Car {
	public Car() {
		// TODO Auto-generated constructor stub
		System.out.println("Car's constructor...");
	}
	
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		System.out.println("setBrand...");
		this.brand = brand;
	}
	
	public void init() {
		System.out.println("init...");
		
	}
	
	public void destory() {
		System.out.println("destory...");
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + "]";
	}
	
	
}
