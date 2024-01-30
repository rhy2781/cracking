package stacksAndQueues.java.threeInOne;

public class Solution {
	public static void main(String[] args){
		FixedStack<Integer> test = new FixedStack<>(5);

		testisEmptyisFull(test);

		System.out.println("populating stack");
		for(int i = 0; i < 15; i++){
			int stack = i / 5;
			test.push(i + 1, stack);
		}
		System.out.println(test);
		System.out.println();

		System.out.println("Testing push limit");
		for(int i = 0; i < 3; i++){
			try{
				test.push(-1, i);
			}
			catch (Exception e){
				System.out.println(e);
			}
		}
		System.out.println();

		testisEmptyisFull(test);

		System.out.println("testing pop stack");
		for(int i = 0; i < 15; i++){
			int stack = i / 5;
			test.pop(stack);
		}
		System.out.println(test);

		System.out.println("Testing pop limit");
		for(int i = 0; i < 3; i++){
			try{
				test.pop(i);
			}
			catch (Exception e){
				System.out.println(e);
			}
		}
		System.out.println();
	}

	private static void testisEmptyisFull(FixedStack<Integer> test) {
		System.out.println("Testing isEmpty and isFull");
		for(int i = 0; i < 3; i++){
			System.out.println("Testing stack #" + i);
			System.out.println("isEmtpy: " + test.isEmpty(i) + " isFull:" + test.isFull(i));
		}
		System.out.println();
	}
}
