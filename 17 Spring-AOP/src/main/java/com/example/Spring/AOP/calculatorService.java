package com.example.Spring.AOP;

import org.springframework.stereotype.Service;

@Service
public class calculatorService {

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}
}
