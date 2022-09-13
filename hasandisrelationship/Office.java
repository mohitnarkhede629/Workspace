package com.te.hasandisrelationship;

public class Office {
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.name="Mohit";
		employee.contactNumber=7773951702l;
		employee.id=751;
		Address address= new Address();
		Address add1= new Address();
		employee.add1=add1;
		employee.address=address;
		employee.address.buildingNo="b3";
		employee.address.landmark="tempole";
		employee.address.pincode=122345;
		
		employee.add1.buildingNo="b 291";
		employee.add1.landmark="mandir";
		employee.add1.pincode=425201;
		
		System.out.println(employee.name);
		System.out.println(employee.contactNumber);
		System.out.println(employee.id);
		System.out.println(employee.address.buildingNo);
		System.out.println(employee.address.landmark);
		System.out.println(employee.address.pincode);
		System.out.println(employee.add1.buildingNo);
		System.out.println(employee.add1.landmark);
		System.out.println(employee.add1.pincode);
	}
}
