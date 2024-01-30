package stacksAndQueues.java.queueViaStacks;

import java.util.Stack;

class MyQueue {

	private Stack<Integer> s, t;

	public MyQueue() {
		this.s = new Stack<>();
		this.t = new Stack<>();
	}

	public void push(int x) {
		while(this.s.size() != 0){
			this.t.push(this.s.pop());
		}
		this.s.push(x);
		while(this.t.size() != 0){
			this.s.push(t.pop());
		}
	}

	public int pop() {
		return this.s.pop();
	}

	public int peek() {
		return this.s.peek();
	}

	public boolean empty() {
		return this.s.size() == 0;
	}
	@Override
	public String toString(){
		return this.s.toString() + "<- top of stack";
	}
}