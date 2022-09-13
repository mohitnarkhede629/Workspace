package com.te.encapsulation;

public class Voter {
	private int age;
	private int id;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age>18) {
			System.out.println("You are eligible "+ this.name);
			
		} else {
			System.out.println("You are not eligible "+ this.name);

		}
		
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if (age>18) {
			this.id = id;
			
			
		}
		else {
			System.out.println("Your id cannot be generated. you are below 18");
		}
		
		System.out.println("Your voter id is "+ this.id);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
