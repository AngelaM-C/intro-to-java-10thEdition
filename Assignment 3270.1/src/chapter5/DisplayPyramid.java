package chapter5;

import java.util.Scanner;

public class DisplayPyramid {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of lines(1-15):");
		int user = input.nextInt();

		for (int row = 1; row <= user; row++) {
			//print spaces
			for (int column = 1; column <= user - row; column++)
				System.out.printf("%3s", " ");
			//print decreasing
			for (int num = row; num >= 1; num--)
				System.out.printf("%3d", num);
			//print increasing
			for (int num2 = 2; num2 <= row; num2++)
				System.out.printf("%3d", num2);
			System.out.println();
		}

	}
}