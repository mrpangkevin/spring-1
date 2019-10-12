package com.atguigu.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

public class InstanceCarFactory {

	private Map<String, Car>  cars = null;
	public InstanceCarFactory() {
		cars = new HashMap<String, Car>();
		cars.put("audi", new Car("audi", 30000));
		cars.put("ford", new Car("ford", 50000));
	}
	public Car getCar(String name) {
		return cars.get(name);
	}
}
