package day2_assignment3_shape;

public class TestShape {

	public static void main(String[] args) {

		Calculation shape;

		shape = new Circle(10);
		System.out.println("Area of circle is " + shape.area());
		System.out.println("Perimeter of circle is " + shape.perimeter());
		System.out.println();

		shape = new Rectangle(9.5, 5);
		System.out.println("Area of rectangle is " + shape.area());
		System.out.println("Perimeter of rectangle is " + shape.perimeter());
		System.out.println();

		shape = new Square(5.5);
		System.out.println("Area of square is " + shape.area());
		System.out.println("Perimeter of square is " + shape.perimeter());
	}

}
