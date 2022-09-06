package com.comparable;

public class Employee implements Comparable<Employee> {
	private String empName;
	private int empID;
	private double salary;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(String empName, int empID, double salary) {
		super();
		this.empName = empName;
		this.empID = empID;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empID=" + empID + ", salary=" + salary + "]";
	}

	public int compareTo(Employee o) {

		if (this.getSalary() > o.getSalary())
			return 11;
		else
			return -1;
	}

}
