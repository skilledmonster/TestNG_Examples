package com.skilledmonster.example;

import org.testng.annotations.Test;

/**
 * Example to demonstrate TestNG dependency method execution
 * 
 * @author Jagadeesh Motamarri
 * @version 1.0
 */
public class SingleDependencyTest {

	@Test
	public void start() {
		System.out.println("Starting the server");
	}

	@Test(dependsOnMethods = { "start" })
	public void process() {
		System.out.println("Processing the data!");
	}

	@Test(dependsOnMethods = { "process" })
	public void stop() {
		System.out.println("Stopping the server");
	}

}
