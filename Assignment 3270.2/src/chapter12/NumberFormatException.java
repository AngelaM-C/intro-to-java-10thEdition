package chapter12;

import java.util.Scanner;

public class NumberFormatException {
	private String a;
	private String b;
	private String c;

	public NumberFormatException(String a) {
		a = a.replaceAll("\\s", "");
		String[] split = new String[3];
		split = a.split("(?<=[-+*/])|(?=[-+*/])");
		this.a = split[0];
		this.b = split[1];
		this.c = split[2];
	}

	public int exceptionHandler() {
		if (!this.a.matches("\\d+")) {
			System.out.println("Wrong input: " + this.getA());
			return 1;
		}
		if (!this.c.matches("\\d+")) {
			System.out.println("Wrong input: " + this.getC());
			return 1;
		}
		return 0;
	}

	public String calculate() {
		int d = Integer.parseInt(a);
		int e = Integer.parseInt(c);
		if (this.b.equals("+"))
			return a + b + c + "=" + (d + e);
		if (this.b.equals("-"))
			return a + b + c + "=" + (d - e);
		if (this.b.equals("*"))
			return a + b + c + "=" + (d * e);
		if (this.b.equals("/"))
			return a + b + c + "=" + (d / e);
		return "Invalid";
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an expression:");

		NumberFormatException c1 = new NumberFormatException(input.nextLine());

		if (c1.exceptionHandler() == 0)
			System.out.println(c1.calculate());
	}

	public String getA() {
		return a;
	}

	public String getB() {
		return b;
	}

	public String getC() {
		return c;
	}

}
