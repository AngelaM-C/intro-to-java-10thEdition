package midtermReview;

public class sumSeries {

	public static void main(String[] args) {
		int n=50000;
		double sum=0;
		
		for(double i=1; i<99;i=i+2) {
			sum+= (i/(i+2));
			}
		
		System.out.println(sum);
	}

}
