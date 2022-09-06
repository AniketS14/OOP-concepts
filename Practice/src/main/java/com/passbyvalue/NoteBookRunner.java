package com.passbyvalue;

public class NoteBookRunner {

	public static void main(String[] args) {

		// int x = 100;
		// int y = 240;

		NoteBook n1 = new NoteBook();
		System.out.println("pass by value...");
		System.out.println("Before Calling : " + n1.getBookValue() + " " + n1.getNoOfPages());
		n1.displayInfo(n1.bookValue, n1.noOfPages);
		System.out.println("After calling : " + n1.getBookValue() + " " + n1.getNoOfPages());

		System.out.println("pass by refrence...");
		n1.increaseBookValue(n1);

		System.out.println("After calling  :" + n1.getBookValue());

	}

}
