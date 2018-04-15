package chapter12;
import java.util.Scanner;
public class ArrayIndexOutOfBounds {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array= new int[100];
		
		for(int i=0; i< array.length; i++) {
			array[i]= (int)(Math.random() *10);
		}
		
		System.out.println("Enter the index of the array to display:");
		try {
		System.out.println(array[input.nextInt()]);
		}catch(Exception ex) {
			System.out.println("Out of bounds.");
		}
		
	}

}
