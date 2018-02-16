package chapter3;
import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int num = (int)(Math.random() * 3);
		String pc= "";
		String user="";
		
		System.out.println("scissor(0) , rock(1), paper(2):");
		
		int userNum= input.nextInt();
		
		switch(userNum) {
		case 0: user=" scissor";
		break;
		case 1: user=" rock ";
		break;
		case 2: user=" paper ";
		break;
		default: System.out.println("Invalid input");
		return; 
		}
		
		switch(num) {
		case 0: pc=" scissor.";
		break;
		case 1: pc=" rock.";
		break;
		case 2: pc=" paper.";
		
		}
		
		if(num == userNum) {
			System.out.println("The computer is"+ pc+" You are"+ user + "too. It is a draw.");
		} else if ((userNum == 0 && num == 2)|| (userNum == 1 && num == 0)||(userNum== 2 && num==1)) {
			System.out.println("The computer is"+ pc+" You are"+ user + ". You Won!");
		} else {
			System.out.println("The computer is"+ pc+" You are"+ user + ". Sorry you lost.");
		}

	}

}
