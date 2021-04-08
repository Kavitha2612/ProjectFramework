package com.testng.org;

import org.testng.annotations.*;

public class Simple_AnnotationsTest {

  @BeforeSuite
  public void setUp() {
    System.out.println("setUp");
  }

  @BeforeTest
  public void browserLaunch() {
	    System.out.println("Google Chrome");
  }

  @BeforeClass
  public void url() {
	    System.out.println("url");
  }

  @BeforeMethod
  public void login() {
	    System.out.println("login");
  }

  @Test
  public void searchLaptop() {
	    System.out.println("searchLaptop");
  }

  @Test
  public void searchMobile() {
	    System.out.println("searchMobile");
  }

  @AfterMethod
  public void logout() {
	    System.out.println("logout");
}

  
  @AfterClass
  public void verification() {
	    System.out.println("verification");
  }

  @AfterTest
  public void browserClose() {
	    System.out.println("browserClose");
  }

  @AfterSuite
  public void deleteCookies() {
	    System.out.println("Cookies Delete");
  }

}
