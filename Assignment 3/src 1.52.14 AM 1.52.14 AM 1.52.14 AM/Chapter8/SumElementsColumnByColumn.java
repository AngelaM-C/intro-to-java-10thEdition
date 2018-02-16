package Chapter8;

public class SumElementsColumnByColumn {
	public static void main(String[]args) {
	
	double[][] array= {{1.5,2,3,4},
			           {5.5,6,7,8},
			           {9.5,1,3,1}};
	for(int i = 0 ; i< array[0].length; i++) {
	
		System.out.println("The sum of the elements in column "+ i +" is " + sumColumn(array, i));		           
	}
		
		
	}
	public static double sumColumn(double [][] m, int columnIndex) {
	
		double sum=0;
		for (int i=0 ; i< m.length ; i++) {
		 sum += m[i][columnIndex];	
		}
	
		return sum;
	
	}
}
