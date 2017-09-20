package com.tek.aop.SpringAOP.model;

import org.springframework.stereotype.Component;

@Component
public class Triangle {
	
	private String name;
	
	public String getName() {
	System.out.println("hello");
	return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
