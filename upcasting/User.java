package com.te.upcasting;

public class User {
	String name;
	long PhoneNumber;
	
	public void call(String name) {
		System.out.println("calling"+ name);
		
	}
	public void text(String name, String msg){
		System.out.println( msg+"messege is sent to" + name );
	}

}
