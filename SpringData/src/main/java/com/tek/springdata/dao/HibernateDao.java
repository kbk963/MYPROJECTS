package com.tek.springdata.dao;



import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class HibernateDao {
	
	@Autowired
	private SessionFactory sf;

	public SessionFactory getSf() {
		return sf;
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	public int getcirclecount()
	{
		
		String hql="select * from details";
		Query q=getSf().openSession().createQuery(hql);
		
		return (Integer) q.uniqueResult();
		
	}

}
