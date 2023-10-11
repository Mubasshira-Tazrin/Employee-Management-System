package com.springrest.springrest.controller;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import com.springrest.springrest.services.EmployeeService;
import com.springrest.springrest.entities.employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController


public class EmpController {
	
	@Autowired //dependency injection
	public EmployeeService serv;
	
	@GetMapping("/home")
	
	public String home()
	
	{
		return "Employee Manager";
	}
	
	//get employee list
		@GetMapping("/employee")
		
		public List<employee>getEmployee()
		{
			return this.serv.getEmployee();
		}
		
		@GetMapping("/employee/{id}")
		
		public employee getEmployee1(@PathVariable String id)
		{
			return this.serv.getEmployee1(Long.parseLong(id));
		}
		
		@PostMapping(path="/employee",consumes="application/json")
		public employee addEmployee(@RequestBody employee emp)
		{
			return this.serv.addEmployee(emp);
		}
		
		@PutMapping("/employee")
		
		public employee updateEmployee(@RequestBody employee emp)
		{
			return this.serv.updateEmployee(emp);
		}
		
		@DeleteMapping("/employee/{id}")
		
		public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable String id)
		{
			try {
	 			this.serv.deleteEmployee(Long.parseLong(id));
				return new ResponseEntity<>(HttpStatus.OK);
			} catch (Exception e)
			{
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		
		
		

}
