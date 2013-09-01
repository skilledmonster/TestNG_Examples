package com.skilledmonster.example;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Example to demonstrate use of @Test annotation of TestNG framework
 * 
 * @author Jagadeesh Motamarri
 * @version 1.0
 */
public class TestNGAnnotationTestExample {

	public CalculatorService service;

	@BeforeClass
	public void init() {
		System.out.println("@BeforeClass: The annotated method will be run before the first test method in the current class is invoked.");
		System.out.println("init service");
		service = new SimpleCalculator();
	}

	@Test
	public void testSum() {
		System.out.println("@Test : testSum()");
		int result = service.sum(10, 5);
		Assert.assertEquals(result, 15);
	}

	@Test
	public void testDiv() {
		System.out.println("@Test : testDiv()");
		int result = service.div(10, 5);
		Assert.assertEquals(result, 2);
	}

	@Test
	public void testMultiple() {
		System.out.println("@Test : testMultiple()");
		int result = service.multiple(10, 5);
		Assert.assertEquals(result, 50);
	}

	@Test
	public void testSub() {
		System.out.println("@Test : testSub()");
		int result = service.sub(10, 5);
		Assert.assertEquals(result, 5);
	}

}
