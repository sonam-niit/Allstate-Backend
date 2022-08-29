package com.allstate.dsa;

public class LinkedList {

	Node head; // first node of my List
	
	public LinkedList() {
		//no data in your list
		head=null;
	}
	public static boolean isEmpty(LinkedList list) {
		return list.head==null;
	}
	//inner class
	static class Node{
		int data; 
		Node next; //address of next node
		
		Node(int data){
			this.data=data;
			next=null; //default next is null for new node
		}
	}
	public static void printList(LinkedList list) {
		Node curr= list.head;
		if(curr==null)
			System.out.println("List is Empty");
		else
		{
			while(curr!=null) {
				System.out.print(curr.data+" ");
				curr=curr.next;
			}
			System.out.println();
		}
	}
	public static LinkedList deleteByKey(LinkedList list, int key) {
		Node curr=list.head;
		Node prev=null;
		//let's check the key is head or not
		if(curr!=null && curr.data==key) {
			//let's delete the first node (head)
			list.head=curr.next;
			System.out.println("Key found "+key+" and deleted");
			return list;
		}
		//delete the node between 2 nodes or last node
		while(curr!=null && curr.data!=key) {
			//loop will search the key to delete
			prev=curr;
			curr=curr.next;
		}
		//if key found
		if(curr!=null) {
			prev.next=curr.next;
			System.out.println(key+" found and deleted");
		}
		if(curr==null) {
			System.out.println(key +" not found");
		}
		return list;
	}
	public static LinkedList insert(LinkedList list,int data) {
		
		Node newNode= new Node(data);
		//let's check the list is empty or not
		if(list.head==null) {
			list.head=newNode; //assign new node to head
		}
		else {
			Node curr= list.head;
			while(curr.next!=null) {
				curr=curr.next;
			}
			
			curr.next=newNode;
		}
		return list;
	}
	public static void main(String[] args) {
		LinkedList list= new LinkedList();
		System.out.println(isEmpty(list));
		printList(list);
		list= insert(list,1);
		list= insert(list,2);
		list= insert(list,3);
		deleteByKey(list, 3);
		deleteByKey(list, 10);
		list= insert(list,4);
		printList(list);
		System.out.println(isEmpty(list));
		System.out.println(list.head.data);
	}
}
