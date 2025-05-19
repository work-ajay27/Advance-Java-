package com.sample.HelloBro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication



//@SpringBootApplication => this annotation is combination of 3 annotations =

//1.configuration annotation= Mark this class as a configuration class.
//2.Enable auto configuration annotation
//3.component scan annotation.

public class HelloBroApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloBroApplication.class, args);
	}

}
