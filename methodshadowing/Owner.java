package com.te.methodshadowing;

import com.te.inheritance.Smartphone;
import com.te.inheritance.*;

public class Owner {
	public static void main(String[] args) {
		
		Smartphone smartphone= new Smartphone("samsung ",120000,"black");
		smartphone.simcard();
	}

}
