package com.testng.org;

import org.testng.annotations.Test;

public class Multiple_Times {
	
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
	
	@Test(invocationCount = 10)
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
