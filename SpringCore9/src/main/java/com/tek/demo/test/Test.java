package com.tek.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tek.demo.Car;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		Car car=(Car)applicationContext.getBean("car");
		car.setName("Honda");
		car.printDetails();
		Car car1=(Car)applicationContext.getBean("car");
		car1.printDetails();
		
	}

}
