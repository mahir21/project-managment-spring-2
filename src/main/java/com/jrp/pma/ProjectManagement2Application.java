package com.jrp.pma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import com.jrp.pma.dao.EmployeeRepository;
import com.jrp.pma.dao.ProjectRepository;
import com.jrp.pma.entites.Employee;

@SpringBootApplication
public class ProjectManagement2Application  {
	
	@Autowired
	EmployeeRepository empRepo;
	@Autowired
	ProjectRepository proRepo;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjectManagement2Application.class, args);
	}
	
}

 
	/*
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO project(project_id,name,stage,description) VALUES (?,?,?,?)";
		
		int result = jdbcTemplate.update(sql,2,"Mahir","One","Mahir is added to stage 1 description");
		
		if(result > 0)
		{
			System.out.println("New User Has Been Inserted");
		}
	}
	
	

}

	
/*	
	@Bean
	CommandLineRunner runner()
	{
		return args ->{
			Employee emp1 = new Employee("John", "Warton", "warton@gmail.com");
			Employee emp2 = new Employee("Mike", "Lanister", "lanister@gmail.com");
			Employee emp3 = new Employee("Steve", "Reeves", "Reeves@gmail.com");
			Employee emp4 = new Employee("Ronald", "Connor", "connor@gmail.com");
			Employee emp5 = new Employee("Jim", "Salvator", "Sal@gmail.com");
			Employee emp6 = new Employee("Peter", "Henley", "henley@gmail.com");

			Employee emp7 = new Employee("Richard", "Carson", "carson@gmail.com");
			Employee emp8 = new Employee("Honor", "Miles", "miles@gmail.com");
			Employee emp9 = new Employee("Tony", "Roggers", "roggers@gmail.com");

		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ProjectManagement2Application.class, args);
	}

}
*/
