package com.wipro.stack;

public class StackUsingLinkedlistDriver {
	public static void main(String[] args) {

		StackUsingLinkedlist sl = new StackUsingLinkedlist();

		sl.push(11);
		sl.push(22);
		sl.push(33);
		sl.push(44);

		sl.display();

		System.out.println("Top element is " + sl.peek());

		sl.pop();
		sl.pop();

		sl.display();

		System.out.printf("Top element is " + sl.peek());
	}
}
