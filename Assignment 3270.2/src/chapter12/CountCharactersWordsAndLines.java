package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountCharactersWordsAndLines {

	public static void main(String[] args) throws FileNotFoundException {

		if (args.length != 1) {
			System.out.println("Input argurments are invalid.");
			System.exit(0);
		}

		File f1 = new File(args[0]);
		if (!f1.exists()) {
			System.out.println("Source file " + args[0] + " does not exist.");
			System.exit(1);
		}
		String s1 = "";
		int lineCount = 0;
		int wordCount = 0;
		int charCount = 0;
		try (Scanner input = new Scanner(f1);) {
			while (input.hasNext()) {
				lineCount++;
				s1 += input.nextLine();
			}
			String[] array = s1.split("\\s+");
			wordCount += array.length;
			String[] array2 = s1.split("|");
			charCount += array2.length;
			
			System.out.println("Line Count:"+ lineCount);
			System.out.println("Word count:"+ wordCount);
			System.out.println("Character count:"+ charCount);
		}
	}
}
