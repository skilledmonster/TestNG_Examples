package com.skilledmonster.example;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Example to demonstrate use of @Test annotation at method level
 * 
 * @author Jagadeesh Motamarri
 * @version 1.0
 */
public class TestNGAnnotationExceptionExample {

	public CalculatorService service;

	@BeforeClass
	public void init() {
		System.out.println("@BeforeClass: The annotated method will be run before the first test method in the current class is invoked.");
		System.out.println("init service");
		service = new SimpleCalculator();
	}

	@Test(expectedExceptions = ArithmeticException.class)
	public void testDiv() {
		System.out.println("@Test : testDiv()");
		int result = service.div(1, 0);
	}

	@Test(expectedExceptions = ArithmeticException.class)
	public void testSum() {
		System.out.println("@Test : testDiv()");
		int result = service.sum(1, 0);
	}

}
