package day2_assignment3_shape;

public class Rectangle extends Shape implements Calculation {

	private double length;
	private double breadth;

	public Rectangle() {
		super("rectangle");
	}

	public Rectangle(double length, double breadth) {
		super("rectangle");
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length * breadth;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * (length + breadth);
	}

}
