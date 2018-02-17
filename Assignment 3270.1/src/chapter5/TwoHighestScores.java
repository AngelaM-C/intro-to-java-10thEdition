package chapter5;
import java.util.Scanner;
public class TwoHighestScores {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);
		
		double max1=0;
		double max2=0;
		String student1="";
		String student2="";
		
		System.out.println("Enter the number of students: ");
		int numOfStudents= input.nextInt();
		
		String[] students= new String[numOfStudents];
		double[] scores= new double[numOfStudents];
		
		for(int i =0; i<numOfStudents; i++) {
			System.out.println("Enter the name of the student and their score:");
			
			students[i]= input.next();
			scores[i]= input.nextDouble();
			
			if(scores[i] > max2 ^ scores[i]> max1) {
				max2=scores[i];
				student2= students[i];
		}
			
			if(scores[i]>max1 && scores[i] > max2) {
				max1=scores[i];
				student1= students[i];
		}
		
		}
		
		System.out.println(student1 +" got the best score of "+max1);
		System.out.println(student2 +" got the second best score of "+max2);
		
	}
}
