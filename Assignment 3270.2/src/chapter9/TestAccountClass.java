package chapter9;

public class TestAccountClass {

	public static void main(String[] args) {
		AccountClass a1= new AccountClass(1122, 20000.0, 4.5);
		
		a1.withdraw(2500);
		a1.deposit(3000);
		
		System.out.println("Balance:" + a1.getBalance());
		System.out.println("Monthly Interest:" + a1.getMonthlyInterest());
		System.out.println("Date of creation:" + a1.getDateCreated());
	}

}
