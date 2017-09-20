package com.tek.springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tek.springboot.model.Topic;
import com.tek.springboot.service.TopicService;
@RestController
public class TopicController {
	@Autowired
	private TopicService ts;
	
	@RequestMapping("/topics")
	public List<Topic> getall()
	{
		
		return ts.getallTopics();
	}

	@RequestMapping("/topics/{id}")
	public Topic getById(@PathVariable String id)
	{
		return ts.getById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void create(@RequestBody Topic t)
	{
		ts.create(t);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void delete(@PathVariable String id)
	{
		ts.delete(id);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	public void update(@RequestBody Topic t,@PathVariable String id)
	{
		ts.update(id,t);
		
	}
	
	
	
	
}
