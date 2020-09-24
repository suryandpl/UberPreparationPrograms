package test;

import java.util.List;

public class LinkedList {
	static Node head;
	static class Node{
		int data;
		Node next;
		public Node(int d){
			data =d;
			next = null;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
     LinkedList list = new LinkedList();
     list.head= new Node(1);
     list.head.next=new Node(2);
     list.head.next.next= new Node(3);
     list.head.next.next.next= new Node(4);
     list.head.next.next.next.next= new Node(5);
     print(head);
     findMiddle(head);
     
     
	}

	private static void findMiddle(Node head2) {
     Node slow_ptr = head;
     Node fast_ptr = head;
     if(head !=null){
    	 while(fast_ptr !=null && fast_ptr.next !=null){
    		 fast_ptr = fast_ptr.next.next;
    		 slow_ptr = slow_ptr.next;
    	 }
    	 System.out.println("the middle element is : "+slow_ptr.data);
     }
	}

	private static void print(Node node) {
		while(node!=null){
			System.out.println(node.data);
			node=node.next;
		}
      	
	}

}
