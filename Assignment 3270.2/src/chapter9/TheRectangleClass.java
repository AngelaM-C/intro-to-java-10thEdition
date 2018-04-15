package chapter9;

public class TheRectangleClass {
	private double width;
	private double height;
	
	public TheRectangleClass() {
		this.width=1;
		this.height=1;
	}
	
	public TheRectangleClass(double width, double height) {
		this.width=width;
		this.height=height;
	}
	
	public double getPerimeter() {
		return (width*2) + (height*2);
	}
	
	public double getArea() {
		return width*height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
}
