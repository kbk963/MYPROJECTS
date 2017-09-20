package com.tek.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ CarConfig.class, BikeConfig.class })
public class AppConfig {

}
