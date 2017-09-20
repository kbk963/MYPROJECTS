package com.tek.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	@Autowired
	@Qualifier(value="engine1")
	private Engine engine;

	public void printDetails() {
		System.out.println("engine name:" + engine.getName() + " cc:" + engine.getEnginecc());
	}

}
