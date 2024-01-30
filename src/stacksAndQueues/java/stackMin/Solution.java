package stacksAndQueues.java.stackMin;

public class Solution {
	public static void main(String []args){
		minStack m = new minStack();
		m.push(1);
		m.push(2);
		m.push(3);
		m.push(4);
		System.out.println(m.peek());
		System.out.println(m.min());
		System.out.println(m);
		m.push(0);
		System.out.println(m.min());
		System.out.println(m.pop());
		System.out.println(m);
	}
}
