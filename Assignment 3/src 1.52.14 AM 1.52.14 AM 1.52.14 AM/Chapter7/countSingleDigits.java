package Chapter7;

public class countSingleDigits {
public static void main(String[]args) {
	int[] count= new int[10];
	int num=0;
	
	for(int i= 0 ; i< 100; i++) {
	  num= (int) (Math.random()*10);
	  count[num]++;
	}
	
	for(int i=0 ; i< count.length;i++) {
		System.out.println("There are "+ count[i]+ " "+ i +"'s");
		
	}
}
}
