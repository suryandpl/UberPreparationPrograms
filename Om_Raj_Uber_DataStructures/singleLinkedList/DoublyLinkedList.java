package com.wipro.singleLinkedList;

public class DoublyLinkedList {
	Node head;

	class Node {
		int data;
		Node prev;
		Node next;

		Node(int d) {
			data = d;
		}
	}

	public void addAtBeg(int data) {

		Node node = new Node(data);

		node.next = head;
		node.prev = null;

		if (head != null)
			head.prev = node;

		head = node;
	}

	void addAtEnd(int data) {

		Node node = new Node(data);

		Node last = head;

		node.next = null;

		if (head == null) {
			node.prev = null;
			head = node;
			return;
		}

		while (last.next != null)
			last = last.next;

		last.next = node;

		node.prev = last;
	}

	public void printlist(Node node) {
		Node last = null;
		System.out.println("Traversal in forward Direction");
		while (node != null) {
			System.out.print(node.data + " ");
			last = node;
			node = node.next;
		}
		System.out.println();
		System.out.println("Traversal in reverse direction");
		while (last != null) {
			System.out.print(last.data + " ");
			last = last.prev;
		}
	}

	void deleteNode(Node del) 
    { 
        if (head == null || del == null) { 
            return; 
        } 
  
        if (head == del) { 
            head = del.next; 
        } 
  
        if (del.next != null) { 
            del.next.prev = del.prev; 
        } 
  
        if (del.prev != null) { 
            del.prev.next = del.next; 
        } 

        return; 
    }
	public static void main(String[] args) {
		
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.addAtEnd(6);
		dll.addAtBeg(7);
		dll.addAtBeg(1);
		dll.addAtEnd(4);
		dll.deleteNode(dll.head); 

		System.out.println("Created DLL is: ");
		dll.printlist(dll.head);
	}
}
