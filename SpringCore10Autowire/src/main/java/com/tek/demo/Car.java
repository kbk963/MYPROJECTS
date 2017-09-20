package com.tek.demo;

public class Car {
	
	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	

	public void printDetails() {
		System.out.println("engine name:"+engine.getName()+" cc:"+engine.getEnginecc());
	}

}
