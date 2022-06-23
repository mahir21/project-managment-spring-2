package com.jrp.pma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jrp.pma.dao.ProjectRepository;
import com.jrp.pma.entites.Project;

@Controller
@RequestMapping("/projects")
public class ProjectController {

	//Model is used to exchange data between view and controller
    @Autowired
	ProjectRepository proRepo;
	
	@RequestMapping("/new")
	public String displayProject(Model model)
	{  
		Project aProject = new Project();
		
		model.addAttribute("project",aProject);
		return "new-project";
	}
	
	@PostMapping("/save")
	public String CreateProject(Project project,Model model)
	{  //This should handle saving the data into database
	
		proRepo.save(project);
		
		//Using redirect to prevent duplicate submission
		return "redirect:/projects/new";
	}
	
	
	
}
