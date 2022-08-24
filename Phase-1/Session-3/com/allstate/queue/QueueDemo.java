package com.allstate.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<Integer> queue= new PriorityQueue<>();
		//follow natural order seq
		queue.add(30);
		queue.add(10);
		queue.add(60);
		
		System.out.println(queue);
		System.out.println("Get value of first element "+queue.peek());
		System.out.println("Remove first element "+queue.poll());
		System.out.println("Get value of first element "+queue.peek());
		
		
	}
}
