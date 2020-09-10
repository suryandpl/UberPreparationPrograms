package javapro;



	public class SingleLinkedListTest {

		public static void main(String[] args) throws Exception {
			SingleLinkedList list=new SingleLinkedList();
			/*
			 * //list.addElementAtHead(new LinkedListNode(10)); list.addElementAtHead(new
			 * LinkedListNode(12)); list.addElementAtHead(new LinkedListNode(14));
			 * list.addElementAtTail(new LinkedListNode(9)); list.addElementAtTail(new
			 * LinkedListNode(8)); System.out.println("Size :"+list.getSize());
			 * list.printLinked();
			 */		list.removeTail();
			System.out.println("Size :"+list.getSize());
			list.printLinked();
			

		}

	
}
