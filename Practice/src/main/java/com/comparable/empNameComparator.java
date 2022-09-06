package com.comparable;

import java.util.Comparator;

public class empNameComparator implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {
			 
		return o1.getEmpName().compareTo(o2.getEmpName());
	}

}
