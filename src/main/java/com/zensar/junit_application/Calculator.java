package com.zensar.junit_application;

public class Calculator {
	
	public int add(int a,int b) {
		return a + b;
	}
	
	
	public int sub(int a,int b) {
		return a - b;
	}
	
	
	public int division(int a,int b) {
		if(b==0) throw new ArithmeticException("Cannot divide by Zero");
		return a/b;
	}
	
	
	

}
