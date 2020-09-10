package javapro;

public class DoubleLinkedList1Test {

	public static void main(String[] args) {
		  DoubleLinkedList d=new DoubleLinkedList();
		  d.addElementAtHead(new DLinkedListNode(10));
		  d.addElementAtHead(new DLinkedListNode(12));
		  d.forwardDisplay();
		  System.out.println("");
		  d.backwardDisplay();
		}
}
