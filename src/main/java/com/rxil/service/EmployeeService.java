package com.rxil.service;

import java.util.List;

import com.rxil.entity.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);
	
	List<Employee> getAllEmployee();
	
	public Employee getempoyee();
	
	
}
