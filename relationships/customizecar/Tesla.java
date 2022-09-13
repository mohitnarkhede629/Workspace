package com.te.relationships.customizecar;

public class Tesla extends Car {
	
	

	public Tesla(String brand, String color) {
		super(brand,color);
		
	}

	@Override
	public void start() {
		System.out.println("Tesla started with no noise"); 
		
	}

	@Override
	public void run() {
		System.out.println("Tesla running automatically"); 
		
	}

	@Override
	public void brake() {
		System.out.println("Tesla has air brakes"); 
		
	}

}
