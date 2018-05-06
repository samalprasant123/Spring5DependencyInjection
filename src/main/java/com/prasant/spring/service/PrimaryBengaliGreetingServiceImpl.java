package com.prasant.spring.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("be")
public class PrimaryBengaliGreetingServiceImpl implements GreetingService {

	@Override
	public String sayGreeting() {
		return "হ্যালো";
	}

}
