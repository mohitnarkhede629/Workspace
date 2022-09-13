package com.te.excetption;

import java.util.Scanner;

public class ExceptionTest {
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int a;
		a= scanner.nextInt();
		int b;
		b=scanner.nextInt();
		int res=0;
	
		
		
		try {
			 res=a/b;	
			 int x[]= {1,2,3,4,5,3,4};
			 System.out.println(x[res]);
			 
		} catch (ArrayIndexOutOfBoundsException  e) {
			System.out.println("Arrayindexoutofbound is handled");
		}
		  catch (Exception e) {
			System.out.println("This is another Exception");
			
		  }
		
		finally {
			System.out.println("Connection is closed");
		}
		
		
		System.out.println(res);
		  
		  
			
			
//		
//		try {
//				 res=a/b;	
//				 int x[]= {1,2,3,4,5,3,4};
//				 System.out.println(x[res]);
//			} catch (ArrayIndexOutOfBoundsException e2) {
//				System.out.println("Arrayindexoutofbound is handled");
//			}
//			catch (ArithmeticException e2) {
//				System.out.println("ArithmeticException is handled");
//			
		  
		  
		  
		System.out.println(res);
			scanner.close();
			
			//System.out.println(7>>2);  Shift operator
			
		}
	
		
		
		
		
	}


