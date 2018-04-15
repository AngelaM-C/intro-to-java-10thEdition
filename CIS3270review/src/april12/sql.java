package april12;

public class sql {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int c;
		
		//step1: open connection to database
		//step2:
		
		try {
			c = a / b;
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			//step3: close the channel 
		}

	}
	


}
