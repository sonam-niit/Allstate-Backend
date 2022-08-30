package com.allstate.dsa;

public class DLL {

	Node head;
	class Node {
		int data;
		Node prev;
		Node next;
		Node(int data){
			this.data=data;
			prev=null;
			next=null;
		}
	}
	
	//insert a node at first position
	public void push(int data) {
		Node newNode= new Node(data);
		//when the list is not empty
		if(head!=null) {
			newNode.next=head;
			head.prev=newNode;
		}
		head=newNode; //point the newNode at head position
	}
	//insert node after a perticular node
	public void insertAfter(Node prev_node,int data) {
		if(prev_node==null)
		{
			System.out.println("We can not insert a new node after null");
			return;
		}
		Node newNode= new Node(data);
		newNode.next=prev_node.next;
		prev_node.next=newNode;
		newNode.prev= prev_node;
		
		if(newNode.next!=null)
			newNode.next.prev= newNode;
	}
	//insert new node at last position
	public void append(int data) {
		Node newNode= new Node(data);
		//list is empty
		if(head==null)
		{
			push(data);
			return;
		}
		Node curr=head;
		while(curr.next!=null)
			curr=curr.next;
		curr.next=newNode;
		newNode.prev=curr;
	}
	public void printlist() {
		Node curr= head;
		Node last=null;
		System.out.println("Printed data in forward direction");
		while(curr!=null) {
			System.out.print(curr.data+" ");
			last=curr;
			curr=curr.next;
		}
		System.out.println();
		System.out.println("Printed data in Backward direction");
		while(last!=null) {
			System.out.print(last.data+" ");
			last=last.prev;
		}
	}
	
	public static void main(String[] args) {
		DLL dll= new DLL();
		dll.append(1);
		dll.push(20);
		dll.append(45);
		dll.insertAfter(dll.head, 8);
		dll.printlist();
	}
}
