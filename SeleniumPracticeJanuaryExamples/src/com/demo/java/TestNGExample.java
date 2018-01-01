package com.demo.java;

import org.testng.annotations.Test;

public class TestNGExample {
	
	
	@Test(priority=2)
	public void A() {
		
		System.out.println("Test-A");
	}
	
	@Test(dependsOnMethods={"A"},priority=1)
	public void B() {
		
		System.out.println("Test-B");
	}
	
	@Test
	public void a() {
		
		System.out.println("Test-a");
	}

}
