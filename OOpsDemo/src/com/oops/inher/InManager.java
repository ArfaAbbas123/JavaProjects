package com.oops.inher;

public class InManager extends InEmployee {
	
	double salary ;
	public InManager(String name, int EmployeeId, double salary) {
	super(name,EmployeeId );
	salary=this.salary;
	}
	void printbonus(double amount) {
		System.out.println(salary+amount);
	}
	
}
