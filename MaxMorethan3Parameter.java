package com.java;
import java.util.*;
public class MaxMorethan3Parameter <T extends Comparable<T>>{
	public static <T extends Comparable<T>> T findMax(List<T> arr) {

		T max = arr.get(0);
		for (T key : arr) {
			if (key.compareTo(max) > 0)
				max = key;
		}
		return max;
	}

	public static void main(String[] args) {
		MaxMorethan3Parameter obj = new MaxMorethan3Parameter();
		System.out.println("The Maximum integer num is:" + obj.findMax(Arrays.asList(4, 7, 8, 9, 44, 55)));
		System.out.println("The Maximum float num is:" + obj.findMax(Arrays.asList(1.9, 3.0, 6.7, 2.6, 4.5, 5.8)));
		System.out.println("The Maximum String  is:" + obj.findMax(Arrays.asList("Apple", "banana", "peach", "mango", "kiwi")));

	}

}
