package chapter8;

public class LargestRowAndColumn {

	public static void main(String[] args) {
		int[][] list= new int[4][4];
		
		for(int i=0; i<list.length;i++) {
			for(int j=0;j<list[i].length;j++) {
				list[i][j]=(int)(Math.random()*2);
			}
		}
		
		for(int i=0; i<list.length;i++) {
			for(int j=0;j<list[i].length;j++) {
				System.out.print(list[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("The largest row index is:"+ largestRow(list));
		System.out.println("The largest column index is:"+ largestColumn(list));

	}
	
	public static int largestRow(int[][] list) {
		int maxI=0;
		int max=0;
		for(int i=0;i<list.length;i++) {
			int sum=0;
			for(int j=0;j<list[i].length;j++) {
				sum+= list[i][j];
			}
			if(sum>max) {
				max=sum;
				maxI=i;
		}
	}
		return maxI;
	}
	
	public static int largestColumn(int[][] list) {
		int maxI=0;
		int max=0;
		for(int i=0;i<list.length;i++) {
			int sum=0;
			for(int j=0;j<list[i].length;j++) {
				sum+= list[j][i];
			}
			if(sum>max) {
				max=sum;
				maxI=i;
		}
	}
		return maxI;
	}
}
