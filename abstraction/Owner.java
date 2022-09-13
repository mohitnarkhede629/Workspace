package com.te.abstraction;

public class Owner {
	public static void main(String[] args) {
		Lab lab=new Lab("Tommy", "Bhagwat");
		GermanShepherd germanShepherd=  new GermanShepherd("Julie", "Sahil");
		
		lab.bark();
		lab.eat();
		lab.poop();
		System.out.println(germanShepherd.name);
		System.out.println(germanShepherd.ownerName);
		
		System.out.println("----------------------------------------------------");
		
		germanShepherd.bark();
		germanShepherd.eat();
		germanShepherd.poop();
		System.out.println(lab.name);
		System.out.println(lab.ownerName);
		
	}

}
