package chapter7;

import java.util.Scanner;

public class SortStudents {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of students:");

		double[] score = new double[input.nextInt()];
		
		String[] name = new String[score.length];
		
		
		for (int i = 0; i < score.length; i++) {
			System.out.println("Enter student name:");
			name[i] = input.next();
			System.out.println("Enter student score:");
			score[i] = input.nextDouble();
		}
		
	
		
		for (int i = 0; i < score.length; i++) {
			double min = score[i];
			String minName = name[i];
			int minIndex=i;
			
			for (int j = i+1; j < score.length; j++) {
				if (min>score[j]) {
					minName = name[j];
					min=score[j];
					minIndex=j;
				}
			}
			if(minIndex!=i) {
				score[minIndex]=score[i];
				score[i]=min;
				name[minIndex]=name[i];
				name[i]=minName;
			}
			
		}
		for(String v: name)
			System.out.println(v);
	}
}
