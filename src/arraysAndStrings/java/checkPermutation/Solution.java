package arraysAndStrings.java.checkPermutation;

import java.util.Arrays;
import static java.lang.System.out;

public class Solution {
	public static void main(String[] args){
		String one = "abcdefg";
		String one_equal = "abfgdec";
		String one_not_equal = "asbfnc";

		out.println("Counting approach");
		out.println(checkPermutationCount(one, one_equal));
		out.println(checkPermutationCount(one, one_not_equal));

		out.println();
		out.println("Sorting approach");
		out.println(checkPermutationSort(one, one_equal));
		out.println(checkPermutationSort(one, one_not_equal));
	}

	public static String sort(String s){
		char[] array = s.toCharArray();
		Arrays.sort(array);
		return new String(array);
	}

	public static boolean checkPermutationSort(String s, String t){
		if(s.length() != t.length()) return false;

		return sort(s).equals(sort(t));
	}

	public static boolean checkPermutationCount(String s, String t){
		if(s.length() != t.length()) return false;

		int[] counts = new int[128];
		for(int i = 0; i < s.length(); i++){
			counts[s.charAt(i)] += 1;
			counts[t.charAt(i)] -= 1;
		}

		for(int i: counts){
			if(i != 0) return false;
		}
		return true;
	}
}
