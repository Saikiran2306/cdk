package day2_assignment1_inheritance;

public class WageEmployee extends Employee {

	private int wages;
	private int noOfHours;

	public WageEmployee() {
		super();
		System.out.println("wage");
		wages = 200;
		noOfHours = 8;
	}

	public WageEmployee(int empId, String empName, int wages, int noOfHours) {

		super(empId,empName);

		this.wages = wages;
		this.noOfHours = noOfHours;
	}

	public int getWages() {
		return wages;
	}

	public void setWages(int wages) {
		this.wages = wages;
	}

	public int getNoOfHours() {
		return noOfHours;
	}

	public void setNoOfHours(int noOfHours) {
		this.noOfHours = noOfHours;
	}

	public void display() {
		super.display();
		System.out.println("WageEmployee [wages=" + wages + ", noOfHours=" + noOfHours + "]");
	}

}
