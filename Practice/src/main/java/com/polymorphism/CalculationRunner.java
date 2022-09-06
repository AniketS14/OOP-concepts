package com.polymorphism;

public class CalculationRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  Calculation c=new Calculation();
	  c.add();
	  System.out.println(c.add(25,30));
	  System.out.println(c.add(25.5f,30.8f));
	  
	  OverRiding c2= new OverRiding();
	  System.out.println(c2.add(67,33));
	  
	  
	
	}

}
