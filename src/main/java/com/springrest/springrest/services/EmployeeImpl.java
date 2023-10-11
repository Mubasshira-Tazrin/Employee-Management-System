package com.springrest.springrest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.EmployeeRepository;
import com.springrest.springrest.entities.employee;

@Service

public class EmployeeImpl implements EmployeeService {
 @Autowired
	private EmployeeRepository	empRepository;
	public EmployeeImpl()
	{
			}
	
	public List<employee> getEmployee()
	{
	
		return empRepository.findAll();

	}

	public employee getEmployee1(long id)
	{
		Optional<employee> e =  empRepository.findById(id);
		return e.get();
		}

	@Override
	public employee addEmployee(employee emp) {
		
		empRepository.save(emp);
		return emp;
	}

	@Override
	public employee updateEmployee(employee emp) {
		empRepository.save(emp);
		return emp;
	}

	public void deleteEmployee(long parseLong) {
		
		empRepository.deleteById(parseLong);
//		employee entity=
//				empRepository.deleteById(parseLong);
//		empRepository.delete(entity);
	}
	
	
}
