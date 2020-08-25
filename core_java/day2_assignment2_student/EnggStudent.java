package day2_assignment2_student;

public class EnggStudent extends Student {

	private String stream;

	public EnggStudent() {
		super();
	}

	public EnggStudent(String rollNo, String name, String collegeName, String stream) {
		super(rollNo, name, collegeName);
		this.stream = stream;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public boolean eauals(Object o) {
		EnggStudent e1 = (EnggStudent) o;
		if (e1.getRollNo().equals(this.getRollNo()) && e1.getName().equals(this.getName())
				&& e1.getCollegeName().equals(this.getCollegeName()) && e1.getStream().equals(this.getStream())) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "EnggStudent [stream=" + stream + "]";
	}

}
