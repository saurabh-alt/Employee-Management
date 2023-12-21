package com.example.demo.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.Service.EmployeeService;
@Service
public class EmployeeImpl implements EmployeeService{
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee addNewEmployee(Employee e) {
		// TODO Auto-generated method stub
		return employeeRepository.save(e);
	}

	@Override
	public List<Employee> findAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee findEmployeeByID(int id) {
		// TODO Auto-generated method stub
		
		return employeeRepository.findById(id).get();
	}

	@Override
	public String DeleteEmployee(int id) {
		// TODO Auto-generated method stub
		return "Employee Is Deleted";
	}

	@Override
	public Employee updateEmployee(Employee e, int id) {
		// TODO Auto-generated method stub
		Employee E=employeeRepository.findById(id).get();
		E.setName(e.getName());
		E.setPhoneNumber(e.getPhoneNumber());
		return employeeRepository.save(E);
	}
}
