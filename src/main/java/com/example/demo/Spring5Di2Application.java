package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controller.MyController;

@SpringBootApplication
public class Spring5Di2Application {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(Spring5Di2Application.class, args);
		
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHelloo();
		System.out.println(greeting);
	}

}
