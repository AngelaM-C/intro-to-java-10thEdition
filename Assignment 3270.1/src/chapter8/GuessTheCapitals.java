package chapter8;

import java.util.Scanner;

public class GuessTheCapitals {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		String[][] stateCapitals = { { "Alabama", "Montgomery" }, { "Alaska", "Juneau" }, { "Arizona", "Phoenix" },
				{ "Arkansas", "Little Rock" }, { "California", "Sacramento" }, { "Colorado", "Denver" },
				{ "Connecticut", "Hartford" }, { "Delaware", "Dover" }, { "Florida", "Tallahassee" },
				{ "Georgia", "Atlanta" }, { "Hawaii", "Honolulu" }, { "Idaho", "Boise" }, { "Illinois", "Springfield" },
				{ "Indiana", "Indianapolis" }, { "Iowa", "Des Moines" }, { "Kansas", "Topeka" },
				{ "Kentucky", "Frankfort" }, { "Louisiana", "Baton Rouge" }, { "Maine", "Augusta" },
				{ "Maryland", "Annapolis" }, { "Massachusetts", "Boston" }, { "Michigan", "Lansing" },
				{ "Minnesota", "St. Paul" }, { "Mississippi", "Jackson" }, { "Missouri", "Jefferson City" },
				{ "Montana", "Helena" }, { "Nebraska", "Lincoln" }, { "Nevada", "Carson City" },
				{ "New Hampshire", "Concord" }, { "New Jersey", "Trenton" }, { "New Mexico", "Santa Fe" },
				{ "New York", "Albany" }, { "North Carolina", "Raleigh" }, { "North Dakota", "Bismarck" },
				{ "Ohio", "Columbus" }, { "Oklahoma", "Oklahoma City" }, { "Oregon", "Salem" },
				{ "Pennsylvania", "Harrisburg" }, { "Rhode Island", "Providence" }, { "South Carolina", "Columbia" },
				{ "South Dakota", "Pierre" }, { "Tennessee", "Nashville" }, { "Texas", "Austin" },
				{ "Utah", "Salt Lake City" }, { "Vermont", "Montpelier" }, { "Virginia", "Richmond" },
				{ "Washington", "Olympia" }, { "West Virginia", "Charleston" }, { "Wisconsin", "Madison" },
				{ "Wyoming", "Cheyenne" } };

		for (int i = 0; i < stateCapitals.length; i++) {
			System.out.printf("What is the capital of %s?\n", stateCapitals[i][0]);
			if (stateCapitals[i][1].compareToIgnoreCase(input.nextLine()) == 0) {
				System.out.println("Your answer is correct!");
				count++;
			} else
				System.out.printf("The correct answer should be %s.\n", stateCapitals[i][1]);
		}

		System.out.printf("The correct count is: %d", count);

	}

}
