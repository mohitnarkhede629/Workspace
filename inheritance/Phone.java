package com.te.inheritance;

public class Phone {
	
	String name;
	String color;
	double price;
	
	public void call(String name) {
		System.out.println("calling..."+name);
	}
	
	public void text(String msg,String name) {
		System.out.println("sending messege to....."+name+ "and the messege is"+msg);
	}
	
	public Phone(String name, double price, String color) {
		super();
		this.name=name;
		this.price=price;
		this.color=color;
	}
	
	

}
