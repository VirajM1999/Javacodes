package com.emp.validation;

import java.util.HashMap;

import com.emp.core.Employee;

public interface EmployeeValidity {

	static void isIdValid (HashMap<Integer,Employee> emp,Integer id)throws InvalidEmployeeException
	{
		if(emp.containsKey(id))
		{
			System.out.println("Valid Id");
	    }
		else
		{
			throw new InvalidEmployeeException("Id Already Present");
		}
		
	}
	
	static void isIdDuplicate (HashMap<Integer,Employee> emp,Integer id)throws InvalidEmployeeException
	{
		if(emp.containsKey(id))
		{
			throw new InvalidEmployeeException("Id Already Present");
			
	    }
		else
		{
			System.out.println("Valid Id");
		}
		
	}
}
