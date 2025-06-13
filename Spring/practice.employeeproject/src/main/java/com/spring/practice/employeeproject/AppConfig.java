package com.spring.practice.employeeproject;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import task1.task3.College;

@Configuration
public class AppConfig {
	
	@Bean(name="p2")
	public Project getProject()
	{
		Project p = new Project();
		p.setpId(2);
		p.setDuration("eight months");
		p.setCost(3000000);
		
		return p;
	}
	
	@Bean(name="e2")
	public Employee getStudent()
	{
		Employee e= new Employee();
		e.setEmpId(1);
		e.setName("asha");
		e.setSalary(20000.0);
		Map<String, String> addressMap = new HashMap<>();
		addressMap.put("home", "Chennai");
		addressMap.put("office", "Bangalore");

		e.setAddress(addressMap);
		e.setProject(getProject());
		
		return e;
	}

}
