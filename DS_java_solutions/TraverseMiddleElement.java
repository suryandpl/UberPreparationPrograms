package ds_problems;

public class TraverseMiddleElement {

	private Node head;

	// In constructor, Initialize head attribute to null
	public TraverseMiddleElement() {
		this.head = null;
	}

	public Node insert(int data) {

		if (head == null) {
			head = new Node(data);

		} else {

			// Create a new node
			Node temp = new Node(data);
			// New node points to head
			temp.next = head;

			// Head points to a new node
			head = temp;
		}

		return head;
	}

	// Logic to print middle element of a linked list
	public void printMiddleElement() {

		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {

			slow = slow.next;
			fast = fast.next.next;
		}

		System.out.println(" Middle Element of a Linked List is " + slow.data);
	}

	public void print() {

		Node temp = head;

		while (temp != null) {
			System.out.println(temp.data);

			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		TraverseMiddleElement ll = new TraverseMiddleElement();

		ll.insert(6);
		ll.insert(5);
		ll.insert(8);
		ll.insert(9);
		ll.insert(15);

		ll.print();

		ll.printMiddleElement();
	}

}
