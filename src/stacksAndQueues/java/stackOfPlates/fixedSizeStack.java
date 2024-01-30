package stacksAndQueues.java.stackOfPlates;

import java.util.Stack;

public class fixedSizeStack extends Stack<Integer> {
	private int capacity;
	private int size;

	public fixedSizeStack(int size){
		this.capacity = size;
		this.size = 0;
	}

	public boolean isFull(){
		return this.size == this.capacity;
	}

	public boolean isEmpty(){
		return this.size == 0;
	}

	public void push(int value){
		super.push(value);
		this.size ++;
	}

	public Integer pop(){
		this.size --;
		return super.pop();
	}

	public Integer peek(){
		return super.peek();
	}

	@Override
	public String toString(){
		return super.toString();
	}
}
