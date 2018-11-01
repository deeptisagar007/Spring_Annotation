package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.bean.HelloWorld;
import com.demo.config.AppConfig;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld helloWorld = context.getBean("helloBean", HelloWorld.class);
		System.out.println(helloWorld.sayHello());

	}

}
