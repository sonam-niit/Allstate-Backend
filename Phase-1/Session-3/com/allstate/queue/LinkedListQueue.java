package com.allstate.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class LinkedListQueue {

	public static void main(String[] args) {
		
		Queue<Integer> queue= new LinkedList<>();
		//follow insertion order
		queue.add(30);
		queue.add(10);
		queue.add(60);
		
		System.out.println(queue);
		System.out.println("Get value of first element "+queue.peek());
		System.out.println("Remove first element "+queue.poll());
		System.out.println("Get value of first element "+queue.peek());
		
		//List<Integer> list=new LinkedList<>(queue);
		
	}
}
