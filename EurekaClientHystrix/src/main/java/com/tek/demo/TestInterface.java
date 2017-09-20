package com.tek.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@FeignClient("EurekaClient1")
public interface TestInterface {
@RequestMapping(method=RequestMethod.GET,value="/")
	String getWord();

}
