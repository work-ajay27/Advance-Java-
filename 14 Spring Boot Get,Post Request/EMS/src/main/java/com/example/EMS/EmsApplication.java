package com.example.EMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.example.employee.repository")
@EntityScan("com.example.employee.dao")
@ComponentScan({ "com.example.employee.controller", "com.example.employee.service" })
@SpringBootApplication()
public class EmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmsApplication.class, args);
		System.out.println("Application Running Started )");
	}

}
