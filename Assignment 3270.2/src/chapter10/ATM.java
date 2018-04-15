package chapter10;

import chapter9.AccountClass;
import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		AccountClass[] accounts = new AccountClass[9];

		for (int i = 0; i < 9; i++) {
			accounts[i] = new AccountClass(i, 100);
		}

		while (1 == 1) {
			System.out.println("Enter an ID:");

			int aID = input.nextInt();

			if (aID > 9) {
				System.out.println("ID incorrect.");
				continue;
			}
			INNER: while (1 == 1) {
				System.out.println("Main menu \n1:Check Balance \n2:Withdraw \n3:Deposit \n4:Exit \nEnter a choice:");

				switch (input.nextInt()) {
				case 1:
					System.out.println("The balance is" + accounts[aID].getBalance());
					break;
				case 2:
					System.out.println("Enter an amount to withdraw:");
					accounts[aID].withdraw(input.nextDouble());
					break;
				case 3:
					System.out.println("Enter an amount to deposit:");
					accounts[aID].deposit(input.nextDouble());
					break;
				case 4:
					break INNER;

				}

			}

		}

	}
}
