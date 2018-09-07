package com.cg.service;

import java.util.ArrayList;

import com.cg.bean.Employee;

public class EmployeeServiceImpl implements IEmployeeService {

	@Override
	public ArrayList<Employee> getAllEmployees() {
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(101,"e101",30000.0));
		list.add(new Employee(102,"e102",20000.0));
		list.add(new Employee(103,"e103",40000.0));
		
		return list;
	}

}
