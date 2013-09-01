package com.skilledmonster.common;

import org.testng.annotations.DataProvider;

/**
 * Data Provider class for TestNG test cases
 * 
 * @author Jagadeesh Motamarri
 * @version 1.0
 */
public class TestNGDataProvider {

	/**
	 * Data Provider for testing sum of 2 numbers
	 * 
	 * @return
	 */
	@DataProvider
	public static Object[][] testSumInput() {
		return new Object[][] { { 5, 5 }, { 10, 10 }, { 20, 20 } };
	}

	/**
	 * Data Provider for testing multiplication of 2 numbers
	 * 
	 * @return
	 */
	@DataProvider
	public static Object[][] testMultipleInput() {
		return new Object[][] { { 5, 5 }, { 10, 10 }, { 20, 20 } };
	}
}
