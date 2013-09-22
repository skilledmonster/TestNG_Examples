package com.skilledmonster.example;

import org.testng.annotations.Test;

/**
 * Example to demonstrate TestNG inherited dependency method execution
 * 
 * @author Jagadeesh Motamarri
 * @version 1.0
 */
public class BaseTest {

	@Test
	public void start() {
		System.out.println("Starting the server");
	}
}
