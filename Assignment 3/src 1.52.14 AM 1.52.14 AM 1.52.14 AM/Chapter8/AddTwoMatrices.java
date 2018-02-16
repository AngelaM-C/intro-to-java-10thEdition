package Chapter8;
import java.util.Scanner;
public class AddTwoMatrices {
public static void main(String[]args) {
	Scanner input= new Scanner(System.in);
	double[][] c = new double[3][3];
	
	System.out.println("Enter the first 3x3 matrix:");
	
	double[][] a = new double[3][3];
	
	for(int i=0; i < a.length ; i++) {
		
		for(int k =0 ; k < a[0].length; k++) {
			
			a[i][k]= input.nextDouble();
		}
	}
System.out.println("Enter the second 3x3 matrix:");
	
	double[][] b = new double[3][3];
	
	for(int i=0; i < b.length ; i++) {
		
		for(int k =0 ; k < b[0].length; k++) {
			
			b[i][k]= input.nextDouble();
		}
	}
	c= sumMatrices(a,b);
	System.out.println("The matrices are added as follows:");
	
	for(int i=0 ; i< c.length ; i++) {
		for(int k=0; k< c[0].length; k++) {
		System.out.print(c[i][k]+" ");		
		}
		System.out.println();
	}

}

public static double[][] sumMatrices(double[][] matrix1 , double [][] matrix2){
	double[][] result= new double[matrix1.length][matrix1[0].length];
	
	for(int i=0; i<matrix1.length ; i++) {
		for(int k =0; k< matrix1[0].length; k++) {
			result[i][k]= (matrix1[i][k] + matrix2 [i][k]);
		}
	}
	return result;
	
}
}
