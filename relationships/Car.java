package com.te.relationships;

public abstract class Car {
	String brand;
	String color;
	Engine engine;
	Car(String brand, String color){
		this.brand=brand;
		this.color=color;
		
	}
	public abstract void start();
	public abstract void run();
	public abstract void brake();
	
	


}
