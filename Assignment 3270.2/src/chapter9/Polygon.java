package chapter9;

public class Polygon {
	private int sides;
	private double s;
	private double x;
	private double y;
	
	public Polygon() {
		sides=3;
		s=1;
		x=0;
		y=0;
	}
	public Polygon(int sides, double s) {
		this();
		this.sides=sides;
		this.s=s;
	}
	
	public Polygon(int sides, double s, double x, double y) {
		this(sides,s);
		this.x=x;
		this.y=y;
	}
	public int getSides() {
		return sides;
	}
	public void setSides(int sides) {
		this.sides = sides;
	}
	public double getS() {
		return s;
	}
	public void setS(double s) {
		this.s = s;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public double getPerimeter() {
		return sides*s;
	}
	
	public double getArea() {
		return ((sides * Math.pow(sides, 2))/ (4* Math.tan(Math.PI/sides)));
	}
	
}
