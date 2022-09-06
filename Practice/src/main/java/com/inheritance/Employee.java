package com.inheritance;

public class Employee {

	private int empId;
	private String empName;
	private float empSalary;

	Employee(int empId, String empName, float empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmmId() {
		return empId;
	}

	public void setEmmId(int emmId) {
		this.empId = emmId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	public void infoOfEmp() {
		System.out.println(empId + " " + empName + " " + empSalary);
	}

	float salaryIncrement(float add) {
		empSalary = empSalary + add;
		return empSalary;

	}

}
