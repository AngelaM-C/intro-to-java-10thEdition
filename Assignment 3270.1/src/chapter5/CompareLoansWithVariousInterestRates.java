package chapter5;
import java.util.Scanner;
public class CompareLoansWithVariousInterestRates {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter loan amount:");
		double pv = input.nextDouble();
		
		System.out.println("Enter Number of Years:");
		double periods= input.nextDouble()* 12;
		
		double rate=.05;
		double payment=0;
		double sum= 0;
		
		System.out.printf("%-16s %-16s %-16s\n", "Interest Rate" , "Monthly Payment" , "Total Payment");
		while(rate<=.08) {
			
			payment=(pv*(rate/12))/(1-Math.pow((1+(rate/12)) ,-periods));
			
			sum=payment*periods;
			
			System.out.printf("%-16.3f %-16.2f %-16.2f\n", (rate*100),payment, sum );
			
			rate += .00125;
			
		
		}
		
		
		
		
	}
}
