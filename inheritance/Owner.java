package com.te.inheritance;

public class Owner {
	
	public static void main(String[] args) {
		
		Smartphone smartphone= new Smartphone(4,8);
		System.out.println(smartphone.color);
		System.out.println(smartphone.camera);
		System.out.println(smartphone.ram);
		System.out.println(smartphone.color);
		
		
		smartphone.call("vianayak");
		Phone phone= smartphone;
		phone.call("bhagwat");
		Phone upcast= new Smartphone(); 
		smartphone.browse("chrome");
		phone.text("College jaaa!!!!","Rutuja");
		smartphone.play("Subway surfers");
		
		
		
		
	}

}
