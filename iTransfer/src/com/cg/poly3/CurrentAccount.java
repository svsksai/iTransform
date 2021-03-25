package com.cg.poly3;

public class CurrentAccount extends BankAccount {
	double cashcredit;
	public CurrentAccount(String name, double balance) {
		super(name, balance);
		
	}

	public double getBalance(){
		return balance-cashcredit;
		
	}
	

	
	
	
	
	
	

}