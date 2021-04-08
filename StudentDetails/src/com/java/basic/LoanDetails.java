package com.java.basic;

public class LoanDetails extends Bank {

	@Override
	public void perloan() {
		System.out.println("15%");	
	}

	public static void main(String[] args) {
	LoanDetails ld = new LoanDetails();
ld.homeloan();	
ld.eduloan();	
ld.perloan();
}

}
