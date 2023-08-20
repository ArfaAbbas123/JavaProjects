package com.oops.abs;

public class SubBranch extends Branch2{

	@Override
	void carLoan() {
		// TODO Auto-generated method stub
		System.out.println("car loan in sub branch");
		
	}
	
	@Override
	void eduLoan() {
		// TODO Auto-generated method stub
		System.out.println("edu loan in sub branch");
		super.eduLoan();
	}

	void subPay() {
		System.out.println("Payment in subbranch");
	}
	
	

}
