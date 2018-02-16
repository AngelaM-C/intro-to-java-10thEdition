package Chapter9;

public class RectangleClass {
	
	public double width=1;
	public double height=1;
	
	public RectangleClass() {
	
	}
	
	
	public RectangleClass(double w , double h) {
		width =w;
		height=h;
	}
	
	
	public double getArea() {
		double area = width*height;
		return area;
		
	}
	
	public double getPerimeter() {
		double perimeter = (width*2)+(height*2);
		return perimeter;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
