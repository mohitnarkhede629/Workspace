package com.te.multithreading.joins;

public class BoyFriend extends Thread {
	public static void main(String[] args) throws InterruptedException {
	GirlFriend girlFriend = new GirlFriend();
	Thread.currentThread().setName("boyfriend");
	girlFriend.start();
	for (int i = 0; i < 5; i++) {
		System.out.println("Come fast na babay!!!!");
		Thread.sleep(1000);
		
	}
	try {
		girlFriend.join();
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	System.out.println("She reached");
	Thread.sleep(1000);
	System.out.println("they went to dinner together");
	Thread.sleep(1000);
	System.out.println("ice cream khayi unhone sath me");
	Thread.sleep(1000);
	System.out.println("haan ab gaana bbhi toh gana hia");
	Thread.sleep(1000);
	System.out.println("ho gaya tamasha, jao aab ghar dono apne apne");
	
	}

}
