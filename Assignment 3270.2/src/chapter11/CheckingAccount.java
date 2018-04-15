package chapter11;
import chapter9.AccountClass;
public class CheckingAccount extends AccountClass {
	private int overDraftLimit;
	
	public CheckingAccount() {
		super();
		this.overDraftLimit = 0;
	}


	public CheckingAccount(int id, double balance, double annualInterestRate,int overDraftLimit) {
		super(id, balance, annualInterestRate);
		this.overDraftLimit = overDraftLimit;
	}


	public CheckingAccount(int id, double balance,int overDraftLimit) {
		super(id, balance);
		this.overDraftLimit = overDraftLimit;
	}


	public CheckingAccount(int overDraftLimit) {
		super();
		this.overDraftLimit = overDraftLimit;
	}
	
	
	
	public void withdraw(double withdraw) {
		if(withdraw < this.getBalance()+ this.overDraftLimit)
		this.setBalance(this.getBalance()-withdraw);
	}
	
	public int getOverDraftLimit() {
		return overDraftLimit;
	} 
	@Override
	public String toString() {
		return "Account ID:"+ this.getId() + "\nBalance: "+ this.getBalance()+"\nOverdraft Limit: "+ this.getOverDraftLimit();
	}



}
