package com.skilledmonster.example;

public class SimpleCalculator implements CalculatorService {

	public int sum(int a, int b) {
		return a + b;
	}

	public int multiple(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		return a / b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

}
