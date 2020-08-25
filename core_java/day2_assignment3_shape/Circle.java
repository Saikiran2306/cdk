package day2_assignment3_shape;

public class Circle extends Shape implements Calculation {

	private double radius;

	public Circle() {
		super("circle");
	}

	public Circle(double radius) {
		super("circle");
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*3.14*radius;
	}

}
