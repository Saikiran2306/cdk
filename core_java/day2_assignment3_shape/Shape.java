package day2_assignment3_shape;

public class Shape {

	private String name;

	public Shape() {
		super();
	}

	public Shape(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Shape [name=" + name + "]";
	}

}
