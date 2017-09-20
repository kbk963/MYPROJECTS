package com.tek.demo;
import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.discovery.DiscoveryClient;

@RestController
public class Mapper {
	@Autowired
private RestTemplate restTemplate;
	@GetMapping("/sentence")
	  public @ResponseBody String getSentence() {
	    return 
	      getWord("EurekaClient1") ;
	  }
	  
	  public String getWord(String service) {
	  
		  return restTemplate.getForObject("http://" + service, String.class);
	  }
}
