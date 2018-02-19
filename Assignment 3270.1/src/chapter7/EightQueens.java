package chapter7;

public class EightQueens {

	public static void main(String[] args) {

		String[][] array = new String[8][8];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = "| ";
			}
		}

		for (int i = 0; i < array.length ; i++) {
			for (int j = 0; j < array[i].length ; j++) {
				if(i==j) {
					if(columnCheck(array, i) && rowCheck(array,j)&& diaganolCheckLR(array)) {
						array[i][j]="|Q";
						break;		
					}
				}
				if(i+j==7) {
					if(columnCheck(array, i) && rowCheck(array,j) && diaganolCheckRL(array)) {
						array[i][j]="|Q";
						break;		
					}
				}
				
				if(columnCheck(array, i) && rowCheck(array,j)){
					array[i][j]="|Q";
					break;		
				}
			}
		}

		
		
		//print array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.print("|");
			System.out.println();
		}

	}

	public static boolean columnCheck(String[][] array, int row) {
		for (int i = 0; i < array.length; i++)
			if (array[row][i] == "|Q")
				return false;
		return true;
	}

	public static boolean rowCheck(String[][] array, int column) {
		for (int i = 0; i < array.length; i++)
			if (array[i][column] == "|Q")
				return false;
		return true;
	}

	public static boolean diaganolCheckLR(String[][] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i][i] == "|Q") {
				return false;
			}
		}
		return true;
	}

	public static boolean diaganolCheckRL(String[][] array) {
		for (int i = 0, j = 7; i < array.length; i++, j--) {
			if (array[i][j] == "|Q")
				return false;
		}
		return true;
	}
}
