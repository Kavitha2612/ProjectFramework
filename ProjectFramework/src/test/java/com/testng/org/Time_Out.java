package com.testng.org;

import org.testng.annotations.Test;

public class Time_Out {
	@Test
	private void browserlaunch() {
	System.out.println("browserlaunch");
	}
	
	@Test(timeOut = 3000)
	private void login() throws InterruptedException {
	//	Thread.sleep(5000);
		System.out.println("login");
	}
	
	@Test
	private void searchlaptop() {
	System.out.println("searchlaptop");
	}
	
	@Test
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
