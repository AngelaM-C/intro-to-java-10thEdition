package chapter5;

public class DisplayFourPatterns {
	public static void main(String[]args) {
		
		System.out.println("Pattern A");
		
		for(int i=1; i<=6;i++) {
			for(int j =1; j<=i; j++)
				System.out.print(j+" ");
			System.out.println();
		}
		
		System.out.println("Pattern B");
		
		for(int i=6; i>=1;i--) {
			for(int j =1; j<=i; j++ )
				System.out.print(j+" ");
			System.out.println();
		}
		
		System.out.println("Pattern C");
		
		for(int row= 1; row <=6; row++) {
			
		for(int column=6; column-row >= 1; column--) 
				System.out.printf("%2s"," " );
			for(int num= row ; num>=1 ; num--)
				System.out.printf("%2d", num);
		System.out.println();
		}
		
		System.out.println("Pattern D");
		
		for(int row=6; row>=1;row--) {
			for(int column= 6; column-row >=1; column--)
				System.out.printf("%2s", " ");
			for(int num= 1; num <= row ;num++)
				System.out.printf("%2d", num);
			System.out.println();
		}
		
		
	}
}
