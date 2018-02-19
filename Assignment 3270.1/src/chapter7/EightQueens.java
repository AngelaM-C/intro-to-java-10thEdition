package chapter7;

public class EightQueens {

	public static void main(String[] args) {

		String[][] array = new String[8][8];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = "| ";
			}
		}

		
		

		for(int count=0,i =0; count<=8;) {
			
			int j= (int)(Math.random()*8);
			
			if(isSafe(array, i, j)) {
				array[i][j]="|Q";
				count++;
				i++;
			}
		}
		
		//print array
		for (int a = 0; a < array.length; a++) {
			for (int b = 0; b < array.length; b++) {
				System.out.print(array[a][b]);
			}
			System.out.print("|");
			System.out.println();
		}

	}
	
	public static boolean isSafe(String[][] array, int i, int j) {
		if(diaganolCheck(array, i, j)&& columnCheck(array, i)&& rowCheck(array,j)){
			return true;
		}
		return false;
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

	public static boolean diaganolCheck(String[][] array,int i, int j) {
		for(int k=i ,h=j; k>=0 && h>=0; k--,h--) {
			if(array[k][h]=="|Q") 
				return false;
		}
		
		for(int k=i ,h=j; k<=7 && h>=0; k++,h--) {
			if(array[k][h]=="|Q") 
				return false;
		}
		
		for(int k=i ,h=j; k<=7 && h<=0; k++,h++) {
			if(array[k][h]=="|Q") 
				return false;
		}
		
		for(int k=i ,h=j; k>=0 && h<=7; k--,h++) {
			if(array[k][h]=="|Q") 
				return false;
		}
		
		return true;
	}


	

}