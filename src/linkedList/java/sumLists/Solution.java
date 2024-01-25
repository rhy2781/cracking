package linkedList.java.sumLists;
import linkedList.java.utility;
import linkedList.java.Node;

public class Solution {
	public static void main(String []args){
		int[] init = new int[]{7, 1, 6};
		int[] init2 = new int[]{5, 9, 3};

		Node m = utility.createNodeFromArray(init);
		Node n = utility.createNodeFromArray(init2);

		System.out.println(m);
		System.out.println(n);
		iterativeApproach ia = new iterativeApproach();
		System.out.println(ia.sumLists(m, n));
	}
}
