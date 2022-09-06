package com.abstraction;

public class ICICI extends Bank {
	@Override
	void calculate( double loanAmount) {
		setIntrest(4);
		System.out.println("intrest :  " +loanAmount*getIntrest());
	     
		
	}
	
	
	
}
