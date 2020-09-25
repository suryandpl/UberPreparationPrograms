package com.wipro.queue;

class QueueUsingLinkedList {
	QNode front, rear;

	public QueueUsingLinkedList() {
		this.front = this.rear = null;
	}

	void enqueue(int key) {

		QNode temp = new QNode(key);

		if (this.rear == null) {
			this.front = this.rear = temp;
			return;
		}

		this.rear.next = temp;
		this.rear = temp;
	}

	void dequeue() {

		if (this.front == null)
			return;

		QNode temp = this.front;
		this.front = this.front.next;

		if (this.front == null)
			this.rear = null;
	}
}