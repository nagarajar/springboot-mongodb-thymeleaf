package com.management.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.management.entity.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String>{

}
