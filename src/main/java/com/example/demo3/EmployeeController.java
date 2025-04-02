package com.example.demo3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/employee")
public class EmployeeController {

	EmployeeRepository repo;
	
	@GetMapping
	public String getMessage()
	{
		return "Welcome to Spring boot";
	}
	
}
