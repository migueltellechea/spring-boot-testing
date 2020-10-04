package com.jab.microservices;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	public static final String greetingMessage = "Hello, World";

	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return greetingMessage;
	}

}
