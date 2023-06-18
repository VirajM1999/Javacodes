package com.emp.tester;

import java.util.HashMap;
import java.util.Scanner;

import com.emp.core.Department;
import com.emp.core.Employee;
import com.emp.io.EmpIO;
import com.emp.validation.*;

public class Tester {

	public static void main(String[] args) {

		int choice = -1;
		boolean exit = false;
		try {
			HashMap<Integer, Employee> emp = EmpIO.deSerializeemp("backup.ser");

			Scanner sc = new Scanner(System.in);

			while (!exit) {
				System.out.println("\n1. Add Employee \n2. Display Employees  \n3. Retrieve Employee Details by emp id "
						+ "\n4. Delate Employee Details \n5. Sort Employees based on salary from perticular Department "
						+ "\n6. Give Increment To Employee "
						+ "\n0. Exit \nEnter Choice ::");

				try {
					choice = sc.nextInt();
					switch (choice) {
					case 1: {
						System.out.println("Enter id");
						Integer id = sc.nextInt();
						EmployeeValidity.isIdDuplicate(emp, id);
						System.out.println("Enter Employee Details: name salary address department");
						emp.put(id, new Employee(id, sc.next(), sc.nextDouble(), sc.next(),
								Department.valueOf(sc.next().toUpperCase())));
						System.out.println("Employee Added Successfully!!!!");
						break;
					}
					case 2: {
						for (Employee e : emp.values())
							System.out.println(e);
						break;
					}
					case 3: {
						System.out.println("Enter Employee Id To retrive Data::");
						Integer id = sc.nextInt();
						EmployeeValidity.isIdValid(emp, id);
						System.out.println(emp.get(id));
						break;
					}
					case 4: {
						System.out.println("Enter Employee Id To Delete::");
						Integer id = sc.nextInt();
						EmployeeValidity.isIdValid(emp, id);
						emp.remove(id);
						System.out.println("Employee Deleted!!!!");
						break;
					}
					case 5: {
						System.out.println("Enter Department::");
				        Department dpt = Department.valueOf(sc.next().toUpperCase());
						emp.values()
						.stream()
						.filter(p->{return p.getDept()==dpt && p.getSalary()>=10000 && p.getSalary()<=50000;})
						.sorted((a,b)->((Double)a.getSalary()).compareTo(b.getSalary()))
						.forEach(System.out::println);
						
						
						break;
					}
					
					case 6: {
						System.out.println("Enter Employee Id be given Increment::");
						Integer id = sc.nextInt();
						EmployeeValidity.isIdValid(emp, id);
						System.out.println("Enter Increment percentage::");
						double incr= sc.nextDouble()/100;
						emp.get(id).setSalary(emp.get(id).getSalary()+emp.get(id).getSalary()*incr);;
						System.out.println("Employee given increment!!!!");
						break;
					}
					case 0: {
						exit = true;

						EmpIO.serializeEmp(emp, "backup.ser");
						System.out.println("Data Backup Successfull!!!");
						break;
					}
					}
				} catch (Exception e) {
					System.out.println(e);
				}

			}
			sc.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
