package stacksAndQueues.java.threeInOne;

import static java.lang.System.out;

public class Solution {
	public static void main(String[] args){
		fixedStack<Integer> test = new fixedStack<>(5);

		testisEmptyisFull(test);

		out.println("populating stack");
		for(int i = 0; i < 15; i++){
			int stack = i / 5;
			test.push(i + 1, stack);
		}
		out.println(test);
		out.println();

		out.println("peek Testing");
		for(int i = 0; i < 3; i++){
			try{
				out.println(test.peek(i));
			}
			catch (Exception e){
				out.println(e);
			}
		}
		out.println(test);

		out.println("Testing push limit");
		for(int i = 0; i < 3; i++){
			try{
				test.push(-1, i);
			}
			catch (Exception e){
				out.println(e);
			}
		}
		out.println();

		testisEmptyisFull(test);

		out.println("testing pop stack");
		for(int i = 0; i < 15; i++){
			int stack = i / 5;
			test.pop(stack);
		}
		out.println(test);

		out.println("Testing pop limit");
		for(int i = 0; i < 3; i++){
			try{
				test.pop(i);
			}
			catch (Exception e){
				out.println(e);
			}
		}
		out.println();
	}

	private static void testisEmptyisFull(fixedStack<Integer> test) {
		out.println("Testing isEmpty and isFull");
		for(int i = 0; i < 3; i++){
			out.println("Testing stack #" + i);
			out.println("isEmtpy: " + test.isEmpty(i) + " isFull:" + test.isFull(i));
		}
		out.println();
	}
}
