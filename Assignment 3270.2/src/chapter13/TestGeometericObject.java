package chapter13;
import chapter13.Circle;
import chapter13.Rectangle;
public class TestGeometericObject {

	public static void main(String[] args) {
		Circle c1= new Circle(2.0);
		Circle c2= new Circle(3.0);
		
		Rectangle r1= new Rectangle(1.5,3);
		Rectangle r2= new Rectangle(2,4);
		
		GeometericObjectClass.max(r1,r2);
		GeometericObjectClass.max(c1,c2);
		
		
		
		

	}

}
