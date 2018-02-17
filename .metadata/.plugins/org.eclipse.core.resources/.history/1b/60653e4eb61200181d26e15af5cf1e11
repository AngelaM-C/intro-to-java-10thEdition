package chapter4;

public class EstimateAreas {
	public static void main(String[]args) {
		final double RADIUS = 6371.01;
		// 1 is ATL 2=CHARLOTTE 3=SAVANNAH 4=ORLANDO
		double x1= Math.toRadians(33.72427);
		double y1= Math.toRadians(-84.578579);
		double x2 = Math.toRadians(35.2270869);
		double y2= Math.toRadians(-80.84312669);
		double x3= Math.toRadians(32.0835407);
		double y3= Math.toRadians(-81.09983419);
		double x4 = Math.toRadians(28.5383355);
		double y4= Math.toRadians(-81.37923649);
		
		// d12= distance between (x1,y1) & (x2,y2) etc...
		double d12= RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1-y2));
		double d23= RADIUS * Math.acos(Math.sin(x2) * Math.sin(x3) + Math.cos(x2) * Math.cos(x3) * Math.cos(y2-y3));
		double d34= RADIUS * Math.acos(Math.sin(x3) * Math.sin(x4) + Math.cos(x3) * Math.cos(x4) * Math.cos(y3-y4));
		double d41= RADIUS * Math.acos(Math.sin(x4) * Math.sin(x1) + Math.cos(x4) * Math.cos(x1) * Math.cos(y4-y1));
		double d42= RADIUS * Math.acos(Math.sin(x2) * Math.sin(x4) + Math.cos(x2) * Math.cos(x4) * Math.cos(y2-y4));
		
		double s124= (d12 + d42 + d41)/2;
	    double s234= (d42+ d34 + d23)/2;
		
		//area124 is area between (x1,y1) ,(x2&y2) & (x4,y4)
		double area124=Math.sqrt(s124*(s124-d12)*(s124-d42)*(s124-d41));
		
		//area234 is area between (x2,y2) ,(x3&y3) & (x4,y4)
		double area234=Math.sqrt(s234*(s234-d42)*(s234-d34)*(s234-d23));
		
		double totalArea= area124 + area234;
		
		System.out.println(area124 + " "+ area234);
		
		System.out.printf("The estimated area enclosed by Atlanta,GA; Charlotte,NC; Savannah,GA; and Orlando,FL is: %.2f km^2 ", totalArea);
				
		
	}
}
