package chapter3;

public class PickACard {
	public static void main(String[]args) {
		int num = (int)(Math.random()*13)+1;
		int numSuit= (int)(Math.random()*4)+1;
		String rank="";
		String suit="";
		
		switch(num) {
		case 1: rank= "Ace";
		break;
		case 2: rank= "2";
		break;
		case 3: rank= "3";
		break;
		case 4: rank= "4";
		break;
		case 5: rank= "5";
		break;
		case 6: rank= "6";
		break;
		case 7: rank= "7";
		break;
		case 8: rank= "8";
		break;
		case 9: rank= "9";
		break;
		case 10: rank= "10";
		break;
		case 11: rank= "Jack";
		break;
		case 12: rank= "Queen";
		break;
		case 13: rank= "King";
		
		}
		
		switch(numSuit) {
		case 1: suit="Clubs";
		break;
		case 2: suit="Diamonds";
		break;
		case 3: suit="Hearts";
		break;
		case 4: suit="Spades";
		}
		
		System.out.println("The card you picked is "+rank+" of "+ suit);
	}
}
