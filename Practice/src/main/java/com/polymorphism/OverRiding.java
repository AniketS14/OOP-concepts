package com.polymorphism;

public class OverRiding extends Calculation {
	
	int add(int number1, int number2) {
		System.out.println(" overriding the add function");
		return number1+number2;
	}

}
