package com.testng.org;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	
	@Test(dataProvider = "testData")
	private void credential(String username, String password) {
	
		System.out.println("Username = "+username+" Password = "+password);
		
	}
	@DataProvider

	private Object[][] testData() {
	
	return new Object[][] { {"jaga" , "123"},
							{"kavi" , "134"}, 
							{ "prathy", "677"},
							{"haashu" , "ui8"}
		
		
		
		
	};
		

}}
