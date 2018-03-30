package chapter8;

import java.util.Scanner;

public class CentralCity {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of cities:");
		int user = input.nextInt();
		double[][] list = new double[user][3];
		
		
		System.out.println("Enter the coordinates of the cities:");
		
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				if(j==2) {
					list[i][j]=0;
					continue;
				}
				list[i][j] = input.nextDouble();
				
			}
		}
		
		int minRow=getCentralPoint(list);
		
		System.out.printf("The central city is at (%.1f ,%.1f)\n",list[minRow][0], list[minRow][1]);
		System.out.printf("The total distance to all other cities is %.1f",list[minRow][2]);
		
		
	}

	public static double getDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}

	public static int getCentralPoint(double[][] list) {
		int minRow=0;
		for (int i = 0; i < list.length; i++) {

			for (int j = 0; j < list.length; j++) {

				if (j != i) {
					list[i][2] += getDistance(list[i][0], list[i][1], list[j][0], list[j][1]);
				}
			}
		}
		
		for (int i = 1; i < list.length; i++) {
			double min=0;
            if (list[i][2] < min) {
                min= list[i][2];
                minRow=i;
            }
        }

        return minRow;

	}
}
