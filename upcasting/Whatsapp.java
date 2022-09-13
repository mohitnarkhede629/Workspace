package com.te.upcasting;

public class Whatsapp {
	
	public static void main(String[] args) {
		
		User user= new User();
		user.name="Rutuja";
		user.PhoneNumber=888888888;
		user.text("rutuja", "jadbkfbkd");
		user.call("bhargav");
System.out.println("---------------------------------------");
			User user1= new Admin();
			user1.name="akash";
			user1.PhoneNumber=783783758;
			user1.text("dskfsh", "null");
			
			
			Admin ad=(Admin) user1;
			ad.addUser("Vinayak");
			System.out.println(ad.name);
			
			

	}

}
