//Java program to find largest among 3 floats
package com.java;

import java.util.Scanner;

public class LargestAmong3Floats {
	public static void main(String[] args) {
		/*
		 * Creating scanner class object and taking i/p from user
		 */
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter First number:");
	Float num1=sc.nextFloat();
	System.out.println("Enter second number:");
	Float num2= sc.nextFloat();
	System.out.println("Enter third number:");
	Float num3=sc.nextFloat();
	/*4
	 * checking condition
	 */
	float check12 = num1.compareTo(num2);
	float check13 = num1.compareTo(num3);
	
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
	sc.close();
 }
}

