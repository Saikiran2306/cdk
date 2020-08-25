package day2_assignment3_shape;

public class Square extends Shape implements Calculation {

	private double side;

	public Square() {
		super("square");
	}

	public Square(double side) {
		super("square");
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 4*side;
	}

}
