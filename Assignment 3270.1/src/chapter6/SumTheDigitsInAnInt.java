package chapter6;

public class SumTheDigitsInAnInt {

	public static void main(String[] args) {
	
		int sum= sumDigits(5436);
		System.out.println(sum);

	}

	public static int sumDigits(long n) {
		int sum=0;
		
		while(n>0) {
			sum+=n%10;
			n=n/10;
		}
		
		return sum;
		
	}
}
