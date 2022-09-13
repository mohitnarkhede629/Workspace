package com.te.collection.comparator;



public class Employee implements Comparable<Employee> {

	private String name;
	private int id;
	private Double sal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Employee(String name, int id, Double sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}

	@Override
	public String toString() {
		
		return "Employee id = " + this.id + "  Employee name= "+ this.name + " Salary= "+ this.sal;
	}
	@Override
	public int compareTo(Employee o) {
		
		return this.id- o.id;
	}
	
	
	}
	
	
	

