package com.skilledmonster.example;

import org.testng.annotations.Test;

/**
 * Example to demonstrate use of timeOut attribute of @Test Annotation
 * 
 * @author Jagadeesh Motamarri
 * @version 1.0
 */
public class TestNGAnnotationTestMethodTimeOutExample {

	@Test(timeOut = 2000)
	public void timeOutTestMethodOne() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("TimeOut Test Method One!!");
	}

	@Test(timeOut = 5000)
	public void timeOutTestMethodTwo() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("TimeOut Test Method Two!!");
	}

	@Test(timeOut = 2000)
	public void timeOutTestMethodRunForEver() {
		while (true) {
			// Do nothing
		}
	}

}
