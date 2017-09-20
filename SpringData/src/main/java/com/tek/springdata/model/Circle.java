package com.tek.springdata.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Circle {
	
	private String name;
	@Id
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public Circle(int id, String string) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=string;
	}

}