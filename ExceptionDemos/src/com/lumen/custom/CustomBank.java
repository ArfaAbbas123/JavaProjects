package com.lumen.custom;

public class CustomBank {
	double balance;

	public CustomBank(double balance) {
		super();
		this.balance = balance;
	}


	void withdraw(double amount) throws ExceedingLimitException, NegativeBalanceException {
		System.out.println("In Withdrawn Method");
		
		///balance is negative throw NegativebalExcep
		if(balance-amount<=0)
			throw new NegativeBalanceException("Balance is negative");
		//amount>1000 ExceedingException
		if(amount>1000) {
			throw new ExceedingLimitException("Limit Exceeded");
		}
		
		//if all is good
		balance= balance-amount;
		System.out.println("Balanve "+balance);
		
		
	}

}
