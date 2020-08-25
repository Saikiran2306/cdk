package day2_assignment2_student;

public class TestStudents {

	public static boolean search(Student students[], Student student) {
		for (Student obj : students) {
			if (obj instanceof EnggStudent && student instanceof EnggStudent) {

				if (obj.equals(student)) {
					return true;
				}

			}

			else if (obj instanceof BscStudent && student instanceof BscStudent) {
				return true;
			}

			else if (obj instanceof CommerceStudent && student instanceof CommerceStudent) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student students[] = new Student[7];

		students[0] = new EnggStudent("5A1", "Rajesh", "KMIT", "CSE");
		students[1] = new EnggStudent("5A2", "Raghu", "CBIT", "CSE");
		students[2] = new EnggStudent("5A3", "Ram", "MGIT", "ECE");

		students[3] = new BscStudent("9B1", "Prakash", "Anurag", "ComputerScience");
		students[4] = new BscStudent("9B2", "Punit", "Anurag", "Agriculture");

		students[5] = new CommerceStudent("6C1", "Mahesh", "OU", "Finance");
		students[6] = new CommerceStudent("6C2", "Manu", "OU", "Accounts");

		Student cStudent = new CommerceStudent("6C1", "Mahesh", "OU", "Finance");
		Student eStudent = new EnggStudent("5A4", "Ram", "MGIT", "CSE");

		System.out.println(search(students, cStudent));
		System.out.println(search(students, eStudent));

	}

}
