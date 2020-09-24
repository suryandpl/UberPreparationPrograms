package collection;

public class LinkedList {
	static Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.head=new Node(85);
		list.head.next=new Node(15);
		list.head.next.next=new Node(4);
		list.head.next.next.next=new Node(20);
		list.printList(head);
		head = list.reverse(head);
		System.out.println("after reverse");
		list.printList(head);



			}

	private Node reverse(Node node) {
		Node prev=null;
		Node current=node;
		Node next=null;
		while(current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		node=prev;
		return node;
	}

	private void printList(Node node) {
while(node !=null){
	System.out.println(node.data);
	node=node.next;
}
	}

}
