package chapter7;
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		double[] list= new double[10];
		System.out.println("Enter 10 numbers:");
		
		for(int i=0; i<list.length;i++) {
			list[i]=input.nextDouble();
		}
		
		bubbleSort(list);
		for(double v: list)
			System.out.print(v+" ");
	}

	public static double[] bubbleSort(double[] list) {
		for (int i = 0; i < list.length; i++) {

			for (int j = 0; j < list.length - 1 - i; j++) {
				if (list[j] > list[j + 1]) {

					double temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;

				}
			}

		}
		return list;
	}
}
