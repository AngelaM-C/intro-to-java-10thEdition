package chapter6;

public class DisplaySortedNumbers {

	public static void main(String[] args) {
		displaySortedNumbers(7, 10, 6);

	}

	public static void displaySortedNumbers(double num1, double num2, double num3) {
		double temp;
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println(num1 + " " + num2 + " " + num3);
	}
}
