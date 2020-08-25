package inheritance;

public class Employee {

	private int empId;
	private String empName;

	public Employee() {
		super();
		System.out.println("emp");
		empId=101;
		empName="xyz";
	}

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	
	public void display() {
		System.out.println( "Employee [empId=" + empId + ", empName=" + empName + "]");
	}

}
