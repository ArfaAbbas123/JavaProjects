package com.opps.basic;

public class Employee {
	String empName;
	int empId;
	double salary;
	
	Employee(String empName,int empId, double salary){
		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
	}
/*	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println(employee.empName); //null
		System.out.println(employee.empId); 
		System.out.println(employee.salary);
		employee.empName = "Arfa";
		employee.empId = 101;
		employee.salary = 2000;
		
		
		System.out.println("Employee name:" +employee.empName);
		System.out.println("Employee Id:" +employee.empId);
		System.out.println("Employee Salary:" +employee.salary);
		
		//create 2nd employee object
		Employee employee1 = new Employee();
		employee1.empName = "Ammm";
		employee1.empId = 201;
		employee1.salary = 3000;
		
		System.out.println("Employee1 name:" +employee1.empName);
		System.out.println("Employee1 Id:" +employee1.empId);
		System.out.println("Employee1 Salary:" +employee1.salary);
		
		Employee employee2 = employee;
		System.out.println("Employee2 name:" +employee2.empName);
		employee2.empName = "Raj";
		System.out.println("Employee2 name:" +employee2.empName);
		System.out.println("Employee name:" +employee.empName);		
	
		
		//make employee null
		employee=null;
		System.out.println("Employee2 name:" +employee2.empName);
		System.out.println("Employee name:" +employee.empName);
		}
	}	
*/
		
	void printDetails() {
		System.out.println("Employee Name"+this.empName);
		System.out.println("Employee Id"+ this.empId);
		System.out.println("Employee Salary:" + this.salary);
	}
	public String greet(String msg) {
		return msg+empName;
	}
}
	


