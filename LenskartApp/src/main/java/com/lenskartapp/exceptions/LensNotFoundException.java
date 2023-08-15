package com.lenskartapp.exceptions;

public class LensNotFoundException extends RuntimeException {

	public LensNotFoundException() {
		super();
	}

	public LensNotFoundException(String message) {
		super(message);
	}
	
}
