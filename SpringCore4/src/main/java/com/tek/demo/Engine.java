package com.tek.demo;

public class Engine {
	private String name;
	private String enginecc;

	public Engine(String name, String enginecc) {
		this.name = name;
		this.enginecc = enginecc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnginecc() {
		return enginecc;
	}

	public void setEnginecc(String enginecc) {
		this.enginecc = enginecc;
	}

}
