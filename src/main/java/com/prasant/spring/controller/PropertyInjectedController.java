package com.prasant.spring.controller;

import com.prasant.spring.service.GreetingService;

public class PropertyInjectedController {
	
	public GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
