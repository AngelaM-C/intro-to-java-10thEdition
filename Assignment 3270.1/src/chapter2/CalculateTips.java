package chapter2;
import java.util.Scanner;

public class CalculateTips {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		double gratuity;
		double subtotal;
	    double total;
	    
	    System.out.println("Enter the subtotal and gratuity rate:");
	    
	    subtotal= input.nextDouble();
	    gratuity= subtotal* (input.nextDouble()/100);
	    
	    total= subtotal +gratuity;
	    
	    System.out.println("The gratuity is $" + gratuity+ " and the total is $" +total);
	    
	    
	    

	}

}
