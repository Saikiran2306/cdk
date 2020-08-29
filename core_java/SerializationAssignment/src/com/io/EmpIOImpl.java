package com.io;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.pojo.Address;
import com.pojo.Employee;

public class EmpIOImpl implements EmpIO {

	@Override
	public void addToFile(List<Employee> employees) {
		// TODO Auto-generated method stub
		try (FileOutputStream fo = new FileOutputStream("mydata.txt");
				ObjectOutputStream oo = new ObjectOutputStream(fo);) {

			for(Employee e:employees)
			oo.writeObject(e);

		}

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<Employee> readFromFile() {
		List<Employee> employees = new ArrayList<>();
		if (!new File("mydata.txt").exists()) {
			try (FileOutputStream fo = new FileOutputStream("mydata.txt");
					ObjectOutputStream oo = new ObjectOutputStream(fo);) {
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		else {
			try (FileInputStream fi = new FileInputStream("mydata.txt");
					ObjectInputStream oi = new ObjectInputStream(fi);) {
			      Object obj= oi.readObject();
			      while(obj!=null)
			      {
			    	  employees.add((Employee)obj);
			    	  obj= oi.readObject();
			    	  
			      }
			}

			catch (EOFException e) {
				// TODO Auto-generated catch block
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return employees;
	}

	@Override
	public Employee readFromUser() {
		Employee employee = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter the employee information");
			System.out.println("Enter employee id");
			int id = Integer.parseInt(br.readLine());
			System.out.println("Enter employee name");
			String name = br.readLine();
			System.out.println("Enter the employee address");
			System.out.println("Enter the city");
			String city = br.readLine();
			System.out.println("Enter the state");
			String state = br.readLine();
			System.out.println("Enter the pincode");
			long pincode = Long.parseLong(br.readLine());
			employee = new Employee(id, name, new Address(city, state, pincode));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public void displayToUser(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println(emp);

	}

}
