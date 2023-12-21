package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;
import com.example.demo.Service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/Employee")
	public Employee addEmployee(@RequestBody Employee e) {
		return employeeService.addNewEmployee(e);
	}
	
	@GetMapping("/Employee")
	public List<Employee> findAllEmployee(){
		return employeeService.findAllEmployee();
	}
	
	@DeleteMapping("/Employee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return "Employee Is Deleted Successfully: ";
	}
	
	@GetMapping("/Employee/{id}")
	public Employee findById(@PathVariable int id) {
		return employeeService.findEmployeeByID(id);
	}
	
	
	
}
