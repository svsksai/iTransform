package com.cg.poly3;

public class BankAccount {
    String name;
    double balance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public BankAccount(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}

    
}