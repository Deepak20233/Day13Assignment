package com.java;

import java.util.Scanner;

public class GenericClassExample {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		 System.out.println("What do you wish to compare : \n Enter 1 for Integer \n Enter 2 for Float \n  Enter 3 for String");
	        int choice = sc.nextInt();
	        switch (choice) {
	            case 1:
	            	System.out.println("Enter First number:");
	        		Integer int1 =sc.nextInt();
	        		System.out.println("Enter second number:");
	        		Integer int2 =sc.nextInt();
	        		System.out.println("Enter third number:");
	        		Integer int3 =sc.nextInt();
	        		Integer maxInt = findMax(int1, int2, int3);
	        		System.out.println("Maximum is : " + maxInt);
		            break;
	            case 2:
	            	System.out.println("Enter First float number:");
	        		Float f1=sc.nextFloat();
	        		System.out.println("Enter second float number:");
	        		Float f2=sc.nextFloat();
	        		System.out.println("Enter third float number:");
	        		Float f3=sc.nextFloat();
	        		Float maxFloat = findMax(f1, f2, f3);
	        		System.out.println("Maximum is : "+ maxFloat);
	        		break;
	            case 3:
	            	System.out.println("Enter First String:");
	        		String s1=sc.next();
	        		System.out.println("Enter second String:");
	        		String s2=sc.next();
	        		System.out.println("Enter third String:");
	        		String s3=sc.next();
	        		String maxString = findMax(s1, s2, s3);
	        		System.out.println("Maximum is : " + maxString);
	        		break;
            
	        }
	}
	public static <T extends Comparable<T>> T findMax(T a, T b, T c) {
		System.out.println("The inputs are :  " + a + ","
				+ b + "," + c);

		
		T max = a;
		if (max.compareTo(b) < 0) {
			max = b;
		}
		if (max.compareTo(c) < 0) {
			max = c;
		}
		return max;
	}
}
