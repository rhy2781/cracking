package arraysAndStrings.isUnique;

public class booleanArrayApproach {
	public boolean isUnique(String s) {
		if (s.length() > 128) return false;

		boolean[] chars = new boolean[128];
		for(int i = 0; i < s.length(); i ++) {
			if(chars[s.charAt(i)]) return false;
			chars[s.charAt(i)] = true;
		}
		return true;
	}
}