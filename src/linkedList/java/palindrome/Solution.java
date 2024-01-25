package linkedList.java.palindrome;

import linkedList.java.utility;
import linkedList.java.Node;

public class Solution {
	public static void main(String [] args){
		int[] init = new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1};
		int[] init2 = new int[]{1,2,3,4};
		Node palindrome = utility.createNodeFromArray(init);
		Node notPalindrome = utility.createNodeFromArray(init2);

		reverseApproach ra = new reverseApproach();
		System.out.println("Reverse Approach");
		System.out.println(ra.isPalindrome(palindrome));
		System.out.println(ra.isPalindrome(notPalindrome));
		System.out.println("-----");

		stackApproach sa = new stackApproach();
		System.out.println("Stack Approach");
		System.out.println(sa.isPalindrome(palindrome));
		System.out.println(sa.isPalindrome(notPalindrome));
	}
}
