package com.nt.stack;

public class Stack {
	int arr[] = null;
	int capacity = 5;
	int top = -1;

	public Stack() {
		this.arr = new int[capacity];
	}

	public Stack(int capacity) {
		this.capacity = capacity;
		this.arr = new int[capacity];
	}

	public void push(int data) {
		if (isFull()) {
			System.out.println("Stack is full can't insert");
			return;
		}
//		 top = top + 1;
		arr[++top] = data;
		System.out.println(data + "inserted into Stack ");
	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("stack is empty");
			return;
		}
		int data = arr[top--];
//		top = top - 1;
		System.out.println(data + "removed from stack");
	}

	public int peak() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return arr[top];
	}

	public boolean isFull() {
		return size() == capacity;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public int size() {
		return top + 1;
	}

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		System.out.println("Before Removing element ");
		System.out.println("Is satck is Full : " + s.isFull());
		System.out.println("Is satck is Empty : " + s.isEmpty());
		System.out.println(s.peak() + " peak from stack ");
		System.out.println(s.peak() + " peak from stack ");
		System.out.println("After Removing Element ");
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();

	}

}
