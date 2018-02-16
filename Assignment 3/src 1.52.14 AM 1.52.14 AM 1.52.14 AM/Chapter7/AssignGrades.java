package Chapter7;
import java.util.Scanner;

public class AssignGrades {
public static void main(String[]args) {
	Scanner input= new Scanner(System.in);
	
	System.out.println("Enter the number of students:");
	int numberOfStudents = input.nextInt();
	
	double[] scores= new double[numberOfStudents];
	System.out.println("Enter " + numberOfStudents + " scores:");
	
	for(int i =0 ; i< scores.length ; i++) {
		scores[i]=input.nextInt();	
	}
	
	double best = scores[0];
	
	for (int i =0; i<scores.length ; i++) {
		
		if(scores[i] > best) {
			best= scores[i];
		}	
	}
	
	for(int i =0 ; i < scores.length; i++) {
		if(scores[i]>= best-10)
			System.out.println("Student "+ i +" score is "+ scores[i]+ " and grade is A.");
		else if(scores[i]>= best-20)
			System.out.println("Student "+ i +" score is "+ scores[i]+ " and grade is B.");
		else if (scores[i]>= best-30)
			System.out.println("Student "+ i +" score is "+ scores[i]+ " and grade is C.");
		else if(scores[i]>= best-40)
			System.out.println("Student "+ i +" score is "+ scores[i]+ " and grade is D.");
		else 
			System.out.println("Student "+ i +" score is "+ scores[i]+ " and grade is F.");
		
	}
	
	
	
	
}
}
