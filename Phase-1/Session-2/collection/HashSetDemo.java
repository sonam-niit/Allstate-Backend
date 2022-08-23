package com.allstate.collection;

import java.util.HashSet;
import java.util.Set;

//no order insertion order maintain
public class HashSetDemo {

	public static void main(String[] args) {
		
		Set<String> set= new HashSet<>();
		
		set.add("alex");
		set.add("sonam");
		set.add("catty");
		set.add("bob");
		set.add("david");
		set.add("sonam");//no duplicates allowed
		set.add(null); // only one null allowed
		
		System.out.println(set);
		System.out.println("it contains  "+set.contains("sonam"));
		set.remove("alex");
		System.out.println(set);
		//iterator and for each both will work here
		
	}
}
