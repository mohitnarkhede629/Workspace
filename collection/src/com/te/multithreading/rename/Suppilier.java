package com.te.multithreading.rename;

public class Suppilier extends Thread {
	
	String name;
	String brand;
	BottleShop bottleShop;
	
	public Suppilier(String name, BottleShop bottleShop) {
		super();
		this.name = name;
		this.bottleShop=bottleShop;
		
	}
	
	public String getBrand(){
		return brand;
		
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public void run() {
		System.out.println("Suppilier");
		bottleShop.refillStock(brand, 2);
		
	}
	
}

	
	


