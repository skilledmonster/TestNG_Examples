package com.skilledmonster.example;

import org.testng.annotations.Test;

/**
 * Example to demonstrate TestNG inherited dependency method execution
 * 
 * @author Jagadeesh Motamarri
 * @version 1.0
 */
public class InheritedDependencyTest extends DependencyTest {

	@Test(dependsOnMethods = { "start" })
	public void process() {
		System.out.println("Processing the data!");
	}

	@Test(dependsOnMethods = { "process" })
	public void stop() {
		System.out.println("Stopping the server");
	}
}
