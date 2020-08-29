package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.io.EmpIO;
import com.io.EmpIOImpl;
import com.io.EmployeeOperation;
import com.io.EmployeeOperationImpl;
import com.pojo.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmpIO empIO = new EmpIOImpl();
		EmployeeOperation employeeOperation = new EmployeeOperationImpl();
		BufferedReader br = null;
		try {
			while (true) {
				br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println(
						"\n 1. Add new Employee \n 2. Update employee \n 3. Find employee by id  \n 4. Display employees \n 5. Delete employee by id \n 6. Exit \n");
				System.out.println("Enter your choice");
				int no = Integer.parseInt(br.readLine());
				switch (no) {

				case 1:
					employeeOperation.addEmployee(empIO.readFromUser());
					break;

				case 2:
					System.out.println("Enter employee id to update name");
					System.out.println("Enter the id");
					int id = Integer.parseInt(br.readLine());
					System.out.println("Enter the name");
					String name = br.readLine();
					Employee employee = employeeOperation.updateEmployee(id, name);
					if (employee != null) {
						System.out.println("Employee with id " + id + " updated" + "\n" + employee);
					} else {
						System.out.println("Employee with id " + id + " does not exists");
					}
					break;

				case 3:
					System.out.println("Enter the id");
					id = Integer.parseInt(br.readLine());
					employee = employeeOperation.findEmployeeById(id);
					if (employee != null) {
						System.out.println("Employee with id " + id + " exists"+ "\n" + employee);
					} else {
						System.out.println("Employee with id " + id + " does not exists");
					}
					break;

				case 4:
					if(!employeeOperation.findAllEmployees())
					{
						System.out.println("No employee exist");
					}
					break;

				case 5:
					System.out.println("Enter the id");
					id = Integer.parseInt(br.readLine());
					employee = employeeOperation.deleteEmployee(id);
					if (employee != null) {
						System.out.println("Employee deleted");
					} else {
						System.out.println("Employee with id "+id+" does not exists");
					}
					break;
				case 6:
					System.out.println("Exited...");
					System.exit(0);
					break;
				default:
					System.out.println("Entered invalid choice");
					break;
				}
			}

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
