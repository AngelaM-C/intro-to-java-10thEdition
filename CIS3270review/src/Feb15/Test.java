package Feb15;

public class Test {
	public static void main(String[]args) {
		
		//create an object 
		CarClass car1 = new CarClass();
		
		//call methods for object
		car1.start();
		car1.stop();
		
		//assign a value to the property
		car1.year=2002;
		
		
		//print an attribute
		System.out.println(car1.year);
		
		
		CarClass car2 = new CarClass(2012, "Grey");
		
		CarClass car3= new CarClass(1995);
		
		CarClass car4= new CarClass(2020, "Orange");
		
		
		System.out.println(CarClass.count);
		
		car1.cleanUp(car1);
		
		System.out.println(CarClass.count);
		
		2car1.color.toUpperCase();
		
		System.out.println(car1.color);
		
}
}