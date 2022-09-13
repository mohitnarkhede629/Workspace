package com.te.multithreading.joins;



public class GirlFriend extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Thamb na bey jara...yete na 5 mintat");
			try {
				Thread.sleep(1300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	}
	

}
