package com.example.Spring.AOP;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
	public final calculatorService calService;

	CalculatorController(calculatorService calService) {
		this.calService = calService;
	}

	@GetMapping("/add")
	public String add(@RequestParam int a, @RequestParam int b) {
		int result = calService.add(a, b);
		return "Result of Addition :" + result;
	}

	@GetMapping("/sub")
	public String sub(@RequestParam int a, @RequestParam int b) {
		int result = calService.sub(a, b);
		return "The Subtraction is :" + result;
	}
}
