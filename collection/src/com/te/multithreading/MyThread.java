package com.te.multithreading;

public class MyThread implements Runnable{
	
	public void generateOtp() {
		System.out.println(Math.random()*1000);
		
	}

	@Override
	public void run() {
		
		generateOtp();
		
	}
	
	

}
