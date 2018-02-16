package chapter3;
import java.util.Scanner;
public class FindFutureDates {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);
		
	System.out.println("Enter today's day:");
	int day= input.nextInt();
	int future = 0; 
	
	System.out.println("Enter the number of days elapsed:");
	int num = input.nextInt();
	
	future = num%7 + day;
	
	String today="";
	String fday="";
	
	switch(day) {
	case 0: today= "Sunday";
	break;
	case 1: today= "Monday";
	break;
	case 2: today= "Tuesday";
	break;
	case 3: today= "Wednesday";
	break;
	case 4: today= "Thursday";
	break;
	case 5: today= "Friday";
	break;
	case 6: today= "Saturday";
	
	
	}
	switch(future) {
	case 0: fday= "Sunday";
	break;
	case 1: fday= "Monday";
	break;
	case 2: fday= "Tuesday";
	break;
	case 3: fday= "Wednesday";
	break;
	case 4: fday= "Thursday";
	break;
	case 5: fday= "Friday";
	break;
	case 6:fday= "Saturday";
	
	}
	
	
	System.out.println("Today is " + today+ " and the future day is "+ fday+".");
	
	
	}
}
