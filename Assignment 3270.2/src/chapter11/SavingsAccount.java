package chapter11;
import chapter9.AccountClass;
public class SavingsAccount extends AccountClass{
	private String OverDrawn;
	
	public SavingsAccount(int id, double balance, double annualInterestRate) {
		super(id, balance, annualInterestRate);
		OverDrawn="Account cannot be overdrawn.";
	}


	public SavingsAccount(int id, double balance) {
		super(id, balance);
		OverDrawn="Account cannot be overdrawn.";
	}

	
	
	public SavingsAccount() {
		OverDrawn="Account cannot be overdrawn.";
	}
	
	
	public void withdraw(double withdraw) {
		if(withdraw< this.getBalance())
		this.setBalance(this.getBalance()-withdraw);
	}
	
	@Override
	public String toString() {
		return "Account ID:"+ this.getId() + "\nBalance: "+ this.getBalance()+"\nOverdraft Limit: "+ this.getOverDrawn();
	}

	public String getOverDrawn() {
		return OverDrawn;
	}
	
	
}
