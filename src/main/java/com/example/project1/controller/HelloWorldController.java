package com.example.project1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
	@RequestMapping(value= {"","/","/home"})
	public String syaHello() {
		return "Hello Wrold";
	}
	
	@RequestMapping(value= {"/query"},method=RequestMethod.GET)
	public String syHello(@RequestParam(value="fName") String fName, @RequestParam(value="lName") String lName) {
		return "Hello "+fName+" "+lName+"!";
	}
	
	@GetMapping("/param/{name}")
	public String sysHello(@PathVariable String name) {
		return "Hello "+name+"!";
	}

}
