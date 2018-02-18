package chapter6;
import java.util.Scanner;
public class CheckPassword {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter password:");
		
		System.out.println(checkPassword(input.nextLine()));

	}
	public static String checkPassword(String user) {
		int digitCount=0;
		
		if(user.length()<8) {
			return "Invalid password";
		}
			
		for(int i =0; i<user.length(); i++) {
			if(!Character.isDigit(user.charAt(i)) && !Character.isLetter(user.charAt(i))){
				return "Invalid password";
			}
			
			if(Character.isDigit(user.charAt(i)))
				digitCount++;
	}
		if(digitCount>=2)
			return "Valid Password";
		
		return "Invalid Password";
		
	}	
}
