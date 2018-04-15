package chapter11;
import java.util.ArrayList;
import java.util.Scanner;
public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		 System.out.print("Enter ten integers:");
		 
		 int value;
		 
		 for(int i=0; i<10;i++) {
			 value= input.nextInt();
			
			 if(!list.contains(value) && value !=0)
				 list.add(value);
		 }
		 System.out.println(list.toString());
		
	}
}
