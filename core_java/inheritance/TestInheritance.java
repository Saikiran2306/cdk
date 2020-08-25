package inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		WageEmployee w=new WageEmployee();
//		w.display();
		
//		WageEmployee w1=new WageEmployee(101,"suresh",201,10);
//		w1.display();
		
		SalariedEmployee s=new SalariedEmployee(101,"suresh",1000,500,800);
		s.display();
		System.out.println("Total salary = "+  s.totalSalary());

	}

}
