package com.jrp.pma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/projects")
public class ProjectController {

	@RequestMapping("/new")
	public String displayProject()
	{
		return "new-project";
	}
}
