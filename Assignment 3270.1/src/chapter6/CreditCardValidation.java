package chapter6;

import java.util.Scanner;

public class CreditCardValidation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the credit card number:");
		long num = input.nextLong();

		if (isValid(num))
			System.out.println(num + " is valid.");
		else
			System.out.println(num + " is invalid.");

	}

	public static boolean isValid(long number) {
		if (getSize(number) > 16 || getSize(number) < 13) {
			return false;
		}
		if (prefixMatched(getPrefix(number, 2), 4) || prefixMatched(getPrefix(number, 2), 5)
				|| prefixMatched(getPrefix(number, 2), 37) || prefixMatched(getPrefix(number, 2), 6)) {
			if ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0) {
				return true;
			}
		}
		return false;

	}

	public static int sumOfDoubleEvenPlace(long number) {
		String num = number + "";
		int sum = 0;
		for (int i = num.length() - 2; i >= 0; i -= 2) {
			sum += getDigit((num.charAt(i) - '0') * 2);
		}
		return sum;
	}

	public static int getDigit(int number) {
		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number = number / 10;
		}
		return sum;
	}

	public static int sumOfOddPlace(long number) {
		String num = number + "";
		int sum = 0;
		for (int i = num.length() - 1; i >= 0; i -= 2) {
			sum += num.charAt(i) - '0';
		}
		return sum;
	}

	public static long getPrefix(long number, int k) {
		String num = number + "";
		if (num.length() < k)
			return number;

		return Integer.parseInt(num.substring(0, k));

	}

	public static int getSize(long d) {
		String num = d + "";
		return num.length();
	}

	public static boolean prefixMatched(long number, int d) {
		String num = number + "";
		String str = d + "";
		return num.indexOf(str) == 0;

	}

}
