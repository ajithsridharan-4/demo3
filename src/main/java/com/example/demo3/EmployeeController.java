package com.example.demo3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeRepository repo;
	
	@GetMapping("test")
	public String getMessage()
	{
		return "Welcome to Spring boot";
	}
	
	@PostMapping
	public Employee addEmployee(@RequestBody Employee emp)
	{
		return repo.save(emp);
	}
	
	@GetMapping
	public List<Employee> getEmployees()
	{
		return repo.findAll();
	}
	
	
	@PutMapping("/$id")
	public Employee updateEmployee(@RequestParam int id, @RequestBody Employee emp)
	{
		emp.setId(id);		
		return repo.save(emp);
		
	}
	
	@DeleteMapping("/$id")
	public void deleteEmployee(@RequestParam int id)
	{
		repo.deleteById(id);
	}
	
	
}
