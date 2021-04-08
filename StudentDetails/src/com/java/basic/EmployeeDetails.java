package com.java.basic;

public class EmployeeDetails {

	public void employee(int id) {
		System.out.println("Emp id is: " + id);
	}
	
	public void employee( String name, String grade) {
		System.out.println("Emp Details is : " + name + " and grade is : " + grade);		
	}
	
	public void employee( String name) {
		System.out.println("Emp Details is : " + name);		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        EmployeeDetails emp = new EmployeeDetails(); //OBJECT CREATION FOR A CLASS
        
        emp.employee(23456);
       emp.employee("Priya");
        emp.employee("Vinay", "B");
	}

}
