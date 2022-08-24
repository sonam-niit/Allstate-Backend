package com.allstate.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> map= new HashMap<>();
		
		map.put(1, "alex");
		map.put(2, "bob");
		map.put(3, "catty");
		map.put(4, "david");
		
		System.out.println(map);
		System.out.println("It contains key 3? "+ map.containsKey(3));
		System.out.println("Get value for key 4 "+map.get(4));
		System.out.println("Display map using For");
		
		//map.entrySet() will give set of entries from that you can take one one entry
		// Each entry contains one key and one value with itself
		for( Map.Entry<Integer, String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
			if(entry.getValue().equals("bob"))
				System.out.println("Bob is available");
		}
		//map.keySet() will get set of Keys
		//map.values() will give set of values
		for(String i:map.values()) {
			System.out.println(i);
		}
	}
}
