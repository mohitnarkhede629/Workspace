package com.te.abstraction;

public class GermanShepherd extends Dog{

	GermanShepherd(String name, String ownerName) {
		super(name, ownerName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bark() {
		System.out.println("GS barks as danger");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		System.out.println("GS eats while sitting and eats pedigrii");
		// TODO Auto-generated method stub
		
	}
	

}
