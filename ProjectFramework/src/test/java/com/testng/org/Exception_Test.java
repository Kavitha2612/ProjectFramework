package com.testng.org;

import org.testng.annotations.Test;

public class Exception_Test {
	@Test
	private void add() {
	
		int i =10;
		int j = 20;
		int k = i+j;
		System.out.println(k);
	}
	@Test(expectedExceptions = ArithmeticException.class)
	private void divide() {
	
		int i = 10;
		int j = 0;
		System.out.println(i/j);
	}
	

}
