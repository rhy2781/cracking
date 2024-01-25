package linkedList.java.palindrome;

import linkedList.java.Node;
import linkedList.java.utility;

public class Solution {
	public static void main(String[] args){
		int[] init = new int[]{1,2,3,4,5,4,3,2,1};
		int[] init2 = new int[]{1,2,3,4};

		Node palindrome = utility.createNodeFromArray(init);
		Node notPalindrome = utility.createNodeFromArray(init2);

		twoPointerApproach ta = new twoPointerApproach();
		System.out.println("Two pointer Approach");
		System.out.println(ta.isPalindrome(palindrome));
		System.out.println(ta.isPalindrome(notPalindrome));
		System.out.println("-----");

		System.out.println("frequency Approach");
		frequencyApproach fa = new frequencyApproach();
		System.out.println(fa.isPalindrome(palindrome));
		System.out.println(fa.isPalindrome(notPalindrome));


	}
}
