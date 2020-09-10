package javapro;




public class SingleLinkedList {

	private LinkedListNode head;

	private int size;

	public void addElementAtHead(LinkedListNode element) {

		if(head==null) {
			head=element;
		}else {
			element.setNext(head);
			head=element;
		}
		size++;
	}
	
	public void addElementAtTail(LinkedListNode element) {

		if(head==null) {
			head=element;
		}else {
			LinkedListNode currentNode=head;
			while(currentNode.getNext()!=null) {
				currentNode=currentNode.getNext();
			}
			currentNode.setNext(element);
		}
		size++;
	}

	public LinkedListNode removeHead() throws Exception {
		if(!isEmpty()) {
		LinkedListNode removeNode=head;
		head=head.getNext();
		size--;
		return removeNode;
		}else {
			throw new Exception("No Elements");
		}
	}
	
	public LinkedListNode removeTail() throws Exception{
		if(head==null) {
			throw new Exception("No Elements");
		}else {
			LinkedListNode currentNode=head;
			LinkedListNode prevNode=head;
			while(currentNode.getNext()!=null) {
				prevNode=currentNode;
				currentNode=currentNode.getNext();
			}
			prevNode.setNext(null);
			return currentNode;
		}
	}
	public boolean isEmpty() {
		return head==null;
	}

	public int getSize() {
		return size;
	}
	
	public void printLinked() {
		System.out.print("Head :->");
		LinkedListNode currentNode=head;
		while(currentNode!=null) {
			System.out.print(currentNode.getNumber()+"->");
			currentNode=currentNode.getNext();
		}
		System.out.print("null");
	}


}