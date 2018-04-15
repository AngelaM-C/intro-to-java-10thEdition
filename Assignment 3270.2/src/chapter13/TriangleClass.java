package chapter13;

import java.util.Scanner;
import chapter11.Triangle;

public class TriangleClass extends GeometericObjectClass {
	private double side1;
	private double side2;
	private double side3;
	
	public TriangleClass() {
		super();
		this.side1=1;
		this.side2=1;
		this.side3=1;
	}
	
	public TriangleClass(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	
	public double getArea() {
		double s= (side1 +side2+side3)/2;
		
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	
	public double getPerimeter() {
		return side1+ side2+side3;
	}
	
	public String toString() {
		return "Triangle: side 1="+ side1 +" side2 ="+ side2+ " side3 ="+side3;
	}
	
	//TEST PROGRAM
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter 3 sides of a triangle:");
		
		Triangle t1= new Triangle(input.nextDouble(), input.nextDouble(),input.nextDouble());
		
		System.out.println("Enter a color and a boolean value to indicae whether the triangle is filled:");
		
		t1.setColor(input.next());
		t1.setFilled(input.nextBoolean());
		
		System.out.println("Area: "+ t1.getArea()+"\nPerimeter: "+ t1.getPerimeter()+"\nColor: "+ t1.getColor()+"\nFilled:" + t1.isFilled());
		
		
		
	}
	
	
}
