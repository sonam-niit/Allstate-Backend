package com.allstate.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		List<Integer> list= new Vector<>();
		
		Integer array[]={10,20,30,40,50};
		Collections.addAll(list, array); //store multiple elements in vector
		list.add(10); //Duplicates allowed in list
		
		System.out.println(list);
		System.out.println("get element from index 3: "+ list.get(3));
		list.remove(5);
		System.out.println(list);
		System.out.println(list.contains(40));
		System.out.println("Empty check: "+list.isEmpty());
		System.out.println("Size: "+list.size());
		
		list.add(3, 90);
		System.out.println(list);
		
		System.out.println("print element 1 by 1 using foreach");
		//taking one one element from list to x object and print until it reaches at the end of your list
		for(int x:list) {
			System.out.println(x);
		}
		System.out.println("Iterate with Iterator");
		Iterator<Integer> it= 
				list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
