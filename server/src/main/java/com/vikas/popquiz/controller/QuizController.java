package com.vikas.popquiz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizController {
	
	@RequestMapping(value = "/greet", method = RequestMethod.GET)
	public String greet() {
		return "Hello World...!";
	}

}
