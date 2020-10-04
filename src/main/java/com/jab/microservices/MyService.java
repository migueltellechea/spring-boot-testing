package com.jab.microservices;

import org.springframework.stereotype.Service;

@Service
public class MyService {

	public static final String greetingMessage = "Hello, World";



	public String greet() {
		return greetingMessage;
	}
}
