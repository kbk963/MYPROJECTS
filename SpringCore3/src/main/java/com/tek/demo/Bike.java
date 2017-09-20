package com.tek.demo;

public class Bike {
	private String name;

	public Bike(String name,int price)
	{
		this.name=name;
		this.price=price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	private int price;

	public void printDetails() {
		System.out.println(name + " price is " + price);
	}

}
