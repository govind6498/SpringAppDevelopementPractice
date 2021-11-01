package com.example.project1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
	@RequestMapping(value= {"","/","/home"})
	public String syaHello() {
		return "Hello Wrold";
	}
}
