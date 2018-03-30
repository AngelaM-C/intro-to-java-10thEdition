package Feb15;

public class CarClass {
	
//create attributes
	public int year;
	public String color;
	private Object i;
	public static int count=0;
	
	
	
	//create constructor, constructor methods do not have a return type and name matches class name
	public CarClass() {
		year=2012;
		color= "Black";
		count++;
	}
	
	
	public CarClass(int y, String c) {
		year=y;
		color=c;
		count++;
	}
	
	public CarClass(int y) {
		year= y;
		color="Green";
		count++;
		
	}
	//create method... without static
	
	public void cleanUp(CarClass i) {
		this.i = null;
		count--;
	}
	public void start() {
		
		System.out.println("Car is starting.");
	}
	
	public void stop() {
		
		System.out.println("Car is stopping.");
	}
	
	public void setColor(String c) {
		color=c;
	}
	
	
	
	

}