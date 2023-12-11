package com.rxil.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rxil.entity.Employee;
import com.rxil.service.EmployeeService;

@RestController
@RequestMapping("/rxil/employees")
public class EmployeeController 
{

	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	
	//Build create employee REST API
	@GetMapping("/rxil/home")
	public String home()
	{
		System.out.println("This is RXIL Global page");
		return "home";
	}
	
	@PostMapping()
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee)
	{
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee),HttpStatus.CREATED );
		
	}
	//built get all detail employee
	@GetMapping
	public List<Employee> getAllEmployee()
	{
		return employeeService.getAllEmployee();
		
	}
	
}
	
	//build get employee by id REST API
	
	
	