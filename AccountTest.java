package edu.smg;

public class AccountTest {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.setId(1122);
		acc.setBalance(20_000);
		Account.setYearInterestRate(4.5);
		acc.withdraw(2500);
		acc.deposit(3000);
		
		System.out.println("Balance: " + acc.getBalance() + "\nMonthly interest: " + acc.getMonthlyInterest() + 
				"\nDate: " + acc.getDateCreated());
	}
}
