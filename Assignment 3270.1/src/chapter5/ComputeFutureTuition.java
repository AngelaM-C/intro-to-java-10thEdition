package chapter5;

public class ComputeFutureTuition {

	public static void main(String[] args) {
		double tuition = 10000.00;
		double interest= .05;
		double sum=0;
		
		for(int i=1; i<=14;i++) {
			tuition+= tuition *interest;
			
			if(i ==10)
				System.out.printf("The tuition on the 10th year is $%.2f.\n" , tuition);
			
			if(i>10)
				sum+=tuition;
		}

	
		System.out.printf("The cost of tuition for 4 year after the 10th year is $%.2f.",sum);
	}

}
