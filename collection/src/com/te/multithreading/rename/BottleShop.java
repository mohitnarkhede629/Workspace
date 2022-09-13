package com.te.multithreading.rename;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class BottleShop {

	List<String> brand = Arrays.asList("Signature", "Carlsberg", "OakSmith Gold");
	int quantity = 10;

	public synchronized void buy(String name, int noOfBottles) {
		boolean b = brand.stream().anyMatch(x -> x.equals((String) name));

		if (b) {
			System.out.println("here is your brand " + name);
			System.out.println("Here are yiur bottles, Dont drink and drive");
			quantity -= noOfBottles;

		} else {
			System.err.println("Wait the stock will be refilled");
			try {
				this.wait();
				System.out.println("Thanks for waiting, here is your drink");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	public synchronized void refillStock(String name, int quantity) {

		HashSet<String> hashSet = new HashSet<>(brand);
		hashSet.add(name);
		ArrayList<String> arrayList = new ArrayList<>(hashSet);
		brand = arrayList;
		this.quantity += quantity;
		notifyAll();

	}

}
