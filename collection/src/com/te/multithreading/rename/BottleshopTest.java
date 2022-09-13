package com.te.multithreading.rename;

public class BottleshopTest {
		public static void main(String[] args) throws InterruptedException {
			
			BottleShop bottleShop= new BottleShop();
			Customer mohit = new Customer(bottleShop, "MOhit", "Signature");
			Customer vinayak = new Customer(bottleShop, "Vinayak", "OakSmith Gold");
			Customer bhagwat = new Customer(bottleShop, "Bhagwat", "Teachers");
			Customer amit = new Customer(bottleShop, "MOhit", "Carlsberg");
			
			mohit.start();
			vinayak.start();
			bhagwat.start();
			amit.start();
			
			Suppilier dhiraj = new Suppilier("dhiraj", bottleShop);
			dhiraj.setBrand("Teachers");
			Thread.sleep(1000);
			dhiraj.start();
			
		
			
		}
}
