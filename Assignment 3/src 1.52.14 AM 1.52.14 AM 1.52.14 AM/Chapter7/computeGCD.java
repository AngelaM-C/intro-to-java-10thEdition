package Chapter7;
import java.util.Scanner;
public class computeGCD {
	public static void main(String[]args) {
		
		Scanner input= new Scanner(System.in);
		int[] list= new int[5];
		System.out.println("Enter 5 numbers:");
		
		for(int i=0; i< list.length; i++) {
			list[i]= input.nextInt();
		}
		
		System.out.println("The GCD is " + gcd(list));

	}
	
	
	
public static int gcd(int... numbers) {
	int gcd=1;
	int min=numbers[0];
	int count=0;
	
	for(int i=0 ; i< numbers.length ; i++) {
		if (numbers[i]< min) 
			min= numbers[i];
	}
	for(int k =2 ; k <= min; k++)
		for( int i =0 ; i < numbers.length ; i++) {
			if(numbers[i] % k == 0) {
				count++;
				if (count == numbers.length)
					gcd=k;
			}
			else { 
				count=0;
			}
	}
	
	return gcd;
	
}
}
