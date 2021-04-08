package com.testng.org;

import org.testng.annotations.Test;

public class Ignore_Test {
	
	 @Test
	private void browserlaunch() {
	System.out.println("browserlaunch");
	}
	
	@Test
	private void login() {
	System.out.println("login");
	}
	
	@Test
	private void searchlaptop() {
	System.out.println("searchlaptop");
	}
	
	@Test(enabled = false)
	private void searchmobile() {
	System.out.println("searchmobile");
	}
	

	@Test
	private void logout() {
	System.out.println("logout");
	}

	@Test
	private void browserclose() {
	System.out.println("browserclose");
}
}
