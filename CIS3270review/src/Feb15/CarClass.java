package Feb15;

public class CarClass {
	
//create attributes
	public int year;
	public String color;
	
	//create constructor, constructor methods do not have a return type and name matches class name
	public CarClass() {
		year=2012;
		color= "Black";
	}
	
	public CarClass(int y, String c) {
		year=y;
		color=c;
	}
	
	public CarClass(int y) {
		year= y;
		color="Green";
		
	}
	//create method... without static
	public void start() {
		
		System.out.println("Car is starting.");
	}
	
	public void stop() {
		
		System.out.println("Car is stopping.");
	}
	
	
	
	

}