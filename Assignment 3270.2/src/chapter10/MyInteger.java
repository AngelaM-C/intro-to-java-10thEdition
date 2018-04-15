package chapter10;

public class MyInteger {
	private int value;
	
	public MyInteger(int value) {
		this.value=value;
	}

	public int getValue() {
		return value;
	}
	
	public boolean isEven() {
		if(value/2 ==0)
			return true; 
		return false;
	}
	public boolean isOdd() {
		return !this.isEven();
	}
	
	public boolean isPrime() {
		for(int i= this.value-1 ; i>1; i--) {
			if(this.value/i==0)
				return false;
		}
		return true;
	}
	
	public static boolean isEven(int a) {
		if(a/2 ==0)
			return true; 
		return false;
	}
	
	public static boolean isOdd(int a) {
		return ! MyInteger.isEven(a);
	}
	
	public static boolean isPrime(int a) {
		for(int i= a-1 ; i>1; i--) {
			if(a/i==0)
				return false;
		}
		return true;
	}
	
	public boolean equals(int b) {
		if(this.value == b)
			return true;
		return false;
	}
	
	public boolean equals(MyInteger b) {
		if(this.value== b.getValue())
			return true;
		return false;
	}
	
	public static int parseInt(char[] a) {
		String b="";
		for(int i= 0; i< a.length ; i++) {
			b+= a[i]+"";
		}
		return Integer.valueOf(b);
	}
	
	public static int parseInt(String a) {
		return Integer.valueOf(a);
	}
	
	
}
