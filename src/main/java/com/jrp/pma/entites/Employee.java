package com.jrp.pma.entites;

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
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/*
 
 jdbc:mysql://127.0.0.1:3306/managment
 */
@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long employee_id;
	
	private String first_name;
	
	@ManyToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH,CascadeType.PERSIST},
			fetch = FetchType.LAZY)
	@JoinTable(name="project_employee3", 
	 joinColumns =@JoinColumn(name = "employee_id"),
	 inverseJoinColumns = @JoinColumn(name = "project_id")
	 )
	
	
	private List<Project> theProject;
	
	
	
	public Employee()
	{
		
	}
	public Employee(long employee_id, String first_name, String last_name, String email) {
		super();
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}
	private String last_name;
	private String email;
	public String getFirstName() {
		return first_name;
	}
	public void setFirstName(String firstName) {
		this.first_name = firstName;
	}
	public String getLastName() {
		return last_name;
	}
	public void setLastName(String lastName) {
		this.last_name = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
