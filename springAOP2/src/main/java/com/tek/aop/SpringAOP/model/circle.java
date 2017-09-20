package com.tek.aop.SpringAOP.model;

import org.springframework.stereotype.Component;

@Component
public class circle {
	private String name="CIRCLE";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
