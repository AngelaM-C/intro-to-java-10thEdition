package chapter8;
import java.util.Scanner;
public class SumElementsColumn {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		double[][] array= new double[3][4];
		double sum=0;
		
		System.out.println("Enter a 3 by 4 matrix, row by row:");
		
		for(int i =0; i<array.length;i++) {
			for(int j=0; j<array[i].length;j++) {
				array[i][j]= input.nextDouble();	
			}
		}
		
		
		
		for(int j=0; j<=array.length;j++) {
			for(int i=0;i<array.length;i++) {
				sum+=array[i][j];
			}
			System.out.println("The sum of the elements of column "+ j+ " is: "+ sum);
			sum=0;
		}

	}

}
