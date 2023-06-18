package com.emp.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.emp.core.Employee;

public interface EmpIO {
	static void serializeEmp(Map<Integer,Employee> emp,String fileName) throws Exception 
	{
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(fileName)))
		{
		out.writeObject(emp);
	}
		}
	
	static HashMap<Integer,Employee> deSerializeemp(String fileName) throws Exception
	{
		File file=new File(fileName);
		if(file.isFile() && file.canRead())
		try(ObjectInputStream in =new ObjectInputStream(new FileInputStream(fileName))){
		return (HashMap<Integer,Employee>)in.readObject();
		}
		return new HashMap<>();
	}

}
