package chapter5;
import java.util.Scanner;
public class MeanAndStandardDeviation {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int n=10;
		
		System.out.println("Enter 10 numbers");
		
		double x=0;
		double sum=0;
		double mean=0;
		double sumSq=0;
		double sd=0;

		for(int i =0; i<10;i++) {
			x=input.nextDouble();
			sum+= x;
			sumSq+= Math.pow(x, 2);
		}
		
		mean= sum/10;
		sd= Math.sqrt((sumSq-((Math.pow(sum, 2))/10))/(10-1));
		
		System.out.printf("The mean is %.2f.\n", mean);
		System.out.printf("The standard deviation is %.5f.\n", sd);
		
	}

}
