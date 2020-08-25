package day2_assignment3_shape;

public class TestShape {
	
	public static void main(String[] args) {
		
		Calculation circle=new Circle(10);
		System.out.println("Area of circle is "+circle.area());
		System.out.println("Perimeter of circle is "+circle.perimeter());
		System.out.println();
		
		Calculation rectangle=new Rectangle(9.5,5);
		System.out.println("Area of rectangle is "+rectangle.area());
		System.out.println("Perimeter of rectangle is "+rectangle.perimeter());
		System.out.println();
		
		Calculation square=new Square(5.5);
		System.out.println("Area of square is "+square.area());
		System.out.println("Perimeter of square is "+square.perimeter());
	}

}
