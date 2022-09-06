package com.inheritance;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee(100, "Aniket", 40000);

		System.out.println(e1.getEmpName());
		e1.infoOfEmp();

		Manager m1 = new Manager(101, "Harshal", 50000);
		m1.setProjectId(201);
		System.out.println(m1.getEmpName());

		System.out.println(m1.getProjectId());
		m1.infoOfEmp();
		
		System.out.println(e1.salaryIncrement(2000));
		System.out.println(m1.salaryIncrement(2000));
	}

}
