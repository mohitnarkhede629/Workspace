package com.te.multithreading.joins.synchronization;

public class User extends Thread {

	int tickets;
	String name;
	Irctc irctc;

	public User(int tickets, String name, Irctc irctc) {
		super();
		this.tickets = tickets;
		this.name = name;
		this.irctc = irctc;
	}

	@Override
	public void run() {
		irctc.bookTickets(tickets, name);

	}

}
