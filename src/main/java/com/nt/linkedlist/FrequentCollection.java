package com.nt.linkedlist;

import org.springframework.util.ObjectUtils;

public class FrequentCollection {

	public Node Head;

	public static void main(String[] args) {
		FrequentCollection list = new FrequentCollection();

		list.addFirst(1);
		list.addFirst(2);
//	        list.insert(3, 3.03);
//	        list.insert(4, 4.04);
//	        list.insert(5, 5.05);

		list.printList();

	}

	public void addFirst(int data) {
		Node head = new Node(data, this.Head);
		Node temp = head;

		while (head != null) {
			temp = temp.next;

		}
	}

	public void addLast(int data) {
		if (Head == null) {
			addFirst(data);
		} else {
			Node temp = Head;
			while (temp.next != null) {
				temp = temp.next;
				temp.next = new Node(data, null);
			}
		}
	}

	public void insAfter(int data, int key) {
		Node temp = Head;
		while (temp != null && temp.data != key) {
			temp = temp.next;
		}
		if (temp != null) {
			temp.next = new Node(data, temp.next);
		}
	}

	public void printList() {
		Node currentLink = Head;
		System.out.print("List: ");
		while (currentLink != null) {
			currentLink.printLink();
			currentLink = currentLink.next;
		}
		System.out.println("");
	}
}
