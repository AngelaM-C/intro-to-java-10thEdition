package chapter13;

public abstract class GeometericObjectClass implements Comparable {
	private String color;
	private boolean filled;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
	public static GeometericObjectClass max(GeometericObjectClass a, GeometericObjectClass b) {
		if(a.getArea() > b.getArea())
			return a;
		return b;
	}
	
	public int compareTo(Object o) {
		if(getArea() > ((GeometericObjectClass) o).getArea())
			return 1;
		if(getArea()< ((GeometericObjectClass) o).getArea())
			return-1;
		else return 0;
	}
	
	
	
	
	
}
