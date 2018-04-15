package chapter9;

public class TestPolygon {

	public static void main(String[] args) {
		Polygon p1= new Polygon();
		Polygon p2= new Polygon(6,4);
		Polygon p3= new Polygon(10,4,5.6,7.8);
		
		System.out.println("p1 Perimeter:"+ p1.getPerimeter());
		System.out.println("p1 Area:"+ p1.getArea());
		System.out.println("p2 Perimeter:"+ p2.getPerimeter());
		System.out.println("p2 Area:"+ p2.getArea());
		System.out.println("p3 Perimeter:"+ p3.getPerimeter());
		System.out.println("p3 Area:"+ p3.getArea());
		

	}

}
