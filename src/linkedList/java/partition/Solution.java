package linkedList.java.partition;

import linkedList.java.utility;
import linkedList.java.Node;

public class Solution {
	public static void main(String [] args){
//		Integer[][] init = new Integer[][]{
//				{3, 1},
//				{5, 2},
//				{8, 3},
//				{5, 4},
//				{10, 5},
//				{2, 6},
//				{1, null}
//		};
		Integer[][] init = new Integer[][]{
				{18, 1},
				{5, 2},
				{8, 3},
				{5, 4},
				{10, 5},
				{2, 6},
				{1, null}
		};


		Node n = utility.createNodeFromDictionary(init);
		System.out.println(n);
		iterativeApproach ia = new iterativeApproach();
		Node res = ia.partition(n, 5);
		System.out.println(res);

	}
}
