package com.voteraopp.service;

import com.voterapp.exception.InValidVoterException;

public interface IElectionBooth {
	
	boolean checkEligibility(int age, String lo, int voterId) throws InValidVoterException;

}
