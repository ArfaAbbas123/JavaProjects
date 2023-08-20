package com.userapp.service;

import com.userapp.exception.NameExistsException;

import com.userapp.exception.TwoLongException;
import com.userapp.exception.TwoShortException;

public class ValidateServiceImpl implements IValidationService {

	@Override
	public boolean validateUsername(String username) throws NameExistsException {
		// TODO Auto-generated method stub
		String [] usernames = {"Arfa","Abbas","Farhan"};
		for(String name:usernames) {
			if(name.equalsIgnoreCase(username)) {
				throw new NameExistsException("Name already exists");
			}
		}
		
		return true;
	}

	@Override
	public boolean validatePassword(String password) throws TwoLongException, TwoShortException {
		// TODO Auto-generated method stub
		int[]
		
		return false;
	}

}
