package com.vikas.tyk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@RequestMapping(value = "/greet", method = RequestMethod.GET)
	public String greet() {
		System.out.println("dooo");
		return "Hello World...!";
	}

}
