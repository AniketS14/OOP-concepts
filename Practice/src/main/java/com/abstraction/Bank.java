package com.abstraction;

public abstract class Bank {

	private int intrest;
	private double loanAmount;

	public int getIntrest() {
		return intrest;
	}

	public void setIntrest(int intrest) {
		this.intrest = intrest;
	}

	private double getLoanAmount() {
		return loanAmount;
	}

	private void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
    
	abstract void calculate(double loanAmount);

	void displayLoan(double l) {
		setLoanAmount(l);
		System.out.println(getLoanAmount());
	}

}
