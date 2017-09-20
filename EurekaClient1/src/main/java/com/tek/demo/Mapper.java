package com.tek.demo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mapper {
	
	@Value("${words}")
	String words;
	
	 @GetMapping("/")
	  public @ResponseBody String getWord() {
	
	    return words;
	  }

}
