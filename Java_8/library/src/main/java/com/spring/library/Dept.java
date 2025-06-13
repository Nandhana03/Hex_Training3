package com.spring.library;

public class Dept {
	
	public Dept() {};
	
	public Dept(String name) {
		super();
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dept [name=" + name + "]";
	}

}
