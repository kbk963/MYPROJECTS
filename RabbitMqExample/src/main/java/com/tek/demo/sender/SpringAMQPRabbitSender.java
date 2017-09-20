package com.tek.demo.sender;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAMQPRabbitSender {
    public static void main(String[] args) throws Exception {
      AmqpTemplate amqpTemplate = (AmqpTemplate)(new ClassPathXmlApplicationContext("springamqp-rabbit-sender-context.xml")).getBean("amqpTemplate");
      int messagCount = 0;
	  while (messagCount < 10){
	    amqpTemplate.convertAndSend("firtskey", "Message # " + messagCount++);
	  }
	  System.out.println( messagCount + " message(s) sent successfully.");
	}
}