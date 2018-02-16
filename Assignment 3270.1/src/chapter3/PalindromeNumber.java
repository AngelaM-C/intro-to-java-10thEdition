package chapter3;
import java.util.Scanner;
public class PalindromeNumber {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter a three digit integer:");
		
		int num= input.nextInt();
		int temp= num;
		
	
		int digit1= num%10;
		num= num/10;
		int digit2= num%10;
		num= num/10;
		int digit3 =num;
		
		if(digit1 == digit3) {
			System.out.println(temp + " is a palindrome. ");
		} else {
			System.out.println( temp + " is not a plaindrome.");
		}
		
		
		
		
	}
}
