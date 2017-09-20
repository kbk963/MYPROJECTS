package com.tek.aop.SpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tek.aop.SpringAOP.model.Triangle;
import com.tek.aop.SpringAOP.service.shapeservice;

public class AOPMain {

	public static void main(String[] args) {


		ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
		shapeservice t = ap.getBean(shapeservice.class);
		
		System.out.println(t.getC().getName());

	}

}
