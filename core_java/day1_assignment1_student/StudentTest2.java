package day1_assignment1_student;
public class StudentTest2 {
	
	public static void main(String[] args) {
		
		Student students[]=new Student[5];
		students[0]=new Student("Raghu",16,"Intermediate",new int[]{58,60,59,88,45,90});
		students[1]=new Student("Ram",15,"Intermediate",new int[]{68,78,59,88,45,90});
		students[2]=new Student("Rajesh",15,"Intermediate",new int[]{98,88,79,88,85,90});
		students[3]=new Student("Ravi",16,"Intermediate",new int[]{98,78,55,80,45,90});
		students[4]=new Student("Raju",15,"Intermediate",new int[]{98,78,77,88,45,87});
		
		for(Student obj:students)
		{
			obj.display();
		}
		
	}

}
