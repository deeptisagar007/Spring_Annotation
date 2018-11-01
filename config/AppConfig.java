package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.bean.HelloWorld;


@Configuration
public class AppConfig {

	@Bean(name="helloBean")
	public HelloWorld getHelloWorld() {
		return new HelloWorld();
	}
	
	
}
