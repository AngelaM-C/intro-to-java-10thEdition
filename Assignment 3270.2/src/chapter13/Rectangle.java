package chapter13;

public class Rectangle extends GeometericObjectClass {
	
	private double length;
	private double height;
	
	public Rectangle(double length, double height) {
		super();
		this.length = length;
		this.height = height;
	}

	public double getArea() {
		return length*height;
	}
	
	public double getPerimeter() {
		return(length*2)+(height*2);
	}

	
	
	
	
}
