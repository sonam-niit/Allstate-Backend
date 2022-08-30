package com.allstate.dsa;

public class Stack {

	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX];
	Stack() {
		top = -1; // there is no data in stack
	}
	boolean isEmpty() {
		return top < 0;
	}
	boolean push(int data) {
		if (top >= (MAX - 1)) {
			System.out.println("Stack overflow");
			return false;
		} else {
			a[++top] = data;
			System.out.println(data + " pushed into stack");
			return true;
		}
	}
	int pop() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			return a[top--];
		}
	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.pop();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.pop());
	}
}
