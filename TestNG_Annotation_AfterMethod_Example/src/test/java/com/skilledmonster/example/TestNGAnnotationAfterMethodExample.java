package com.skilledmonster.example;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * Example to demonstrate use of @AfterMethod annotation of TestNG framework
 * 
 * @author Jagadeesh Motamarri
 * @version 1.0
 */
public class TestNGAnnotationAfterMethodExample {

	@AfterMethod
	public void tearDown() {
		System.out.println("@AfterMethod: The annotated method will be run after each test method.");
	}

	@Test
	public void validateSum() {
		System.out.println("@Test : validateSum()");
		int a = 5;
		int b = 10;
		Assert.assertEquals(a + b, 15);
	}

	@Test
	public void validateDifference() {
		System.out.println("@Test : validateDifference()");
		int a = 5;
		int b = 10;
		Assert.assertEquals(b - a, 5);
	}

}
