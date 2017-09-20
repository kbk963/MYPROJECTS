package com.tek.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tek.demo.Bike;
@Configuration
public class BikeConfig {
	@Bean(name = "bike")
	public Bike bike() {
		return new Bike("CBZ", 90000);
	}
}