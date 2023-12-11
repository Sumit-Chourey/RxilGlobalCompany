package com.rxil.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rxil.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

}