package com.tek.demo.producer;


import java.net.URI;
import java.net.URISyntaxException;

import org.apache.activemq.broker.BrokerFactory;
import org.apache.activemq.broker.BrokerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ApplicationStart {

	public static void main(String[] args) throws URISyntaxException, Exception {

		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		
		
		try{
			
			producer produce = (producer) context.getBean("producer");
			produce.sendMessage("hello sashank");
			
			
			Consumer consume = (Consumer) context.getBean("consumer");
			System.out.println(consume.receiveMessage()+"xxxxx");
			
		}
		finally{
			
			context.close();
		}

	}

}
