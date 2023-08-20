package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TwoLongException;
import com.userapp.exception.TwoShortException;

public interface IValidationService {
	boolean validateUsername(String username) throws NameExistsException;
	boolean validatePassword(String password) throws TwoLongException, TwoShortException;

}
