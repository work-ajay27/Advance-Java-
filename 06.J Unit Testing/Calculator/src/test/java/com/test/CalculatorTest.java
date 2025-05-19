package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.calculator.Calculator;

public class CalculatorTest {

	@Test
	public void addTest() {
		Calculator calculator = new Calculator();
		int a = 10;
		int b = 30;
		int result = calculator.add(a, b);

		assertEquals("Something went wrong :", 40, result);

	}

	@Test
	public void subTest() {
		Calculator calculator = new Calculator();
		int a = 20;
		int b = 5;

		int result = calculator.sub(a, b);

		assertEquals("Test Pass :", 15, result);
	}
}
