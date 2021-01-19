package com.example.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	public String sayHelloo() {
		System.out.println("Hello World");
		return "Hi All";
	}
}