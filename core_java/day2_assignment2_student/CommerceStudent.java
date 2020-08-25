package day2_assignment2_student;

public class CommerceStudent extends Student {

	private String majorsubject;

	public CommerceStudent() {
		super();
	}

	public CommerceStudent(String rollNo, String name, String collegeName, String majorsubject) {
		super(rollNo, name, collegeName);
		this.majorsubject = majorsubject;
	}

	public String getMajorsubject() {
		return majorsubject;
	}

	public void setMajorsubject(String majorsubject) {
		this.majorsubject = majorsubject;
	}

	public boolean eauals(Object o) {
		CommerceStudent c1 = (CommerceStudent) o;
		if (c1.getRollNo().equals(this.getRollNo()) && c1.getName().equals(this.getName())
				&& c1.getCollegeName().equals(this.getCollegeName())
				&& c1.getMajorsubject().equals(this.getMajorsubject())) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "CommerceStudent [majorsubject=" + majorsubject + "]";
	}

}
