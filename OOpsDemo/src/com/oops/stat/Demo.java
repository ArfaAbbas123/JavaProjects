package com.oops.stat;

//public class Demo {
//	
//	static {
//		System.out.println("Staic block in demo");
//	}
//	public static void main(String[] args) {
//		System.out.println("main demo");
//		//call using class name
//		Trial.getMessage();  //by default executes the static blocks of trials
//		Trial.getMessage();  //only once the entire tstaic all will be executed, the second time u call it wont do all only with its will be done
//		System.out.println("Sum" +(Trial.x+Trial.y));
//		
//	}
//	}

import static java.lang.Integer.parseInt;
import static com.oops.stat.Trial.*;

public class Demo{
	static {
		System.out.println("Static block in Demo");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Demo");
		getMessage();
		int x=90; int y=70;
		System.out.println("Sum" +(x+y));
		
		//using static import
		int n = parseInt("100");
		System.out.println(n);
		
	}
}

