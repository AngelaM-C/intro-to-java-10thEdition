package chapter4;
import java.util.Scanner;
public class ASCIICode {
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter an ASCII code:");
		int code = input.nextInt();
		
		if (code < 0 || code > 127) {
			System.out.println("Sorry that was an invalid input.");
			return;
	}
		
		char letter = (char)code;
		
		System.out.printf("The character for ASCII code %d is %c. ", code, letter);
		
		
}
}