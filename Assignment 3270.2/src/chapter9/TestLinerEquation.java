package chapter9;
import java.util.Scanner;
public class TestLinerEquation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter a, b, c, d, e, f:");
		LinearEquation l1= new LinearEquation(input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt());
		
		if(!l1.isSolvable())
			System.out.println("The equation has no solution.");
		else {
			System.out.println("x is:"+l1.getX() + "\ny is:"+ l1.getY());
		}
	}

}
