package com.allstate.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//insertion order maintain
public class LinkedHashSetDemi {

	public static void main(String[] args) {
		
		Set<String> set= new LinkedHashSet<>();
		
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
		Iterator<String> it=set.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string);
		}
		//iterator and for each both will work here
		
	}
}
