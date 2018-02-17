package chapter5;
import java.util.Scanner;
public class DisplayPyramid {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the number of lines(1-15):");
		int num= input.nextInt();
		
		for(int i= 1; i<=num;i++) {
		switch(i) {
		case 1:System.out.println("                                   1 ");break;
		case 2:System.out.println("                                 2 1 2 ");break;
		case 3:System.out.println("                               3 2 1 2 3 ");break;
		case 4:System.out.println("                             4 3 2 1 2 3 4 ");break;
		case 5:System.out.println("                           5 4 3 2 1 2 3 4 5");break;
		case 6:System.out.println("                         6 5 4 3 2 1 2 3 4 5 6 ");break;
		case 7:System.out.println("                       7 6 5 4 3 2 1 2 3 4 5 6 7 ");break;
		case 8:System.out.println("                     8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 ");break;
		case 9:System.out.println("                   9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 ");break;
		case 10:System.out.println("                10 9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 10  ");break;
		case 11:System.out.println("             11 10 9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 10 11 ");break;
		case 12:System.out.println("          12 11 10 9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 10 11 12 ");break;
		case 13:System.out.println("       13 12 11 10 9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 10 11 12 13 ");break;
		case 14:System.out.println("    14 13 12 11 10 9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 10 11 12 13 14 ");break;
		case 15:System.out.println(" 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15");break;
		default:System.out.println("Invalid input.");return;
		}
		}
		
	
	
	
	
	
	
}
}