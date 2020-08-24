package student;
import java.util.Arrays;

public class Student {

	private String name;
	private int age;
	private String standard;
	private int marks[];

	public Student(String name, int age, String standard, int[] marks) {

		this.name = name;
		this.age = age;
		this.standard = standard;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public void display() {
		System.out.println("Student [name=" + name + ", age=" + age + ", standard=" + standard + ", marks="
				+ Arrays.toString(marks) + "]");
	}

}
