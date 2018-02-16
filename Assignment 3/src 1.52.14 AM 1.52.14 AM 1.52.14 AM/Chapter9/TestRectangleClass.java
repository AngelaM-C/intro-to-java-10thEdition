package Chapter9;

public class TestRectangleClass {
public static void main(String[]args) {
	RectangleClass rectangle1 = new RectangleClass(4,40);
	
	System.out.println("The width of the rectangle is "+ rectangle1.width);
	System.out.println("The height of the rectangle is "+ rectangle1.height);
	System.out.println("The area of the rectangle is "+ rectangle1.getArea());
	System.out.println("The perimeter of the rectangle is "+ rectangle1.getPerimeter());

	RectangleClass rectangle2 = new RectangleClass(3.5,35.9);
	
	System.out.println("The width of the rectangle is "+ rectangle2.width);
	System.out.println("The height of the rectangle is "+ rectangle2.height);
	System.out.println("The area of the rectangle is "+ rectangle2.getArea());
	System.out.println("The perimeter of the rectangle is "+ rectangle2.getPerimeter());

}
}
