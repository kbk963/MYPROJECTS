package com.tek.springdata;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tek.springdata.dao.ConnectionDao;
import com.tek.springdata.dao.HibernateDao;
import com.tek.springdata.model.Circle;

public class DataDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	ApplicationContext ap=new ClassPathXmlApplicationContext("spring.xml");
	HibernateDao cd=ap.getBean(HibernateDao.class);
	//System.out.print(cd.getcircle(1).getName());
System.out.println(cd.getcirclecount());
	
	
	}

}
