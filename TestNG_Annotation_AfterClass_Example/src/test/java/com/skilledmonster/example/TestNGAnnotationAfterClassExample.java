package com.skilledmonster.example;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

/**
 * Example to demonstrate use of @BeforeClass annotation of TestNG framework
 * 
 * @author Jagadeesh Motamarri
 * @version 1.0
 */
public class TestNGAnnotationAfterClassExample {

	@AfterClass
	public void intializeBeforeClass() {
		// one-time initialization code for the class before all test cases are run
		System.out.println("@AfterClass: The annotated method will be run after all the test methods in the current class have been run.");
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
