package chapter4;
import java.util.Scanner;
public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter a letter:");
		String user= input.next();
		
		char letter= Character.toUpperCase(user.charAt(0));
		
		if(!Character.isLetter(letter)) {
		System.out.println(letter +" is invalid input.");
		return;
		}
		
		if(letter == 'A'|| letter == 'E'|| letter == 'I'||letter =='O'|| letter=='U') {
			System.out.println(letter + " is a vowel.");
		}else {
			System.out.println(letter + " is a consonant.");
	}
		
	}
}
