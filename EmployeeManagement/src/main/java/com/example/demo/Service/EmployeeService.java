package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;

@Service
public interface EmployeeService {
	public Employee addNewEmployee(Employee e);
	public List<Employee> findAllEmployee();
	public Employee findEmployeeByID(int id);
	public String DeleteEmployee(int id);
	public Employee updateEmployee(Employee e, int id);
}
