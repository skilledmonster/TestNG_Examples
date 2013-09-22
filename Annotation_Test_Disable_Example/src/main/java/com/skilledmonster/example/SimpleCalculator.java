package com.skilledmonster.example;

/**
 * Calculator Service implementation class
 * 
 * @author Jagadeesh Motamarri
 * @version 1.0
 */
public class SimpleCalculator implements CalculatorService {

	public int sum(int a, int b) {
		return a + b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		return a / b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

}
