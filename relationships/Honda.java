package com.te.relationships;

public class Honda extends Car{

	Honda(String brand, String color) {
		super(brand, color);
		
	}

	@Override
	public void start() {
		System.out.println("Honda started"); 
		
	}

	@Override
	public void run() {
		System.out.println("Honda is running mannualy"); 
		
	}

	@Override
	public void brake() {
		System.out.println("Disc brakes jor se laga re baba"); 
		
	}

}
