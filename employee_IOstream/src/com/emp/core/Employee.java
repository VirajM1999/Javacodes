package com.emp.core;

import java.io.Serializable;

public class Employee implements Serializable{

	private Integer id;
	private String name;
	private double salary;
	private String address;
	private Department dept;
	
	
	public Employee(Integer id, String name, double salary, String address, Department dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + ", dept="
				+ dept + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Department getDept() {
		return dept;
	}


	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	
	
	
}
