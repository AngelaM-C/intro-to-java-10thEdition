package midtermReview;

public class IndexOf {

	public static void main(String[] args) {
		String str1="to Java";
		String str2= "Welcome to Java";
		
		System.out.println(iOf(str1,str2));
	}
	
	public static int iOf(String a, String b) {
		int index=-1;
		
		for(int i=0, j=0; i<b.length();i++) {
			if(b.charAt(i)== a.charAt(j)) {
				if(j==0)
					index=i;
				j++;
			}
				else {
					index=-1;
					i=i-j;
					j=0;
				}
				if(j==a.length() -1) {
					return index;
				}
				
			}
		return index;
	}

}
