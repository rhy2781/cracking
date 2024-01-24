package arraysAndStrings.java.checkPermutation;

import java.util.Arrays;

public class sortingApproach {

	String sort(String s){
		char[] array = s.toCharArray();
		Arrays.sort(array);
		return new String(array);
	}

	public boolean checkPermutation(String s, String t){
		if(s.length() != t.length()) return false;

		return sort(s).equals(sort(t));
	}
}
