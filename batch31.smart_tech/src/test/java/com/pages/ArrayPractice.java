package com.pages;

import java.util.Arrays;

import com.beust.ah.A;

public class ArrayPractice {
	
	public static void main(String[] args) {
		
		int [] a = {10, 12, 20, 25, 30, 2, 1, 5, 45,};
		
		System.out.println(Arrays.toString(a));
		Arrays.sort(a); //find the sort (automatically low to high)
		System.out.println(Arrays.toString(a));
		int size = a.length; //find the size
		//System.out.println(size);
		System.out.println(a.length);
		int secval = a[size-2]; //using index
		System.out.println("My second highest value is " + secval);
	}

}
