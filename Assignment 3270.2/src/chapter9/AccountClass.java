package chapter9;

import java.util.Date;

public class AccountClass {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public AccountClass() {
		this.id=0;
		this.balance=0;
		this.annualInterestRate=0;
		this.dateCreated= new Date();
	}
	public AccountClass(int id, double balance) {
		this();
		this.id=id;
		this.balance=balance;
	}
	
	public AccountClass(int id, double balance, double annualInterestRate) {
		this();
		this.id=id;
		this.balance=balance;
		this.annualInterestRate=annualInterestRate;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public String getDateCreated() {
		return dateCreated.toString();
	}

	public double getMonthlyInterest() {
		return balance*((annualInterestRate/100)/12);
	}
	public void withdraw(double withdraw) {
		this.balance -= withdraw;
	}
	
	public void deposit(double deposit) {
		this.balance+= deposit;
	}
	
	@Override
	public String toString() {
		return "Account ID:"+ this.getId() + "\nBalance: "+ this.getBalance();
	}

}
