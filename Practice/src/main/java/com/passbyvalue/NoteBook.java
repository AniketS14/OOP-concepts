package com.passbyvalue;

public class NoteBook {

	 int bookValue=300;
	 double noOfPages=4000;

	public int getBookValue() {
		return bookValue;
	}

	public void setBookValue(int bookValue) {
		this.bookValue = bookValue;
	}

	public double getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(double noOfPages) {
		this.noOfPages = noOfPages;
	}

	void displayInfo(int value, double pages) {
		value=value+10;
		pages=pages+10;
		System.out.println("Inside the Method...");
	   System.out.println("book value :" + value);
	   System.out.println(" no of pages :" + pages);
	}
	
	void increaseBookValue(NoteBook n2) {
		n2.bookValue+=10;
		System.out.println("Inside the Method...");
		System.out.println("increase value is :"+ n2.bookValue);
	}

}
