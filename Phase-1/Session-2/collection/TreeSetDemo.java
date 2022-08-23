package com.allstate.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//no order insertion order maintain
public class TreeSetDemo {

	public static void main(String[] args) {
		
		Set<String> set= new TreeSet<>();
		
		set.add("alex");
		set.add("sonam");
		set.add("catty");
		set.add("bob");
		set.add("david");
		set.add("sonam");//no duplicates allowed
		//set.add(null); // no null allowed
		
		System.out.println(set);
		System.out.println("it contains  "+set.contains("sonam"));
		set.remove("alex");
		System.out.println(set);
		//iterator and for each both will work here
		
	}
}
