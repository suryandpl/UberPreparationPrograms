package com.wipro.singleLinkedList;

import java.util.Scanner;

class LinkedList {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void printList() {
		Node n;
		if (head == null) {
			return;
		}
		n=head;
		System.out.println("List is: ");
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	public Node createList() {
		int i, n, data;
		System.out.println("Enter the number of nodes:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		head = null;
		if (n == 0) {
			return head;
		}
		System.out.println("Enter the first element to be inserted");
		data = sc.nextInt();
		head = addAtBeg(data);
		for (i = 2; i <= n; i++) {
			System.out.println("Enter the "+i+"th element to be inserted");
			data = sc.nextInt();
			head = addAtEnd(head, data);
		}
		return head;
	}

	public Node addAtEnd(Node head, int data) {
		Node temp = new Node(data);
		if (head == null) {
			head = new Node(data);
			return head;
		}
		temp.next = null;
		Node last = head;
		while (last.next != null)
			last = last.next;
		last.next = temp;
		return head;
	}

	public Node addAtBeg(int data) {
		
		if(head==null) {
			head=new Node(data);
		}else {
			Node temp = new Node(data);
			temp.next = head;
			head = temp;
		}
		
		return head;
	}

	public Node removeFirstNode(Node head) {
		if (head == null)
			return head;

		Node temp = head;
		head = head.next;

		return head;
	}

	public Node removeLastNode(Node head) {
		Node temp;
		if (head == null) {
			System.out.println("List is empty");
			return head;
		}

		temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp=null;

		return head;
	}

	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.createList();
		list.printList();
		
		list.addAtBeg(12);
		list.addAtBeg(14);
//		list.addAtEnd(head, 55);
//		list.removeFirstNode(head);
//		list.removeLastNode(head);
		
		list.printList();
	}
}
