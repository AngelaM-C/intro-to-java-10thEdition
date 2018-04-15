package chapter9;

public class TestRectangle {

	public static void main(String[] args) {
		
		TheRectangleClass r1= new TheRectangleClass(4,40);
		TheRectangleClass r2= new TheRectangleClass(3.5,35.9);
		
		System.out.println("Rectangle 1 width:"+ r1.getWidth());
		System.out.println("Rectangle 1 height:"+ r1.getHeight());
		System.out.println("Rectangle 1 area:"+ r1.getArea());
		System.out.println("Rectangle 1 perimeter:"+ r1.getPerimeter());
		
		
		System.out.println("Rectangle 2 width:"+ r2.getWidth());
		System.out.println("Rectangle 2 height:"+ r2.getHeight());
		System.out.println("Rectangle 2 area:"+ r2.getArea());
		System.out.println("Rectangle 2 perimeter:"+ r2.getPerimeter());
		
	}

}
