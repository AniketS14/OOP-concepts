package com.polymorphism;

public class Calculation {

	private int number1 = 5;
	private int number2 = 10;

	void add() {
		System.out.println(number1 + number2);
	}

	int add(int number1, int number2) {
		return number1 + number2;

	}
	
	float add(float number1,float number2) {
		return number1+number2;
		
	}
	
   double add(int a, int b,int c) {
	   return a+b+c;
   }
	

}
