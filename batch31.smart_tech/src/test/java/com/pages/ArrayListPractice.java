package com.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ArrayListPractice {
	
	public static void main(String[] args) {
		
		List <Integer> list = new ArrayList<>();
		list.add(7);
		list.add(17);
		list.add(77);
		list.add(10);
		list.add(31);
		list.add(29);
		list.add(2);
		list.add(9);
		list.add(11);
		list.add(72);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		//System.out.println(list.size());
		//int max = Collections.max(list);
		//System.out.println(max);
		//int min = Collections.min(list);
		//System.out.println(min);
		//Collections.shuffle(list);
		//System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		int secval = 0;
		for (int i = 0; i < list.size(); i ++) {
			secval = list.get(1); 		 
		}
		
		System.out.println("This is my second highest value " + secval);
		
	}
		
}
