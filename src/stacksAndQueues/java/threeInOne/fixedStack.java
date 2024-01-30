package stacksAndQueues.java.threeInOne;

import java.util.Arrays;
import java.util.EmptyStackException;

public class fixedStack<E> {
	private Object[] data;
	private int stackNumber = 3;
	private int[] indexes;
	private int stackCapacity;

	public fixedStack(int size){
		this.data = new Object[size * 3];
		this.indexes = new int[stackNumber];
		this.stackCapacity = size;
		this.indexes[0] = -1;
		this.indexes[1] = 4;
		this.indexes[2] = 9;
	}

	public boolean isEmpty(int stack){
		return this.indexes[stack] == stack * stackCapacity - 1;
	}

	public boolean isFull(int stack){
		return this.indexes[stack] == (stack + 1) * stackCapacity - 1;
	}

	public void push(E item, int stack){
		if(isFull(stack)) throw new IllegalStateException("Stack is full");
		this.indexes[stack] += 1;
		int index = this.indexes[stack];
		this.data[index] = item;
	}

	@SuppressWarnings("unchecked")
	public E pop(int stack){
		if(isEmpty(stack)) throw new EmptyStackException();
		int index = this.indexes[stack];
		Object res = this.data[index];
		this.indexes[stack] -= 1;
		this.data[index] = null;
		return (E) res;
	}

	@SuppressWarnings("unchecked")
	public E peek(int stack){
		if(isEmpty(stack)) throw new EmptyStackException();
		int index = this.indexes[stack];
		Object res = this.data[index];
		this.indexes[stack] -= 1;
		return (E) res;
	}

	@Override
	public String toString(){
		StringBuilder s = new StringBuilder();
		s.append("Index Tracker: ");
		s.append(Arrays.toString(this.indexes));
		s.append("\n");

		for(int i = 0; i < this.data.length; i++){
			if(i % stackCapacity == 0 && i != 0) s.append("\n");
			if(this.data[i] == null) s.append("--,");
			else s.append(String.format("%2s,", this.data[i]));
		}
		return s.toString();
	}
}
