package com.oops.abs;

public class AbsMain {
	public static void main(String[] args) {
		Bank bank = new Branch1();        //bank is abstract class so call an object from class that is not abstract(Branch1)
		bank.admin();
		bank.carLoan();
		bank.eduLoan();
		
		Branch1 branch1 =(Branch1) bank;  //downcaasting
		branch1.staffDetails();
		branch1.carLoan();
		branch1.eduLoan();
		branch1.housingLoan();
		branch1.admin();
		
		
		Branch2 branch2 = new SubBranch();
		branch2.loanType();
		branch2.admin();
		branch2.carLoan();
		branch2.eduLoan();
		branch2.housingLoan();
		
		SubBranch subbranch = (SubBranch)branch2;
		subbranch.subPay();
		subbranch.loanType();
		
	
	}

}
