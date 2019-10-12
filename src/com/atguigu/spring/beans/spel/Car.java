package com.atguigu.spring.beans.spel;

public class Car {
	private String brand;
	private double price;
	private double tirePerimeter;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", tirePerimeter=" + tirePerimeter + "]";
	}
	public Car() {
		super();
		System.out.println("Car's constructor.");
	}
	public double getTirePerimeter() {
		return tirePerimeter;
	}
	public void setTirePerimeter(double tirePerimeter) {
		this.tirePerimeter = tirePerimeter;
	}
	
}
