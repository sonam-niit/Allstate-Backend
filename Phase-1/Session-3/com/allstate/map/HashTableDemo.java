package com.allstate.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> map= new Hashtable<>();
		
		map.put(1, "alex");
		map.put(2, "bob");
		map.put(3, "catty");
		map.put(4, "david");
		
		System.out.println(map);
		System.out.println("It contains key 3? "+ map.containsKey(3));
		System.out.println("Get value for key 4 "+map.get(4));
		System.out.println("Display map using For");
		
		for( Map.Entry<Integer, String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		for(String i:map.values()) {
			System.out.println(i);
		}
	}
}
