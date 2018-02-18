package chapter5;
import java.util.Scanner;
public class OccuranceOfMaxNumbers {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter numbers (input stops when 0 is entered):");
		
		int max=0;
		int count=0;
		int num= input.nextInt();
		
		if(num==0) {
			System.out.println("No number other than 0 was entered.");
			return;
		}
		
		while(num!=0) {
			if(num==max)
				count++;
			if(num>max) {
				max= num;
				count=1;
			}	
			
			num=input.nextInt();
		}
		
		System.out.printf("The greatest number is %d and it occures %d times.", max, count);
		
	}	

}
