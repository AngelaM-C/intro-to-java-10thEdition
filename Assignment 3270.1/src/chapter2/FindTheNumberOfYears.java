package chapter2;
import java.util.Scanner;
public class FindTheNumberOfYears {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);
		
		int mins;
		int years; 
		int days;
		
		System.out.println("Enter the number of minutes:");
		
		mins= input.nextInt();
		int temp= mins;
		
		years = mins/ (365*24*60);
		mins= mins%(365*24*60);
		days= mins/(24*60);
		
		System.out.println(temp+" minutes is approximately "+ years+ " years and "+ days+" days.");
		
		
		
		
	}
}
