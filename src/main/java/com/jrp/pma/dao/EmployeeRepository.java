package com.jrp.pma.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jrp.pma.entites.Employee;
import com.jrp.pma.entites.Project;



@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

	
	@Override
	public List<Employee> findAll();
}
