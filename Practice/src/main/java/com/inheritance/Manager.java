package com.inheritance;

public class Manager extends Employee {

	private int projectId;
	private String projectName;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	Manager(int empId, String empName, float empSalary) {
		super(empId, empName, empSalary);
		// TODO Auto-generated constructor stub
	}

   //  void changeProjectName(String newProjectName) {
  //  	 projectName=newProjectName;
  //  	 System.out.println(projectName);
  //   }
	
	
	String changeProjectName(String newProjectName) {
		projectName=newProjectName;
		return projectName;

	
}
	
}