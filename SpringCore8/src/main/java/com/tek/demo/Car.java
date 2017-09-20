package com.tek.demo;

public class Car {
	private String name;
	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
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
		System.out.println(
				name + " price is " + price + " Has" + engine.getName() + " with " + engine.getEnginecc() + "CC");
	}

}
