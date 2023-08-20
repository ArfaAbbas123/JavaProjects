package com.oops.abs;

public abstract class Bank {
	
	abstract void carLoan();
	abstract void housingLoan();
	abstract void eduLoan();
	final void admin() {
		System.out.println("Admin Datails of bank");
	}

}
