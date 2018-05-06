package com.prasant.spring.controller;

import com.prasant.spring.service.GreetingService;

public class ConstructorInjectedController {
	
	private GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
