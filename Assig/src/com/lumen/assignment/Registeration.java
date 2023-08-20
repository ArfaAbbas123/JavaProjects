package com.lumen.assignment;

import java.util.Scanner;

public class Registeration {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		String []usernames = new String[]{"Barbie","Mission","Orphie"};
		Scanner scanner = new Scanner(System.in);
		int flag=1;
		System.out.println("Enter name:" );
		String user = scanner.nextLine();
		
		for(String username:usernames) {
			if(username.equalsIgnoreCase(user)) {
				System.out.println("not unique");
				flag=0;
				break;
			}
		}
		if(flag==1) {
			System.out.println("ur name is registered");
		}
	}
	
}
