package chapter7;

import java.util.Scanner;

public class AssignGrades {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of students:");
		int num = input.nextInt();

		double[] scores = new double[num];

		System.out.println("Enter the scores:");

		for (int i = 0; i < scores.length; i++) {
			scores[i] = input.nextDouble();
		}

		double max = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > max)
				max = scores[i];
		}
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= max - 10) {
				System.out.println("Student " + i + " score is " + scores[i] + " and grade is A.");
			} else if (scores[i] >= max - 20) {
				System.out.println("Student " + i + " score is " + scores[i] + " and grade is B.");
			} else if (scores[i] >= max - 30) {
				System.out.println("Student " + i + " score is " + scores[i] + " and grade is C.");
			} else if (scores[i] >= max - 40) {
				System.out.println("Student " + i + " score is " + scores[i] + " and grade is D.");
			} else
				System.out.println("Student " + i + " score is " + scores[i] + " and grade is F.");

		}
	}
}
