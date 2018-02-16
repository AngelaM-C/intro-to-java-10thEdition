package chapter2;
import java.util.Scanner;
public class ComputingBMI {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);
		
		double lbs , kgs, inches, meters, bmi;
		
		
		System.out.println("Enter weight in pounds:");
		lbs= input.nextDouble();
		
		System.out.println("Enter height in inches:");
		inches= input.nextDouble();
		
		kgs= lbs* 0.45359237;
		meters= inches *0.0254;
		
		bmi= kgs / (Math.pow(meters, 2));
		
		System.out.println("BMI is "+ bmi);
		
		
	}

}
