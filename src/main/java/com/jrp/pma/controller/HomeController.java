package com.jrp.pma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jrp.pma.dao.EmployeeRepository;
import com.jrp.pma.dao.ProjectRepository;
import com.jrp.pma.entites.Employee;
import com.jrp.pma.entites.Project;

@Controller
public class HomeController {
	@Autowired
	ProjectRepository proRepo;
	
	@Autowired
	EmployeeRepository empRepo;
	//Mapping will initialize the home value
	@RequestMapping("/home")
	public String displayHome(Model model)
	{   
		//5List will store all the project values
		//Need To Store Project Object type values in list
		
		//We are querying the database for projects
		
		List<Project> listAll = proRepo.findAll();
		//sending the values to thymleaf
		model.addAttribute("projectList",listAll);
		//return home
		
		//We are querying the database for employees
		
		//Creating mapping for employee list project values
		List<Employee> listE = empRepo.findAll();
		model.addAttribute("employeeList",listE);
		return "home/home";
	}
}
