package stacksAndQueues.java.stackMin;

import java.util.Stack;

public class minStack extends Stack<Integer>{
	Stack<Integer> s;
	public minStack(){
		s = new Stack<>();
	}

	public int min(){
		if(s.isEmpty()) return Integer.MAX_VALUE;
		return s.peek();
	}

	public void push(int value){
		super.push(value);
		if(value < min()) s.push(value);
		else s.push(s.peek());
	}

	public Integer pop(){
		s.pop();
		return super.pop();
	}
}
