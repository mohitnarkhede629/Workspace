package com.te.multithreading.joins.synchronization;

public class Irctc {

	int noOfTickets = 270;

	public void bookTickets(int tickets, String name) {
		System.out.println("Welcome to IRCTC");

		synchronized (this) {
			if (noOfTickets > tickets) {
				noOfTickets -= tickets;
				System.out.println("Thank you For Booking " + tickets + "tickets " + name + "Have a safe Journey");
			} else {
				System.err.println("Sorry we wont give you tickets " + name );
				return;
			}
			System.out.println("Number of tickets left == " + noOfTickets);
		}
	}

}
