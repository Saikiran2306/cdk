package com.pojo;

import java.io.Serializable;

public class Employee implements Serializable {

	private int empId;
	private String eName;
	private Address address;

	public Employee() {
		super();
	}

	public Employee(int empId, String eName, Address address) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public boolean equals(Object obj) {
		
		if(!(obj instanceof Employee))
		{
			return false;
		}
		Employee e=(Employee)obj;
		return this.getEmpId()==e.getEmpId();
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", eName=" + eName + ", address=" + address + "]";
	}

}
