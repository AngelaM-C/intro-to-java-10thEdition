package midtermReview;

public class bubbleSort {

	public static void main(String[] args) {
		int array[]= {7, 9, 2, 3};
		
		bubbleSort(array);
		for(int num : array)
			System.out.print(num+" ");

	}
	
	public static void bubbleSort(int[]a) {
		for(int i=a.length-1; i>=0;i--) {
			int maxI=i;
			for (int j=0; j<i;j++) {
				if(a[j]>a[maxI]) {
					maxI=j;
					
					int temp=a[maxI];
					a[maxI]=a[i];
					a[i]=temp;
				}
			}
		}
	}

}
