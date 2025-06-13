package com.spring.practice.employeeproject;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee1 implements InitializingBean, DisposableBean{
    
	public Employee1(int empId, String name, double salary, Map address, Project project) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.project = project;
	}
	public Employee1() {};
	
	private int empId;
	private String name;
	private double salary;
	private Map address;  // Key: type (home/office), Value: address
	Project project;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Map getAddress() {
		return address;
	}
	public void setAddress(Map address) {
		this.address = address;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", address=" + address
				+ ", project=" + project + "]";
	}
    // --- task 3 starts---
//	@PostConstruct
//	void start()
//	{
//		System.out.println("starting ...");
//	}
//		
//	@PreDestroy()
//	void stop()
//	{
//		System.out.println("ending  ...");
//	}
	
	// -- task 4 starts
	@Override
	public void destroy() throws Exception {
	System.out.println("Ending...");
}

@Override
public void afterPropertiesSet() throws Exception {
//	 TODO Auto-generated method stub
  System.out.println("Starting...");	 
	
}
}
