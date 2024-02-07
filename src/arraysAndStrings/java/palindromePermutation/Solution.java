package arraysAndStrings.java.palindromePermutation;

import static java.lang.System.out;

public class Solution {
	public static void main(String[] args){
		String not_palindrome = "tacodate";
		String palindrome = "tacocat";
		String palindrome1 = "ta c %&oc at";

		out.println("Bit Vector Approach");
		out.println(palindromePermutationBitVector(not_palindrome));
		out.println(palindromePermutationBitVector(palindrome));
		out.println(palindromePermutationBitVector(palindrome1));


		out.println("Counting Approach");
		out.println(palindromePermutationCount(not_palindrome));
		out.println(palindromePermutationCount(palindrome));
		out.println(palindromePermutationCount(palindrome1));
	}

	public static boolean palindromePermutationBitVector(String s) {
		int vector = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if ('a' <= c && c <= 'z') {
				int shift = 1 << (c - 'a');
				vector ^= shift;
			}
		}
		return (vector & (vector - 1))== 0;
	}

	public static boolean palindromePermutationCount(String s) {
		int[] count = new int[26];
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if('a' < c && c < 'z') count[s.charAt(i) - 'a']++;
		}

		boolean oneLimit = false;
		for(int i: count) {
			if (i % 2 != 0) {
				if (oneLimit) return false;
				oneLimit = true;
			}
		}
		return true;
	}
}
