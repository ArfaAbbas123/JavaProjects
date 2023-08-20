package com.arfa.basics;

public class GreaterArr {
	public static void main(String[] args) {
		int []marks = new int[] {67,79,75,94,24,17,19,89};
		int great = 0;
		
		for(int num:marks) {
			if(num>great) {
				great=num;
			}
				
		}
		System.out.println("The greatest num in the array is" +great);
	}

}
