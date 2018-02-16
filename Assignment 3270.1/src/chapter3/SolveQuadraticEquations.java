package chapter3;

import java.util.Scanner;

public class SolveQuadraticEquations {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a, b ,c:");

		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		double dis = Math.pow(b, 2) - 4 * a * c;
		double r1 = (-b + Math.sqrt(dis)) / (2 * a);
		double r2 = (-b - Math.sqrt(dis)) / (2 * a);

		if (dis < 0) {
			System.out.println("The equation has no real roots.");
		} else if (dis == 0) {
			System.out.println("The equation has one root:" + r1);

		} else if (dis > 0) {
			System.out.println("The equation has two roots:" + r1 + " and " + r2);

		}

	}

}
