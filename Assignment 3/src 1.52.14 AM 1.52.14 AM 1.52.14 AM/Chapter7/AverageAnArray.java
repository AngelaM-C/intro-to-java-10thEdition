package Chapter7;
import java.util.Scanner;
public class AverageAnArray {
public static void main(String[]args) {
	Scanner input= new Scanner(System.in);
	 double[] list = new double[10];
	 
	 System.out.println("Enter 10 double values:");	
	
	for( int i = 0; i< list.length; i++) {
		list[i]= input.nextDouble();	
	}
	
	System.out.println("The average of the numbers is " + average(list));
	
}
	
	
	public static int average(int[] array) {
	int sum=0;
	int average=0;
	for(int i =0 ; i< array.length ; i++) {
		sum += array[i];
	}
	
	average = sum/array.length;
	
	return average;
}

public static double average(double[] array) {
	double sum=0;
	double average=0;
	for(int i =0 ; i< array.length ; i++) {
		sum += array[i];
	}
	
	average = sum/array.length;
	
	return average;

}
}
