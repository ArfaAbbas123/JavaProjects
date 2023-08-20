package com.api.lang;

public class EmpMain {
	
	public static void main(String[] args) {
		Employee employee= new Employee("arfa",101,35789090);
		System.out.println(employee);
		
		
		
		int x=10;
		long y=x;    //upcaSTINGG
		Long a=y;    //AUTOBOXING
		
		int b=(int)y;  //downcast
		//convert to object
		Object o =a;   //this is a type of long
		
//		//trying to downcast qill thrrough classcastexception
//		Integer i = (Integer)o; //exception
		
		StringBuffer s1 = new StringBuffer("Hello");
		System.out.println(s1.length());
	}

}
