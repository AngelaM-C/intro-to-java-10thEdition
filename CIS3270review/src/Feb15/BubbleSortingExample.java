package Feb15;

public class BubbleSortingExample {
	public static void main(String[]args) {
		int[] list = {5,4,6,8,9,1};
		
		
		for (int i=0; i< list.length; i++) {
			
	
		for(int j =0 ; j <list.length-1-i ; j++) {
			if(list[j]>list[j+1]) {
			
			int temp = list[j];
			list[j]= list[j+1];
			list[j+1]= temp;

		}
	}	
		
		
		
	}
	
	
  }	
}
