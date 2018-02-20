package chapter7;
import java.util.Scanner;
public class PrintDistinctNumbers {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int[] userNum= new int[10];
		int[] result= new int[10];
		
		System.out.println("Enter 10 numbers:");
		for(int i=0;i<userNum.length;i++) {
			userNum[i]=input.nextInt();
			result[userNum[i]]=userNum[i];
		}
		System.out.print("The distinct numbers are:");
		for(int i=0; i<result.length;i++) {
			if(result[i]!=0)
				System.out.print(result[i]+" ");
		}
		

	}

}
