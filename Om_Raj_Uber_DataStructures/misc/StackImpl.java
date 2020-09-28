package com.wipro.misc;

class StackImpl implements IStack {
	protected Object stackArray[];
	protected int tos;

	public StackImpl(int capacity) {
		stackArray = new Object[capacity];
		tos = -1;
	}

	@Override
	public void push(Object obj) {

		stackArray[++tos] = obj;

	}

	@Override
	public Object pop() {

		Object x = stackArray[tos--];
		return x;

	}

	public Object peek() {

		Object x = stackArray[tos];
		return x;

	}

}
