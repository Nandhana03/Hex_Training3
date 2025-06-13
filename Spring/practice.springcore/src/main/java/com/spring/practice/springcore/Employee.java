package com.spring.practice.springcore;

public class Employee {
     
	  public Employee(String name, int age, String dept, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.salary = salary;
	}
	  
	public Employee() {};
	
	String name;
      int age;
      String dept;
      double salary;
      
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", dept=" + dept + ", salary=" + salary + "]";
	}
}
