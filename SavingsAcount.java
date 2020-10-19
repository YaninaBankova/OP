package edu.smg;

public class SavingsAcount {
	public String name;
	public double balance;
	public double interestRate = 0.01;
	
	public void deposit(double sumToDeposit){
		balance += sumToDeposit;
	}
	
	public void withdraw(double sumToWithdraw){
		if(sumToWithdraw < 0 || balance < sumToWithdraw){
			System.out.println("Error");
			return;
		}
		balance -= sumToWithdraw;
		System.out.println("Successful withdraw! The balance is now "+ balance);
	}
}
