package chapter11;
import java.util.Scanner;
public class TestTriangle {

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
