package Chapter8;
import java.util.Scanner;
public class SumTheMajorDiagonal {
	public static void main(String[]args) {
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter a 4x4 matrix:");
		
		double[][] matrix= new double[4][4];
		
		for(int i =0 ; i< matrix.length; i++) {
			
			for(int k =0 ; k < matrix[0].length; k++) {
				matrix[i][k] = input.nextDouble();
			}
		}
	
		System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));
		
		
	}
	
	public static double sumMajorDiagonal(double[][] m) {
		double sum=0;
		for( int i =0 ; i < m.length ; i++) {
			sum += m[i][i];
		}
		return sum;
		
		
	}
}
