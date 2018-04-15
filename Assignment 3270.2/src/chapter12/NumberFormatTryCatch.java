package chapter12;

import java.util.Scanner;

import chapter10.Calculator;

public class NumberFormatTryCatch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an expression:");
		try {
		Calculator c1 = new Calculator(input.nextLine());
		
			System.out.println(c1.calculate());

		} catch (Exception ex) {
			System.out.println("Wrong input.");
		}
	}
}
