package com.java;

import java.util.*;
public class LargestAmong3number {

	public static void main(String[] args) {
		/*
		 * Creating scanner class object and taking i/p from user
		 */
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter First number:");
	Integer num1=sc.nextInt();
	System.out.println("Enter second number:");
	Integer num2= sc.nextInt();
	System.out.println("Enter third number:");
	Integer num3=sc.nextInt();
	/*
	 * checking condition
	 */
	int check12 = num1.compareTo(num2);
	int check13 = num1.compareTo(num3);
	
	if(check12>0 && check13>0)
		System.out.println( num1 + " is the maximum number.");
	else {
		 int check21 = num2.compareTo(num1);
		 int check23 = num2.compareTo(num3);
		 if(check21>0 && check23>0)
			 System.out.println( num2 + " is the maximum number.");
		 else
			 System.out.println( num3 + " is the maximum number.");
		
	}
 }
}

