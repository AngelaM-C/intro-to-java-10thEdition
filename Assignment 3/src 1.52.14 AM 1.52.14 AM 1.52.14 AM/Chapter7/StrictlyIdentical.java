package Chapter7;
import java.util.Scanner;
public class StrictlyIdentical {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		int num1;
		int num2;
		System.out.println("Enter the number of elements in list1:");
		num1= input.nextInt();
			
		int[] list1 = new int[num1];
		
		System.out.println("Enter the number of elements in list2:");
		num2= input.nextInt();
			
		int[] list2 = new int[num2];
		
		
		
		System.out.println("Enter " + num1 + " values for list1:");
		
		for(int i = 0; i< list1.length; i++) {
			list1[i]=input.nextInt();
		}
		
		System.out.println("Enter " + num2 + " values for list2:");
		
		for(int i = 0; i< list2.length; i++) {
			list2[i]=input.nextInt();
		}
		
		if (num1 != num2)
			System.out.println("The two lists are not strictly identical. They do not have the same number of elements.");
		else if (equals(list1, list2))
			System.out.println("The two lists are strictly identical.");
		else 
			System.out.println("The two lists are NOT strictly identical.");
		
	
	}
	
	
	public static  boolean equals(int[]list1, int list2[]) {
		
		for(int i=0 ; i < list1.length; i++) {
			if(list1[i] != list2[i])
			return false;
		}
		return true;
	}
	
	
}
