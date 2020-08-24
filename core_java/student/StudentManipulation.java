package student;

public class StudentManipulation {

	public Student[] createStudents() {

		Student students[] = new Student[5];
		students[0] = new Student("Raghu", 16, "Intermediate", new int[] { 58, 60, 59, 88, 45, 90 });
		students[1] = new Student("Ram", 15, "Intermediate", new int[] { 68, 78, 59, 88, 45, 90 });
		students[2] = new Student("Rajesh", 15, "Intermediate", new int[] { 98, 88, 79, 88, 85, 90 });
		students[3] = new Student("Ravi", 16, "Intermediate", new int[] { 98, 78, 55, 80, 45, 90 });
		students[4] = new Student("Raju", 15, "Intermediate", new int[] { 98, 78, 77, 88, 45, 87 });
		
		return students;
	}
	
	public int total(Student student)
	{
		int result=0;
		int marks[]=student.getMarks();
		for(int i=0;i<marks.length;i++)
		{
			result+=marks[i];
		}
		return result;
	}
	
	public Student findMax(Student students[])
	{
		int max=Integer.MIN_VALUE;
		Student student=null;
		for(Student obj:students)
		{
			
			if(total(obj)>max)
			{
				max=total(obj);
				student=obj;
			}
		}
		return student;
	}
	

}
