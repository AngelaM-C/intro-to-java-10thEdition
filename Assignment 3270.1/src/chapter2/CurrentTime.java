package chapter2;
import java.util.Scanner;

public class CurrentTime {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the time zone offset to GMT:");
		long offset= input.nextLong();
		
		
		long totalSeconds=System.currentTimeMillis()/1000 ;
		long currentSeconds= totalSeconds%60;
		long totalMins = totalSeconds /60 ;
		long currentMins = totalMins%60;
		long totalHours = totalMins/60;
		long currentHour= ((totalHours%60) + offset)%24;
		

		System.out.println("The current time is "+ currentHour+":"+currentMins+":"+currentSeconds);
		

	}

}

