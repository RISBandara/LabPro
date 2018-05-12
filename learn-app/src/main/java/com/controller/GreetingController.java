package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.model.Greeting;

@RestController
@RequestMapping("/greeting")

public class GreetingController {

	
	public Greeting getGreeting(){
		return new Greeting(0,"message");
	}
}
