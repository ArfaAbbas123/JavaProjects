package com.voteraopp.service;

import com.voterapp.exception.InValidVoterException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIdException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothImpl implements IElectionBooth{
	
	String[] localism = {"Assam","Beduoalli","Kachiguda","Kunnur","Mahaballishwar"};

	@Override
	public boolean checkEligibility(int age, String locality, int voterId) throws InValidVoterException {
		// TODO Auto-generated method stub
		try {
			if(checkAge(age) && checkLocality(locality) && checkVoterId(voterId))
				return true;
		}catch (UnderAgeException e) {
			System.out.println(e.getMessage());
		}catch(LocalityNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (NoVoterIdException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	private boolean checkAge(int age) throws UnderAgeException{
		if(age<18) {
			throw new UnderAgeException("Under Age");
		}
		return false;
	}
	private boolean checkLocality(String lo) throws LocalityNotFoundException {
		boolean check = true;
		for(String locality:localism) {
			if(locality.equals(lo)) {
				check=false;
			}
		}
		if(check)
			throw new LocalityNotFoundException("Locality Not Found");
		return true;
	}

	private boolean checkVoterId(int voterId) throws NoVoterIdException {
		if(voterId<1000 || voterId>9999) {
			throw new NoVoterIdException("VoterId does not exist");
		}
		
		return true;
	}

	
		

}
