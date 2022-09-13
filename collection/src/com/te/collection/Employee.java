package com.te.collection;

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
	public int compareTo(Employee o) {
		
		return this.id- o.id;
	}
	
	
	
	
	
	
}
