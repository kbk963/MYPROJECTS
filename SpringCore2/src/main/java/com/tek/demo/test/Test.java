package com.tek.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tek.demo.Car;
import com.tek.demo.config.Config;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		Car car = (Car) applicationContext.getBean("car");
		car.printDetails();

	}

}
