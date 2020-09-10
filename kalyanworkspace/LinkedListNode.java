package javapro;

public class LinkedListNode {
private int number;
	
	private LinkedListNode next;
	
	public LinkedListNode(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public LinkedListNode getNext() {
		return next;
	}

	public void setNext(LinkedListNode next) {
		this.next = next;
	}
}
