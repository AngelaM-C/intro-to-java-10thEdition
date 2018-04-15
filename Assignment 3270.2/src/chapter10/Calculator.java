package chapter10;

import java.util.Scanner;

public class Calculator {
	private int a;
	private String b;
	private int c;

	public Calculator(String a) {
		a = a.replaceAll("\\s", "");
		String[] split = new String[3];
		split = a.split("\\d*?");
		this.a = Integer.parseInt(split[0]);
		this.b = split[1];
		this.c = Integer.parseInt(split[2]);
	}

	public String calculate() {
		if (this.b.equals("+"))
			return a + b + c + "=" + (a + c);
		if (this.b.equals("-"))
			return a + b + c + "=" + (a - c);
		if (this.b.equals("*"))
			return a + b + c + "=" + (a * c);
		if (this.b.equals("/"))
			return a + b + c + "=" + (a / c);
		return "Invalid";
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an expression:");

		Calculator c1 = new Calculator(input.nextLine());

		System.out.println(c1.calculate());

	}

}
