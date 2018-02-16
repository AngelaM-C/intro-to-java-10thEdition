package chapter1;

public class PopulationProjection {

	public static void main(String[] args) {
		int secondsYear = 365*24*60*60;
		int births= secondsYear/7;
		int deaths= secondsYear/13;
		int immigrants= secondsYear/45;
		int population=312032486;
		
		for(int i=1; i<6 ;i++) {
			population += births + immigrants - deaths;
			
			System.out.println(" Year "+ i+ " estimated population:"+ population);
			
		}
		

	}

}
