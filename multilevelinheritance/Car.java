package com.te.multilevelinheritance;

public class Car extends Vehicle {
	
	int capacity;
	@Override
	public void transport(String thing) {
		System.out.println("A car transports private passengers ");
	}
	
	public void driver() {
		System.out.println("The driver run the car");
	}
	
	

}
