package com.voterapp.main;

import java.util.Scanner;

import com.voteraopp.service.ElectionBoothImpl;
import com.voterapp.exception.InValidVoterException;

public class VoterMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age");
		int age=scanner.nextInt();
		System.out.println("Enter your Locality");
		String locality=scanner.next();
		System.out.println("Enter your Voter ID");
		int voterId = scanner.nextInt();
		
		ElectionBoothImpl electionBoothImpl = new ElectionBoothImpl();
		try {
			if(electionBoothImpl.checkEligibility(age, locality, voterId))
				System.out.println("You are eligible to vote");
		}catch(InValidVoterException e) {
			System.out.println(e.getMessage());
		}
		}

}
