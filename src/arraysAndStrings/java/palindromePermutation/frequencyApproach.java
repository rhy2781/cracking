package arraysAndStrings.java.palindromePermutation;

public class frequencyApproach {

	public boolean palindromePermutation(String s) {
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
