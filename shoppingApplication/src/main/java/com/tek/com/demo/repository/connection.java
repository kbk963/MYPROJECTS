package com.tek.com.demo.repository;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


import com.tek.com.demo.model.finalorder;

public class connection {
	Map<Integer,finalorder> m=new TreeMap<Integer,finalorder>();
	
	public int save(finalorder r) {
	final Configuration configuration = new Configuration().configure();
    final StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
    final SessionFactory factory = configuration.buildSessionFactory(builder.build());
    final Session session = factory.openSession();
    session.beginTransaction();
    int id = (int) session.save(r);
   // m.put(1, r);
   // List<finalorder> orders = session.createQuery("from Order").list();
    session.getTransaction().commit();
    return id;
	}
	
/*	public void get(Order r) {
		final Configuration configuration = new Configuration().configure();
	    final StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
	    final SessionFactory factory = configuration.buildSessionFactory(builder.build());
	    final Session session = factory.openSession();
	    session.beginTransaction();
	    session.save(r);
	    session.getTransaction().commit();
		}*/
	
	

}
