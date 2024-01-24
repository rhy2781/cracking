package arraysAndStrings.java.checkPermutation;

public class frequencyApproach {
	public boolean checkPermutation(String s, String t){
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
