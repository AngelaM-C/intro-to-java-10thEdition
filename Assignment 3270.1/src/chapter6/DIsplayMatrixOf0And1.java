package chapter6;
import java.util.Scanner;
public class DIsplayMatrixOf0And1 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter n:");
		printMatrix(input.nextInt());
		
	}


	public static void printMatrix(int n) {
		int list[][] = new int[n][n];
		
		for(int i=0; i<list.length ; i++) {
			
			for(int j=0; j< list.length;j++) {
				
				list[i][j]= (int) (Math.random()*2);
				
				System.out.print(list[i][j]+" ");
				
			}
			System.out.println();
		}
		
	}
}
