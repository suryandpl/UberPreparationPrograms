package com.wipro.misc;

class SafeStackImpl extends StackImpl implements ISafeStack{
	int capacity;
	public SafeStackImpl(int capacity) {
		super(capacity);
		
	}

	@Override
	public boolean isEmpty() {
		if(tos<0) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public boolean isFull() {
		if(tos>=capacity) {
			return true;
		}else {
			return false;
		}
	}

}
