package chapter13;

public class RectangleComparable extends GeometericObjectClass implements Comparable {
	
	private double width;
	private double height;
	
	public RectangleComparable() {
		this.width=1;
		this.height=1;
	}
	
	public RectangleComparable(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public RectangleComparable(double width, double height, String color, boolean filled){
		this.height=height;
		this.width=width;
		setColor(color);
		setFilled(filled);
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

	@Override
	public int compareTo(Object o) {
		if(getArea() > ((RectangleComparable) o).getArea())
		return 1;
		if(getArea()<((RectangleComparable) o).getArea())
			return-1;
		else return 0;
	}

	@Override
	public double getArea() {
		return height*width;
	}

	@Override
	public double getPerimeter() {
		return (height*2)+(width*2);
	}
	
	

}
