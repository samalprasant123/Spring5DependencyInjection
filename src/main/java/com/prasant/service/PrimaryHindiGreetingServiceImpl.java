package com.prasant.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("hn")
public class PrimaryHindiGreetingServiceImpl implements GreetingService {

	@Override
	public String sayGreeting() {
		return "नमस्ते";
	}

}
