package com.abstraction;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b1=new SBI();
	//	b1.setIntrest(10);
		b1.calculate(100000);
	//	b1.displayLoan(200000);
		
		Bank b2=new ICICI();
	//	b2.setIntrest(7);
		b2.calculate(100000);
	//	b2.displayLoan(122300);
		
	}

}
