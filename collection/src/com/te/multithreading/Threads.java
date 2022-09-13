package com.te.multithreading;

public class Threads extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		for (int i = 1; i < 10; i++) {
			if (i == 6) {
				throw new RuntimeException();
			}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}

		
		System.out.println(i + "=====user 1=========");
		}

	}

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Threads();
		thread.start();
		thread.setName("Mohit");
		thread.setPriority(MAX_PRIORITY);
		System.out.println(Thread.currentThread().getName());
		// thread.run();

		/*
		 *
		 * if we call this statement, first run method will get executed and then main
		 * method
		 */

		for (int i = 11; i < 20; i++) {
			System.out.println(i + "=====user 2=========");
			Thread.sleep(1000);

		}
	}

}
