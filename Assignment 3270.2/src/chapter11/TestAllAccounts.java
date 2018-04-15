package chapter11;
import chapter9.AccountClass;
public class TestAllAccounts {

	public static void main(String[] args) {
		AccountClass a1= new AccountClass(0,100);
		CheckingAccount a2= new CheckingAccount(1,300,4.5,10);
		SavingsAccount a3= new SavingsAccount(2,300.0,4.5);
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());

	}

}
