package chapter2;
import java.util.Scanner;
public class SumTheDigitsInAnInteger {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);
		
		int num;
		int digit=0;
		int sum=0;
		
		System.out.println("Enter an integer between 0 and 1000:");
		
		num= input.nextInt();
		
		if(num>1000) {
			System.out.println("Sorry but that is an invalid input.");
			
			return;
		}
		
		while(num>0) {
			digit= num%10;
			num= num/10;
			sum += digit;
		}
		
		System.out.println("The sum of the digits is: "+ sum);
		
		
		
	}
}
