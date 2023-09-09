package com.thymeleaf.model;

public class Employee {
	private int id;
	private String name;
	private String mob;
	private double salary;
	
	public Employee() {
	}

	public Employee(int id, String name, String mob, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.mob = mob;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

}
