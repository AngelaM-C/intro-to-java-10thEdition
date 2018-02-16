package jan25;

import java.util.Scanner;

public class InClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[] list = {6.5, 8.7,9.1,2.3,8.1};
		
		double max= list[0];
		
		for(int i = 1; i < list.length; i++ ) {
			
			if(list[i]> max)
				
				max= list[i];
		}

		System.out.println(max);
		
	}

}
