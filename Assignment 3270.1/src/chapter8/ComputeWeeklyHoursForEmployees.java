package chapter8;

public class ComputeWeeklyHoursForEmployees {

	public static void main(String[] args) {
		int[][] workHours= {{2,4,3,4,5,8,8},
						    {7,3,4,3,3,4,4},
						    {3,3,4,3,3,2,2},
						    {9,3,4,7,3,4,1},
						    {3,5,4,3,6,3,8},
						    {3,4,4,6,3,4,4},
						    {3,7,4,8,3,8,4},
						    {6,3,5,9,2,7,9}};
		
		
		int[][] sumOfRows=sumRows(workHours);
		
		maxSortColumn(sumOfRows);
		
		for(int i=0;i<sumOfRows.length;i++) {
			
			System.out.println("Employee "+ sumOfRows[i][1] + " total weekly hours are: "+ sumOfRows[i][0]);
			
		}
						    
		}
	
	public static int[][] maxSortColumn(int[][] list){
	
		for(int i=0; i<list.length-1;i++) {
			int currentMax= list[i][0];
			int maxIndex=i;
			
			for(int j=i+1; j<list.length;j++) {
				if(currentMax<list[j][0]) {
					maxIndex=j;
					currentMax=list[j][0];
				}
				}
			if(maxIndex !=i) {
				list[maxIndex][0]=list[i][0];
				list[i][0]=currentMax;
				list[maxIndex][1]=list[i][1];
				list[i][1]=maxIndex;
			}
		
	}
	return list;
}
	public static int[][] sumRows(int[][] list) {
		int[][] sumAndIndexes=new int[list.length][2];
		for(int i=0;i<list.length;i++) {
			int sum=0;
			for(int j=0; j<list[i].length;j++) {
				sum+=list[i][j];
			}
			sumAndIndexes[i][0]=sum;
			sumAndIndexes[i][1]=i;
			
		}
		return sumAndIndexes;
	}
	
}
