package com.tek.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix="wordConfig")
public class LuckyWordController {

String luckyword;

  public String getLuckyword() {
	return luckyword;
}

public void setLuckyword(String luckyword) {
	this.luckyword = luckyword;
}

@GetMapping("/lucky-word")
  public String showLuckyWord() {
    return "The lucky word is: " + luckyword;
  }
}