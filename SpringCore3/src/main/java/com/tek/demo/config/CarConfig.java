package com.tek.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tek.demo.Car;

@Configuration
public class CarConfig {
	@Bean(name="car")
	public Car car()
	{
		return new Car("honda",60000);
	}

}
