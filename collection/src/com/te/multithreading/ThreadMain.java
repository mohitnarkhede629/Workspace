package com.te.multithreading;

public class ThreadMain {
	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread();
		Thread thread = new Thread(myThread);
		thread.start();
		Thread.sleep(1000);
		Thread thread2 = new Thread(new MyThread());
		thread2.start();
		Thread.sleep(1000);
		Thread thread3 = new Thread(new MyThread());
		thread3.start();
		Thread.sleep(1000);
		Thread thread4 = new Thread(new MyThread());
		thread4.start();
		
		thread.setPriority(6);
		
		Thread.sleep(1000);
		Thread thread5 = new Thread(new MyThread());
		thread5.start();
		Thread.sleep(1000);
		Thread thread6 = new Thread(new MyThread());
		thread6.start();
		Thread.sleep(1000);
		Thread thread7 = new Thread(new MyThread());
		thread7.start();
		Thread.sleep(1000);
		Thread thread8 = new Thread(new MyThread());
		thread8.start();
		Thread.sleep(1000);
		Thread thread9 = new Thread(new MyThread());
		thread9.start();
		Thread.sleep(1000);
		Thread thread0 = new Thread(new MyThread());
		thread0.start();

	}

}
