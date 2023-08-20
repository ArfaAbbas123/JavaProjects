package com.arfa.basics;

public class SmallestArr {

	public static void main(String[] args) {
		int []marks = new int[] {67,79,75,94,24,17,19,89};
		int small= marks[0];
		
		for(int num:marks) {
			if(num<small) {
				small=num;
			}
		}
		System.out.println("The smallest num is" + small);

	}

}
