package javapro;

public class DLinkedListNode {
	private int element;

	private DLinkedListNode next;
	
	private DLinkedListNode prev;
	
	public DLinkedListNode(int element) {
		super();
		this.element = element;
	}

	public int getElement() {
		return element;
	}

	public void setElement(int element) {
		this.element = element;
	}

	public DLinkedListNode getNext() {
		return next;
	}

	public void setNext(DLinkedListNode next) {
		this.next = next;
	}

	public DLinkedListNode getPrev() {
		return prev;
	}

	public void setPrev(DLinkedListNode prev) {
		this.prev = prev;
	}
	
	

}
