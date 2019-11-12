package com.nt.linkedlist;

public class Node {
	public int data;
	Node next;

	public Node(int data, Node node) {
		super();
		this.data = data;
		this.next = node;
	}

	@Override
	public String toString() {
		return data + "";
	}

	public void printLink() {
		System.out.print("{" + data + "} ");
	}

}
