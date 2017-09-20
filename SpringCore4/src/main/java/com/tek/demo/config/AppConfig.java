package com.tek.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tek.demo.Car;
import com.tek.demo.Engine;

@Configuration

public class AppConfig {
	@Bean(name = "car")
	public Car car(Engine engine) {
		return new Car("honda", 60000, engine);
	}

	@Bean(name = "engine")
	public Engine engine() {
		return new Engine("benz engine", "1000");
	}

}
