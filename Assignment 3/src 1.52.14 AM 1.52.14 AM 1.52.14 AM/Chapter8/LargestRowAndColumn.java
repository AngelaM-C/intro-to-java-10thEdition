package Chapter8;

public class LargestRowAndColumn {
public static void main(String[]args) {
	int[][] matrix= new int[4][4];
	int[] row= new int[matrix.length];
	int[] column= new int[matrix[0].length];
	
	for(int i= 0; i< matrix.length; i++) {
		for(int k= 0; k < matrix[0].length; k++) {
			matrix[i][k]= (int) (Math.random()* 2);
		}
	}
	
	for(int i=0 ; i< matrix.length ; i++) {
		for(int k=0; k< matrix[0].length; k++) {
		System.out.print(matrix[i][k]+" ");		
		}
		System.out.println();
	}
	int rowIndex=0;
	int largest=-1;
	for(int i=0; i<matrix.length ; i++) {
		int rowCount=0;
		for(int k =0 ; k< matrix[0].length; k++) {
			rowCount += matrix[i][k];
			}
		if(rowCount > largest) {
			rowIndex=i;
			largest= rowCount;
		}
	}

	int columnIndex=0;
	largest=-1;
	for(int k=0; k<matrix[0].length ; k++) {
		int columnCount=0;
		for(int i =0 ; i< matrix.length; i++) {
			columnCount += matrix[i][k];
			}
		if(columnCount > largest) {
			columnIndex= k;
			largest= columnCount;
		}
	}
	

	
	System.out.println("The largest row index is " + rowIndex);
	System.out.println("The largest column index is " + columnIndex);
	
}
}
