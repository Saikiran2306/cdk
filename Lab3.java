package Test;

import java.util.Scanner;

class Employee
{
	private  int empno;
	private String ename;
	private double salary;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void displayEmployees(Employee emp[])
	{
		System.out.println("S.no Eno Ename Salary");
		for(int i=0;i<emp.length;i++)
		{
			System.out.println((i+1)+" "+emp[i].getEmpno()+" "+emp[i].getEname()+" "+emp[i].getSalary());
		}
	}
	
	
}

public class Lab3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee employee[]=new Employee[2];
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter employee "+(i+1)+" details");
			employee[i]=new Employee();
			
			System.out.println("Enter employee no");
			employee[i].setEmpno(sc.nextInt());
			
			System.out.println("Enter employee name");
			employee[i].setEname(sc.next());
			
			System.out.println("Enter employee salary");
			employee[i].setSalary(sc.nextDouble());
		}
		
		System.out.println("Displaying Employees");
		Employee emp=new Employee();
		emp.displayEmployees(employee);

	}

}
