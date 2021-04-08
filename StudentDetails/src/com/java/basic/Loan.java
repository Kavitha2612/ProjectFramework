package com.java.basic;


public class Loan implements Hdfc {
	public void carloan() {
		System.out.println("12%");
	}
	public void bikeloan() {
		System.out.println("8%");
	}

public static void main(String[] args) {
	Loan l=new Loan();
	l.carloan();
	l.bikeloan();
	}

}
