package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class RunnerClass {

	public static void main(String[] args) {

		ArrayList<Employee> emp = new ArrayList<Employee>();

		emp.add((new Employee("Aniket", 123, 534000)));
		emp.add((new Employee("Rupesh", 24, 4000)));
		emp.add((new Employee("Shivraj", 13, 45000)));
		emp.add((new Employee("Om", 27, 45780)));
		
		System.out.println(emp);
		Collections.sort(emp);
		System.out.println(emp);
		
		Collections.sort(emp, new empNameComparator());
		System.out.println(emp);
	

	}

}
