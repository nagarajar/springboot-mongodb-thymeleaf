package com.management.service;

import java.util.List;

import com.management.entity.Employee;

public interface IEmployeeService {
	
	Employee createEmployee(Employee e);
	Employee updateEmployee(Employee e);
	Employee getEmployeeById(String id);
	List<Employee> getAllEmployee();
	String deleteEmplyeeById(String id);
	
	

}
