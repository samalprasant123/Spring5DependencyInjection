package com.prasant.spring.controller;

import org.springframework.stereotype.Controller;

import com.prasant.spring.service.GreetingService;

@Controller
public class ConstructorInjectedController {
	
	private GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
