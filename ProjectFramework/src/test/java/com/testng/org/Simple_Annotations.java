package com.testng.org;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {
	
	@BeforeSuite
	private void setUp() {
		
		System.out.println("Goole Chrome");
	}
	
	@BeforeTest
	private void browserLaunch() {
		
		System.out.println("Browser Launch");
	}
	
	@BeforeClass
	private void url() {
		
		System.out.println("url");
	}
	
	@BeforeMethod
	private void login() {
		
		System.out.println("Login");
	}
	
	@Test
	private void searchLaptop() {
		
		System.out.println("searchLaptop");
	}
	
	@Test
	private void searchMobile() {
		
		System.out.println("searchMobile");
	}
	
	@AfterMethod
	private void logout() {
		
		System.out.println("logout");
	}
	
	@AfterClass
	private void verification() {
		
		System.out.println("verification");
	}
	
	@AfterTest
	private void browserClose() {
		
		System.out.println("browserClose");
	}
	
	@AfterSuite
	private void deleteCookies() {
		
		System.out.println("deleteCookies");
	}

}
