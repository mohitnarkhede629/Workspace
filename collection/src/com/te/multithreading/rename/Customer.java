package com.te.multithreading.rename;

public class Customer extends Thread {
	
	String name;
	String brand;
	BottleShop bottleShop;
	
	public Customer(BottleShop bottleShop,String name, String brand ) {
		super();
		this.bottleShop=bottleShop;
		this.name=name;
		this.brand=brand;
		
	}
	
		@Override
		public void run() {
			bottleShop.buy(brand,2 );
		}
}
