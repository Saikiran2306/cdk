package com.io;

import java.util.ArrayList;
import java.util.List;

import com.pojo.Employee;

public class EmployeeOperationImpl implements EmployeeOperation {

	EmpIO empIO = null;

	EmployeeOperation employeeOperation = null;

	@Override
	public boolean addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		empIO = new EmpIOImpl();
		List<Employee> employees = empIO.readFromFile();
		employees.add(employee);
		empIO.addToFile(employees);
		return true;
	}

	@Override
	public Employee updateEmployee(int id, String name) {
		// TODO Auto-generated method stub
		empIO = new EmpIOImpl();
		Employee e = null;
		List<Employee> employees = empIO.readFromFile();
		for (Employee employee : employees) {
			if (employee.getEmpId() == id) {
				employee.seteName(name);
				e = employee;
				break;
			}
		}
		empIO.addToFile(employees);
		return e;
	}

	@Override
	public Employee deleteEmployee(int id) {
		// TODO Auto-generated method stub
		empIO = new EmpIOImpl();
		Employee e = null;
		List<Employee> employees = empIO.readFromFile();
		for (Employee employee : employees) {
			if (employee.getEmpId() == id) {
				e = employee;
				break;
			}
		}

		if (employees.contains(e)) {
			employees.remove(e);
		}

		empIO.addToFile(employees);
		return e;
	}

	@Override
	public Employee findEmployeeById(int id) {
		// TODO Auto-generated method stub
		empIO = new EmpIOImpl();
		Employee e = null;
		List<Employee> employees = empIO.readFromFile();
		for (Employee employee : employees) {
			if (employee.getEmpId() == id) {
				e = employee;
				break;
			}
		}
		return e;
	}

	@Override
	public boolean findAllEmployees() {
		// TODO Auto-generated method stub
		empIO = new EmpIOImpl();
		boolean flag = false;
		List<Employee> employees = empIO.readFromFile();
		for (Employee employee : employees) {
			flag = true;
			empIO.displayToUser(employee);
		}
		return flag;

	}

}
