package com.prasant.spring.service;

import org.springframework.stereotype.Service;

public class GreetingServiceImpl implements GreetingService {
	
	public static final String HELLO_GURUS = "Hello Gurus!!!!";

	@Override
	public String sayGreeting() {
		return HELLO_GURUS;
	}

}