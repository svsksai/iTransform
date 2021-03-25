package com.cg.poly3;

public class SavingsAccount extends BankAccount {

	double fixeddeposit;
	public SavingsAccount(String name, double balance) {
		super(name, balance);
		
	}
	public double getBalance(){
		return balance+fixeddeposit;
		
	}

}






