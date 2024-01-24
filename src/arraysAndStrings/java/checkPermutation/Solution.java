package arraysAndStrings.java.checkPermutation;

public class Solution {
	public static void main(String[] args){
		String one = "abcdefg";
		String one_equal = "abfgdec";
		String one_not_equal = "asbfnc";

		frequencyApproach fa = new frequencyApproach();

		System.out.println(fa.checkPermutation(one, one_equal));
		System.out.println(fa.checkPermutation(one, one_not_equal));

		System.out.println("--------");
		sortingApproach sa = new sortingApproach();

		System.out.println(sa.checkPermutation(one, one_equal));
		System.out.println(sa.checkPermutation(one, one_not_equal));
	}
}
