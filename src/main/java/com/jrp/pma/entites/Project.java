package com.jrp.pma.entites;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

   
@Entity
	public class Project {

		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="project_seq")
		private long projectId;
		
		private String name;
		
		private String stage; // NOTSTARTED, COMPLETED, INPROGRESS
		
		private String description;
		
		
		
		
	public Project()
	{
		
	};

	
	public Project( String name, String stage, String description) {
		super();
		
		this.name = name;
		this.stage = stage;
		this.description = description;
	}
	


	public long getProjectID() {
		return projectId;
	}
	public void setProjectID(long projectId) {
		this.projectId = projectId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	//How To Modify method addEmployee in the project
	

	public List<Project> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Project project) {
		// TODO Auto-generated method stub
		
	}


	}

