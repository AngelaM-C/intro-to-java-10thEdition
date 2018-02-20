package chapter7;
import java.util.Scanner;
public class ChineseZodiac {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String[] zodiac= {"Monkey","Rooster","Dog","Pig","Rat","Ox","Tiger","Rabbit","Dragon","Snake","Horse","Sheep"};
		
		System.out.println("Enter a year");
		
		System.out.println(zodiac[input.nextInt()%12]);
		

	}

}
