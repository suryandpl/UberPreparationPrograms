package javapro;

public class DoubleLinkedList {
	private DLinkedListNode head;

	private int size;


	public void addElementAtHead(DLinkedListNode element) {

		if(head==null) {
			head=element;
		}else {
			head.setPrev(element);
			element.setNext(head);
			head=element;		
		}
		size++;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return head==null;
	}

	public void forwardDisplay() {
		DLinkedListNode currentNode=head;
		System.out.print("Head <=>");
		while(currentNode!=null) {
			System.out.print(currentNode.getElement()+"<=>");	
			currentNode=currentNode.getNext();
		}
		System.out.print("null");
	}

	public void backwardDisplay() {
		DLinkedListNode currentNode=head;
		System.out.print("Tail <=>");
		while(currentNode.getNext()!=null) {
			currentNode=currentNode.getNext();
		}
		while(currentNode!=null) {
			System.out.print(currentNode.getElement()+"<=>");	
			currentNode=currentNode.getPrev();
		}
		System.out.print("null");
	}
	
	public DLinkedListNode removeHead() throws Exception {
		if(head == null) {
			throw new Exception("No Elements");
		}else {
			DLinkedListNode removeNode=head;
			removeNode.setNext(null);
			head=head.getNext();
			return removeNode;
		}
	}
}
