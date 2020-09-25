package com.wipro.queue;

public class QueueUsingArrayDriver {

	public static void main(String[] args) {

		QueueUsingArray q = new QueueUsingArray(10);

		q.queueDisplay();

		q.queueEnqueue(10);
		q.queueEnqueue(20);
		q.queueEnqueue(30);
		q.queueEnqueue(40);
		q.queueEnqueue(50);
		q.queueEnqueue(60);
		q.queueEnqueue(70);
		q.queueEnqueue(80);
		q.queueEnqueue(90);
		q.queueEnqueue(100);

		q.queueDisplay();

		q.queueEnqueue(60);

		q.queueDisplay();

		q.queueDequeue();
		q.queueDequeue();
		System.out.printf("after two node deletion");

		q.queueDisplay();

		q.queueFront();
	}
}