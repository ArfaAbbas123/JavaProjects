package com.arfa.basics;

public class Factorial {
	public static void main(String[] args) {
		int number=5;
		int factorial=1;
		int i = number;
		while(i>=1) {
			factorial=factorial*i;
			i--;
		}
		System.out.println("Factorial: "+factorial);
	}

}
//[n=n*(n-1)*(n-2)*(n-3);]
