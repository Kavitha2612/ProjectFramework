package com.testng.org;

import org.testng.annotations.Test;

public class Priority_test {
	
	@Test(priority = 2)
	private void browserlaunch() {
	System.out.println("browserlaunch");
	}
	
	@Test(priority = 1)
	private void login() {
	System.out.println("login");
	}
	
	@Test(priority = 0)
	private void searchlaptop() {
	System.out.println("searchlaptop");
	}
	
	@Test(priority = -1)
	private void searchmobile() {
	System.out.println("searchmobile");
	}
	

	@Test(priority = -2)
	private void logout() {
	System.out.println("logout");
	}

	@Test(priority = -3)
	private void browserclose() {
	System.out.println("browserclose");
}


}
