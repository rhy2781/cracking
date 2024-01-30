package stacksAndQueues.java.queueViaStacks;

public class Solution {
	public static void main(String[] args){
		MyQueue q = new MyQueue();
		for(int i =0; i < 10; i++){
			q.push(i);
			System.out.println(q);
		}


		for(int i = 0; i < 10; i++){
			System.out.println(q.pop());
		}
	}
}
