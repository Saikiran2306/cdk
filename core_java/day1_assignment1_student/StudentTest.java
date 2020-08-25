package day1_assignment1_student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentManipulation sm=new StudentManipulation();
		Student students[]=sm.createStudents();
		
		for(int i=0;i<students.length;i++)
		{
			System.out.println("Total marks of student "+(i+1)+" is "+sm.total(students[i]));
		}
		
		System.out.println("Maximum marks of student is ");
		Student stu=sm.findMax(students);
		stu.display();
		

	}

}
