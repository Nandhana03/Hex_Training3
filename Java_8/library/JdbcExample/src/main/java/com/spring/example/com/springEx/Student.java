package com.spring.example.com.springEx;
 
public class Student {
	
	int rollno;
	String name;
	double fee;
	Address a1;
	Student()
	{
		
	}
 
	public Student(int rollno, String name, double fee) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}
 
	public int getRollno() {
		return rollno;
	}
 
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public double getFee() {
		return fee;
	}
 
	public void setFee(double fee) {
		this.fee = fee;
	}
 
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", fee=" + fee + "]";
	}
	
	  public void display() {
	        System.out.println("Roll No: " + rollno);
	        System.out.println("Name: " + name);
	        System.out.println("Fee: " + fee);
	    }
       
	  public Address getA1() {
	        return a1;
	    }

	    public void setA1(Address a1) {
	        this.a1 = a1;
	    }
	
	
 
}
 
 