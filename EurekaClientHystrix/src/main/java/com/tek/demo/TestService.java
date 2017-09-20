package com.tek.demo;

import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class TestService {

	@Autowired
	TestInterface test;

	@HystrixCommand(fallbackMethod = "getFallback")
	public String getWord() {
		String s = test.getWord();
		return s;
	}

	public String getFallback() {
		return "clumsy";
	}

}
