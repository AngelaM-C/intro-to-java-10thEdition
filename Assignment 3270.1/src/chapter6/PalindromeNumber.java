package chapter6;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome(232));
	}
	
	public static int reversal(int number) {
		String num = number+"";
		String rev="";
		
		for(int i=0; i<num.length();i++) {
			rev+= num.charAt(num.length()-1-i)+"";
		}
		return Integer.parseInt(rev); 
		
	}
	
	public static boolean isPalindrome(int number) {
		return reversal(number)== number;
	}
}