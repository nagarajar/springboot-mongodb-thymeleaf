package com.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.entity.Employee;
import com.management.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public Employee createEmployee(Employee e) {	
		return repo.save(e);
	}

	@Override
	public Employee updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		return repo.save(e);
	}

	@Override
	public Employee getEmployeeById(String id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Employee> getAllEmployee() {

		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String deleteEmplyeeById(String id) {
		Employee employeeById = getEmployeeById(id);
		if (employeeById != null) {
			repo.deleteById(id);
			return "Employee ID : " + id + " is deleted successfully";
		}
		return "Employee ID : " + id + " not found";
	}

}
