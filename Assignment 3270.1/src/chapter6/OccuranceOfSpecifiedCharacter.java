package chapter6;
import java.util.Scanner;
public class OccuranceOfSpecifiedCharacter {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String user= input.nextLine();
		
		System.out.println("Enter a character:");
		char letter= input.nextLine().charAt(0);
		
		System.out.println("Count is: "+ count(user,letter));
	}
	
	public static int count(String str, char a) {
		int count=0;
		for(int i =0; i< str.length(); i++ ) {
			if(Character.toUpperCase(str.charAt(i))== Character.toUpperCase(a))
				count++;
		}
		return count;
	}
}