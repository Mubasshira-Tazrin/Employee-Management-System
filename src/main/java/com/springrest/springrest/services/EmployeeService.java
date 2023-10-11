package com.springrest.springrest.services;

import com.springrest.springrest.entities.*;

import java.util.List;

public interface EmployeeService {
	
	public List<employee>getEmployee();

	public employee getEmployee1(long id);
	

	public employee addEmployee(employee emp);
	

	public employee updateEmployee(employee emp);

	public void deleteEmployee(long parseLong);
	
}


