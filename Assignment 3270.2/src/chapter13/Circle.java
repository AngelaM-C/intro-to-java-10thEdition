package chapter13;

public class Circle extends GeometericObjectClass {
	
	private double radius;
	
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.pow(Math.PI*radius, 2);
	}


	@Override
	public double getPerimeter() {
		return 0;
	}

	
}
