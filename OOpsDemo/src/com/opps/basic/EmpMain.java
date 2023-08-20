package com.opps.basic;

public class EmpMain {
	public static void main(String[] args) {
		Employee employee = new Employee("Arsh", 12, 2000.0);
		//System.out.println(employee.empName); //null
		//System.out.println(employee.empId); 
		//System.out.println(employee.salary);
		employee.empName = "Arfa";
		employee.empId = 101;
		employee.salary = 2000;
		
		employee.printDetails();
		String result = employee.greet("Great day ");
		System.out.println(result);
		
		//System.out.println("Employee name:" +employee.empName);
		//System.out.println("Employee Id:" +employee.empId);
		//System.out.println("Employee Salary:" +employee.salary);
		
		//create 2nd employee object
		Employee employee1 = new Employee("Abc", 301, 4000);
		employee1.empName = "Ammm";
		employee1.empId = 201;
		employee1.salary = 3000;
		
		System.out.println("Employee1 name:" +employee1.empName);
		System.out.println("Employee1 Id:" +employee1.empId);
		System.out.println("Employee1 Salary:" +employee1.salary);
		employee1.printDetails();
		System.out.println(employee1.greet("Doodle "));
/*		Employee employee2 = employee;
		System.out.println("Employee2 name:" +employee2.empName);
		employee2.empName = "Raj";
		System.out.println("Employee2 name:" +employee2.empName);
		System.out.println("Employee name:" +employee.empName);		
	
		
		//make employee null
		employee=null;
		System.out.println("Employee2 name:" +employee2.empName);
		System.out.println("Employee name:" +employee.empName);
*/		}
	}
	


