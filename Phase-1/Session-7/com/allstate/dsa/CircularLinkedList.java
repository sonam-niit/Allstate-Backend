package com.allstate.dsa;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class CircularLinkedList {

	//first Node
	Node head;
	public CircularLinkedList() {
		head=null;
	}
	void sortedInsert(Node newNode) {
		Node curr= head;
		if(curr==null) {
			newNode.next= newNode;
			head=newNode;
		}
		//inserting new node at beggining
		else if(curr.data>=newNode.data) {
			while(curr.next!=head)
				curr= curr.next;
			curr.next= newNode;
			newNode.next=head;
			head=newNode;
		}
		//insert new node in between or last position
		else {
			while(curr.next!=head && curr.next.data<newNode.data)
				curr=curr.next;
			newNode.next=curr.next;
			curr.next=newNode;
		}
	}
	
	public void printlist() {
		if(head!=null) {
			Node curr=head;
			do {
				System.out.print(curr.data+" ");
				curr=curr.next;
			}while(curr!=head);
		}
	}
	
	public static void main(String[] args) {
		
		CircularLinkedList list =new CircularLinkedList();
		list.sortedInsert(new Node(12));
		list.sortedInsert(new Node(56));
		list.sortedInsert(new Node(2));
		list.sortedInsert(new Node(11));
		list.sortedInsert(new Node(1));
		list.sortedInsert(new Node(90));
		
		list.printlist();
	}
	
}
