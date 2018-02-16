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
		car1.color="Blue";
		
		//print an attribute
		System.out.println(car1.year);
		
		
		CarClass car2 = new CarClass(2012, "Grey");
		
		CarClass car3= new CarClass(1995);
		
		CarClass car4= new CarClass(2020, "Orange");
		
		
		BMI b1= new BMI("Tom",100,100);
		
		BMI b2= new BMI("Sarah",80,80);
		
		b1.printBMI();
		b2.printBMI();
		
}
}