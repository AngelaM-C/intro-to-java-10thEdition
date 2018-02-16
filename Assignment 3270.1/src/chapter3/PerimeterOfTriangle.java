package chapter3;
import java.util.Scanner;
public class PerimeterOfTriangle {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter three edges of a triangle:");
		double e1= input.nextInt();
		double e2= input.nextInt();
		double e3= input.nextInt();
		
		if(e1+e2>e3 && e2+e3>e1 && e1+e3 >e2) {
			System.out.println("The perimeter of the triangle is: "+ (e1 +e2+e3));
		} else {
			System.out.println("Invalid input.");
			
		}
		
	}

}
