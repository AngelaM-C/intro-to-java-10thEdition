package midtermReview;
import java.util.Scanner;
public class futureDate {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter's today day:");
		int tday=input.nextInt();
		
		System.out.println("enter the number of days elapsed:");
		int edays= input.nextInt();
		
		edays=(edays+tday)%7;

		
		String today=" ";
		switch(edays){
			case 0: today="Sunday";
			break;
			case 1: today="Monday";
			break;
			case 2: today="Tuesday";
			break;
			case 3: today="Wednesday";
			break;
			case 4: today="Thursday";
			break;
			case 5: today="Friday";
			break;
			case 6: today="Saturday";
		}
		
		System.out.println(today);
	}
	

}
