package chapter6;

public class UseisPrime {

	public static void main(String[] args) {
		int count=0;
		
		for(int i=1; i<10000;i++) {
			if(isPrime(i)) 
				count++;
		}
		System.out.println(count);
		
	}

	public static boolean isPrime(int num) {
		for(int i =2; i<num;i++) {
			if(num%i==0)
				return false;
		}
		
		return true;
	}
}
