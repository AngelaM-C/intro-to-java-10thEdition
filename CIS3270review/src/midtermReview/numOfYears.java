package midtermReview;

public class numOfYears {

	public static void main(String[] args) {
		int mins=1000000000;
		
		int totaldays=mins/(24*60);
		int year= totaldays/365;
		int days= (totaldays%365);
		
		System.out.println(year+" "+ days);
	}

}
