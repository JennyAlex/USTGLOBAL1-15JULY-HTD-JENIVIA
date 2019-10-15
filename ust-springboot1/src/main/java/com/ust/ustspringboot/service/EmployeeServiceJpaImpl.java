package com.ust.ustspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.ustspringboot.dto.Employee;
import com.ust.ustspringboot.repository.EmployeeRepository;

@Service("jpa")
public class EmployeeServiceJpaImpl implements EmployeeService {
	@Autowired
	EmployeeRepository repository;

	@Override
	public boolean addEmployee(Employee employee) {
		repository.save(employee);
		return true;
	}

	@Override
	public boolean removeEmployee(int id) {
		repository.deleteById(id);
		return true;
	}

	@Override
	public boolean modifyEmployee(Employee employee) {
		repository.update(employee.getName(), employee.getPassword(), employee.getId());
		return true;
	}

	@Override
	public Employee getEmployee(int id) {

		return repository.findById(id).get();
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repository.findAll();
	
	}

	@Override
	public List<Employee> getEmployeesByName(String name) {
		return  repository.findByName(name);

	
	}

	


}
