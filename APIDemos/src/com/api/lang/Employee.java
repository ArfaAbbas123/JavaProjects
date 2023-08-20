package com.api.lang;

//This program is performed by first creating this Class employee... 
//then the constructors were called, 
//then the getter and setters from source Were called 
//and also GENERATE TO STRING() WAS CALLED
///the main class was created and employee was called

public class Employee {        //domain model, java bin is a pub;ic class with private methods and piblic getter and sertter
	private String employeeName;
	private Integer employeeId;
	private double salary;
	
	public Employee(String employeeName, Integer employeeId, double salary) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.salary = salary;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", salary=" + salary + "]";
	}
	
	

	//setter methods:
	           //set does not return , setter method a;lways takes parameter
}
