package com.java.basic;

public class Student {
public static void main(String[] args) {
	int a[] = new int[5];
	a[0] = 10;
	a[1] = 20;
	a[2] = 30;
	a[3] = 40;
	a[4] = 50;
	a[4] = 60;
	
	System.out.println(a[4]);
	
	int len = a.length;
	System.out.println(len);
	
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
		
	}	
}

}
