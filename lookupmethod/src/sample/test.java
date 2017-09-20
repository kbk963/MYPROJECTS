package sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	
	public static void main(String args[]){
	ApplicationContext ap= new ClassPathXmlApplicationContext("sample/SpringConfig.xml");
	car c= (car)ap.getBean("c");
	System.out.println(c.mycarengine().getEnginename());
	}
}
