package Chapter7;
import java.util.Scanner;
public class eliminateDuplicates {
	
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);
		int[] array= new int[10];
		System.out.println("Enter 10 numbers");
		
		for(int i =0; i< array.length ; i++) {
			array[i]= input.nextInt();
		}
	System.out.print("The distinct numbers are:");
	
	array = eliminateDuplicates(array);
	
		for (int i= 0 ; i <array.length ; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	
	
	
	
	
	
	public static int[] eliminateDuplicates(int[] list) {
		int[]temp = new int[list.length];
		boolean isDuplicate;
		int tempIndex=0;
		
		for(int i =0 ; i < list.length ; i++) {
			isDuplicate=false;
			
			for (int k =0; k< temp.length;k++) {
				
				if (list[i] == temp[k])
					isDuplicate=true;
			}
			if (!isDuplicate){
			temp[tempIndex++]= list[i];	
				
			}
		}
		
		int[] result= new int[tempIndex];
		
		for(int i=0 ; i< result.length; i++) {
		
		result[i]= temp[i];
	}
		return result;
}}
