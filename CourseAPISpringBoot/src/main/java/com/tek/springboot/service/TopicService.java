package com.tek.springboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tek.springboot.model.Topic;
import com.tek.springboot.repository.DbRepo;
@Service
public class TopicService {
	@Autowired
	private DbRepo dbr;
	//List<Topic> topics= new ArrayList<Topic> (Arrays.asList(new Topic("Java","Core Java","Core java will be explained"),new Topic("Spring","Advanced Java","Advanced java will be explained")));
	
	public List<Topic> getallTopics()
	{
		List<Topic> topics =new ArrayList<Topic>();
		dbr.findAll().forEach(topics::add);
		return topics;
		
	}
	
	
	public Topic getById(String id)
	{
		
		return dbr.findOne(id);
		
	}
	
	
	public void create(Topic t)
	{
		dbr.save(t);
	}

	
	public void delete(String id)
	{
		dbr.delete(id);
		
	}
	
	
	
	
	public void update(String id,Topic topic)
	{
		
	dbr.save(topic);
	}
	

	
}
