package com.java;

import java.util.Scanner;

public class LargestAmong3Strings {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First number:");
		String s1=sc.next();
		System.out.println("Enter second number:");
		String s2=sc.next();
		System.out.println("Enter third number:");
		String s3=sc.next();

		int check12 = s1.compareTo(s2);
		int check13 = s1.compareTo(s3);
		
		if(check12>0 && check13>0)
			System.out.println( s1 + " is the largest String");
		else {
			 int check21 = s2.compareTo(s1);
			 int check23 = s2.compareTo(s3);
			 if(check21>0 && check23>0)
				 System.out.println( s2 + " is the largest String.");
			 else
				 System.out.println( s3 + " is the largest String.");
			
		}
	 }
	}

