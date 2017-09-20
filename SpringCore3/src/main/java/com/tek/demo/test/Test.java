package com.tek.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tek.demo.Bike;
import com.tek.demo.Car;
import com.tek.demo.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Car car = (Car) applicationContext.getBean("car");
		Bike bike=(Bike)applicationContext.getBean("bike");
		car.printDetails();
		bike.printDetails();

	}

}
