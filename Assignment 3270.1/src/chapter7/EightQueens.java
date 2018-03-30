package chapter7;

public class EightQueens {

	public static void main(String[] args) {

		String[][] array = new String[8][8];

		// Assigns lines to array to form a grid
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = "| ";
			}
		}

		// Invokes the method to place queens from left to right by columns
		placeQ(array, 0);

		// Print grid with queens placed
		for (int a = 0; a < array.length; a++) {
			for (int b = 0; b < array.length; b++) {
				System.out.print(array[a][b]);
			}
			System.out.print("|");
			System.out.println();
		}
	}

	/*
	 * Returns true when every column has a queen that
	 * doesn't interfere with other columns to the right.
	 * Method works on the whole grid at once by calling the same method inside the method.
	 */
	public static boolean placeQ(String[][] array, int j) {
		if (j >= array.length) {
			return true;
		}

		boolean queenInAllColumns = false;
		int i = 0;

		while (!queenInAllColumns && i < array.length) {
			if (!isSafe(array, i, j)) {
				i++;
			} else {
				addQ(array, i, j);
				queenInAllColumns = placeQ(array, j + 1);
				if (!queenInAllColumns) {
					deleteQ(array, i, j);
					i++;
				}
			}
		}
		return queenInAllColumns;
	}

	// Adds queen
	public static void addQ(String[][] array, int i, int j) {
		array[i][j] = "|Q";
	}

	// Deletes queen
	public static void deleteQ(String[][] array, int i, int j) {
		array[i][j] = "| ";
	}

	/*
	 * Returns true if all conditions are met: row, column and diagonal are free of
	 * queens
	 */
	public static boolean isSafe(String[][] array, int i, int j) {
		if (diaganolCheck(array, i, j) && columnCheck(array, j) && rowCheck(array, i))
			return true;
		return false;
	}

	/*
	 * Goes through the whole row making sure there are no queens,returns true if
	 * none are found
	 */
	public static boolean rowCheck(String[][] array, int row) {
		for (int i = 0; i < array.length; i++)
			if (array[row][i] == "|Q")
				return false;
		return true;
	}

	/*
	 * Goes through the whole column making sure there are no queens,returns true if
	 * none are found
	 */
	public static boolean columnCheck(String[][] array, int column) {
		for (int i = 0; i < array.length; i++)
			if (array[i][column] == "|Q")
				return false;
		return true;
	}

	/*
	 * @param (array,row, column) checks diagonal going towards the left assuming
	 * the right side is blank since we are adding queens from left to right
	 */
	public static boolean diaganolCheck(String[][] array, int i, int j) {
		// Checks diagonal going up-left
		for (int k = i, h = j; k >= 0 && h >= 0; k--, h--)
			if (array[k][h] == "|Q")
				return false;

		// Checks diagonal going down-left
		for (int k = i, h = j; k <= 7 && h >= 0; k++, h--)
			if (array[k][h] == "|Q")
				return false;

		return true;
	}

}