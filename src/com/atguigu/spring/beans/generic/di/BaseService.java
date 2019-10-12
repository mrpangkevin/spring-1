package com.atguigu.spring.beans.generic.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

public class BaseService<T> {

	@Autowired
	protected BaseRepository<T> repository;
	
	public void add() {
		System.out.println("add...");
		System.out.println(repository);
		
	}
	
}
