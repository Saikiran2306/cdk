package Assignment;

import java.util.Scanner;

class Employee {
	private int empno;
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

}

class EmpManager {
	int count = 10, total = 0;
	private Employee emp[] = new Employee[count];

	public void create(Employee e) {
		emp[total] = e;
		total++;
	}

	public void update(int item, Employee e) {
		emp[item] = e;
	}

	public void delete(int empno) {
		int index = -1;
		for (int i = 0; i < total; i++) {
			if (emp[i].getEmpno() == empno) {
				index = i;
				break;
			}
		}

		if (index != -1) {
			if (index != total) {
				for (int i = index; i < total - 1; i++) {
					emp[i] = emp[i + 1];
				}
			}
			total--;
		} else {
			System.out.println("Emplouee does not exist");
		}
	}

	public void list() {
		System.out.println("Listing of Employes");
		System.out.println("S.no Eno Ename Salary");
		for (int i = 0; i < total; i++) {
			System.out.println((i + 1) + " " + emp[i].getEmpno() + " " + emp[i].getEname() + " " + emp[i].getSalary());
		}
	}

}

public class EmployeeManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmpManager empManager = new EmpManager();
		while (true) {

			System.out.println(
					"\n 1. Create Employee \n 2. Update Employee \n 3. Delete Employee \n 4 List Employee \n 5. Exit \n");
			System.out.println("Enter a number");
			int no = sc.nextInt();
			switch (no) {
			case 1:
				Employee emp = new Employee();

				System.out.println("Enter employee no");
				emp.setEmpno(sc.nextInt());

				System.out.println("Enter employee name");
				emp.setEname(sc.next());

				System.out.println("Enter employee salary");
				emp.setSalary(sc.nextDouble());

				empManager.create(emp);
				break;

			case 2:
				System.out.println("Enter a number to update employee");
				no = sc.nextInt();

				emp = new Employee();

				System.out.println("Enter employee no");
				emp.setEmpno(sc.nextInt());

				System.out.println("Enter employee name");
				emp.setEname(sc.next());

				System.out.println("Enter employee salary");
				emp.setSalary(sc.nextDouble());

				empManager.update(no - 1, emp);
				break;

			case 3:
				System.out.println("Enter empno to delete that employee");
				no = sc.nextInt();
				empManager.delete(no);
				break;

			case 4:
				empManager.list();
				break;
			case 5:
				System.out.println("Exiting ...");
				System.exit(0);
				break;

			}
		}

	}
}
