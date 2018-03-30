package chapter8;

import java.util.Scanner;

public class MultiplyTwoMatrices {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			double[][] a = new double[3][3];
			double[][] b = new double[3][3];

			System.out.println("Enter matrix1:");
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					a[i][j] = input.nextDouble();
				}
			}
			System.out.println("Enter matrix2:");
			for (int i = 0; i < b.length; i++) {
				for (int j = 0; j < b.length; j++) {
					b[i][j] = input.nextDouble();
				}
			}
			
			double[][] c=multiplyMatrix(a,b);

			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
						System.out.printf("%5.1f",a[i][j]);
				}
				System.out.println();
			}

			System.out.printf("%9s\n","*");
			for (int i = 0; i < b.length; i++) {
				for (int j = 0; j < b.length; j++) {
						System.out.printf("%5.1f",b[i][j]);
					}
				System.out.println();
			}
			System.out.printf("%9s\n","=");
			for(int i=0;i<c.length;i++) {
				for(int j=0; j<c.length;j++) {
						System.out.printf("%5.1f",c[i][j]);	
				}
				
				System.out.println();
			}
		}

		public static double[][] multiplyMatrix(double[][] a, double[][] b) {
			double[][] sum = new double[a.length][a[1].length];
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					sum[i][j] = a[i][j] * b[i][j];
				}
			}
			return sum;
		}
	}


