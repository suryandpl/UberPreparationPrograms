package com.wipro.stack;
class StackUsingArrayDriver {
	public static void main(String args[]) {
		StackUsingArray s = new StackUsingArray();
		s.push(143);
		s.push(67);
		s.push(12);
		System.out.println(s.pop() + " Popped from stack");
		System.out.println(s.peek()+" Peeked from Stack");
	}
}