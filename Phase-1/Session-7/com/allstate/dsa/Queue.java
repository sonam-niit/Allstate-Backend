package com.allstate.dsa;

public class Queue {

	Node front;
	Node rear;
	
	Queue(){
		this.front=null;
		this.rear=null;
	}
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	void enqueue(int key) {
		Node newNode= new Node(key);
		//If the queue empty then new node is front and rear both
		if(rear==null) {
			front=rear=newNode;
			return;
		}
		//add the newNode at the end of the queue and change rear point
		rear.next=newNode;
		rear=newNode;
	}
	void dequeue() {
		//if the queue is empty
		if(front==null)
		{	
			System.out.println("Queue is Empty");
			return;
		}
		//store prev front and move front one node ahead
		Node temp= front;
		front= front.next;
		System.out.println("Data removed "+temp.data);
		//if front becomes null then change rear to null
		if(front==null) {
			rear=null;
		}
	}
	public static void main(String[] args) {
		Queue queue= new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(30);
		queue.enqueue(40);
		queue.dequeue();
	}
}
