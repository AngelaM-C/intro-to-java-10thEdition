package midtermReview;

public class Time {
public static void main(String[]args) {
	long totalSec= System.currentTimeMillis()/1000;
	long currentSec= totalSec%60;
	long totalMins= totalSec/60;
	long currentMins= totalMins%60;
	long totalHours= totalMins/60;
	long currentHours= (totalMins%60)%24;
	
	

	
	System.out.println(currentHours +" "+ currentMins+" "+currentSec);
	
	
	
}
	

}
