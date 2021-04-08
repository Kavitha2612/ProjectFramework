package com.testng.org;

import org.testng.annotations.Test;

public class GroupingTest {
	
	@Test(groups = "Company Details")
	private void empName() {
	System.out.println("kavi");
	}
	@Test(groups = "Company Details")
	
	private void empId() {
	System.out.println("456657");
	}
	@Test(groups = "Personal Details")
	
	private void empSalary() {
	System.out.println("14LPA");
	}
	
	@Test(groups = "Personal Details")
	
	private void empNumber() {
	System.out.println("9087654321");
	}
	
	@Test(groups = "Bank Details")
	
	private void empIFSC() {
	System.out.println("IOB121234");
	}
	
	@Test(groups = "Bank Details")
	
	private void empAccountNumber() {
	System.out.println("1234567890987654");
	}
}
