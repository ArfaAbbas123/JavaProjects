package com.employeeapp.model.copy;

public class Employee {
	 String name;	
	 String city;
	Integer employeeId;
	double salary;
	 String language;	
	 String hobbies;
	 

	public Employee(String name, String city, int employeeId, double salary, String language, String hobbies) {
		super();
		this.name = name;
		this.city = city;
		this.employeeId = employeeId;
		this.salary = salary;
		this.language = language;
		this.hobbies = hobbies;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
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


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	public String getHobbies() {
		return hobbies;
	}


	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	

}
