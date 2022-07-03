package com.jrp.pma.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jrp.pma.entites.Project;

//Project Repository value
//Importing Project From Project Repository.
public interface ProjectRepository extends CrudRepository<Project,Long> {
    
	//Overriding List<Projects> with findAll() method
	@Override
	List<Project> findAll();
}
