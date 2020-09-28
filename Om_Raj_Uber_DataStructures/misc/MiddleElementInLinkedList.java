package com.wipro.misc;

class MiddleElementInLinkedList 
{ 
	Node head; 

	
	class Node 
	{ 
		int data; 
		Node next; 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 

	
	void printMiddle() 
	{ 
		Node s = head; 
		Node f = head; 
		if (head != null) 
		{ 
			while (f != null && f.next != null) 
			{ 
				f = f.next.next; 
				s = s.next; 
			} 
			System.out.println("The middle element is " + 
								s.data); 
		} 
	} 

	
	public void push(int d) 
	{ 
		
		Node n = new Node(d); 

		
		n.next = head; 

		
		head = n; 
	} 

	
	public void printList() 
	{ 
		Node n = head; 
		while (n != null) 
		{ 
			System.out.print(n.data+"->"); 
			n = n.next; 
		} 
		System.out.println("NULL"); 
	} 

	public static void main(String [] args) 
	{ 
		MiddleElementInLinkedList l = new MiddleElementInLinkedList(); 
		for (int i=5; i>0; --i) 
		{ 
			l.push(i); 
			 
		} 
		l.printList(); 
		l.printMiddle();
	} 
} 

