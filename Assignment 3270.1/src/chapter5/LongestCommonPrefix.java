package chapter5;

import java.util.Scanner;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first string:");

		String str1 = input.nextLine();

		System.out.println("Enter the second string:");

		String str2 = input.nextLine();

		String min = str1;

		if (str1.length() > str2.length()) {
			min = str2;
		}

		for (int i = 0; i < min.length(); i++) {

			if (str1.charAt(i) != str2.charAt(i)) {
				if (i == 0) {
					System.out.println(str1 + " and " + str2 + " have no common prefix");
					break;
				} else {
					System.out.println("The common prefix is " + str1.substring(0, i));
					break;
				}
				
			}
			if(i== min.length() -1)
				System.out.println(min);

		}
	}
}
