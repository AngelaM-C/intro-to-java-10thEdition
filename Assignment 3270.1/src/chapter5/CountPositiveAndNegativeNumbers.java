package chapter5;
import java.util.Scanner;
public class CountPositiveAndNegativeNumbers {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);
		double sum=0;
		int count=0;
		int pos =0;
		int neg=0;
		
		System.out.println("Enter an integer, the input ends if it is 0:");
		
		int user= input.nextInt();
		
		if(user==0) {
			System.out.println("No numbers are entered except 0.");
			return;
		}
		
		while(user!=0) {
			sum+=user;
			count++;
			
			if(user>0)
				pos++;
			if(user<0)
				neg++;
			user=input.nextInt();
		}
		
		System.out.println("The numer of positives is: "+ pos);
		System.out.println("The numer of negatives is: "+ neg);
		System.out.println("The total is: "+ sum);
		System.out.println("The average is: "+ sum/count);
		
	}
}
