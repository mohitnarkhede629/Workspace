package com.te.abstraction;

public class Lab extends Dog {
	
	Lab(String name,String ownerName){
		super (name,ownerName);
	}

	public void bark() {
		System.out.println("lab barks as bhobho");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		System.out.println("lab eats while standing");
		// TODO Auto-generated method stub
		
	}
	
	

}
