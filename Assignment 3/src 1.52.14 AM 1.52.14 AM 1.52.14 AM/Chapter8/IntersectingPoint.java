package Chapter8;
import java.util.Scanner;
public class IntersectingPoint {
public static void main(String[]args) {
	Scanner input= new Scanner(System.in);
	System.out.println("Enter 4 points , starting with x1,y1:");
	
	double[][] matrix = new double[4][2];
	
	for(int i=0 ; i < matrix.length ; i++) 
		for(int k=0 ;k< matrix[0].length ; k++) 
			matrix[i][k]= input.nextDouble();
		
	
	double[] intersection= new double[2];
    intersection= getIntersectingPoint(matrix);
	
	if(intersection== null) {
		System.out.println("The two lines are parallel.");
	} else {
	System.out.println("The intesection point is "+ intersection[0] +","+ intersection[1]);
	
	}
	
}

	
	
	
	public static double[] getIntersectingPoint(double[][] points) {
		double[] point = new double[2];
		int x =0;
		int y=1;
		
		double a= points[0][y] - points[1][y];
		double b= -(points[0][x]- points[1][x]);
		double c= points[2][y]- points[3][y];
		double d= -(points[2][x]-points[3][x]);
		double e = (points[0][y]- points[1][y])* points[0][x] - (points[0][x]-points[1][x])*points[0][y];
		double f = (points[2][y]- points[3][y])* points[2][x] - (points[2][x]-points[3][x])*points[2][y];
	
		double adbc= a*d - b*c;
		
		if (adbc == 0)
			return null;
		
		point[x]=(e*d-b*f)/adbc;
		point[y]=(a*f - e*c)/adbc;
		
		return point;
			
		
		
	}
}
