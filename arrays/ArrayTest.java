package com.te.arrays;

public class ArrayTest {
	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6};
		int b [];
		b=new int[4];
//		b[0]=1;
//		b[1]=2;
//		b[2]=3;
//		b[3]=4;
		
		System.out.println(b.length);
		System.out.println(size);

		
		for (int i=0; i<b.length; i++) {
			b[i]=a[i];
			System.out.println(b[i]);
			
		}
		
		String []s;   // array in the form of strings(Strung array)
		s= new String[10];
		
		s[1]="mohit";
		s[2]="Rutuja";
		
		Object[]o;      // Array of object. It will store similar types of objects
		o=new Object[4];
		
		o[1]="dgffh";
		o[2]=new ArrayTest();
		o[0]=10;
		
		
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(b[0]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		System.out.println(s[1]);
		System.out.println(s[0]);
		System.out.println(o[1]);
		System.out.println(o[2]);
		System.out.println(o[0]);
		String
	}

}
