package com.sample.HelloBro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

//It is a special spring annotation.It combine the two annotations. 1. Controller and 2. Responce Body.
//@RestController => It can request and responce the web applications.

public class HelloBroController {
	@GetMapping("/")
	
//	It will mapp the root URL.
	public String showText() {

		return "This is Ajay from MCA";

	}
}
