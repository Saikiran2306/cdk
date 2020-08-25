package day2_assignment2_student;

public class BscStudent extends Student {

	private String specialization;

	public BscStudent() {
		super();
	}

	public BscStudent(String rollNo, String name, String collegeName, String specialization) {
		super(rollNo, name, collegeName);
		this.specialization = specialization;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public boolean eauals(Object o) {
		BscStudent b1 = (BscStudent) o;
		if (b1.getRollNo().equals(this.getRollNo()) && b1.getName().equals(this.getName())
				&& b1.getCollegeName().equals(this.getCollegeName())
				&& b1.getSpecialization().equals(this.getSpecialization())) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "BscStudent [specialization=" + specialization + "]";
	}

}
