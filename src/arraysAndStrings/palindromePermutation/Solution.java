package arraysAndStrings.palindromePermutation;

public class Solution {
	public static void main(String[] args){
		frequencyApproach fa = new frequencyApproach();
		String not_palindrome = "tacodate";
		String palindrome = "tacocat";
		String palindrome1 = "ta c %&oc at";

		System.out.println(fa.palindromePermutation(not_palindrome));
		System.out.println(fa.palindromePermutation(palindrome));
		System.out.println(fa.palindromePermutation(palindrome1));
	}
}
