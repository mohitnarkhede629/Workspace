package com.te.abstraction;

public abstract class Dog {
	
	String name;
	String ownerName;
	
	Dog(String name,String ownerName){
	this.name=name;
	this.ownerName=ownerName;
	}
	
	
	public abstract void bark();
	public abstract void eat();
	public void poop() {
		System.out.println("the dog is pooping ");
	}
	
	

}
