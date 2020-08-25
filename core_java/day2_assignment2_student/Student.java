package day2_assignment2_student;

public class Student {

	private String rollNo;
	private String name;
	private String collegeName;

	public Student() {
		super();
	}

	public Student(String rollNo, String name, String collegeName) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.collegeName = collegeName;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", collegeName=" + collegeName + "]";
	}

}
